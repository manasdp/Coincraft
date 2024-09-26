package com.example.investment;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    private EditText userIdInput, portfolioInput;
    private TextView recommendationOutput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        userIdInput = findViewById(R.id.userIdInput);
        portfolioInput = findViewById(R.id.portfolioInput);
        recommendationOutput = findViewById(R.id.recommendationOutput);
        Button submitButton = findViewById(R.id.submitButton);

        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String userId = userIdInput.getText().toString();
                String[] portfolioStr = portfolioInput.getText().toString().split(",");
                double[] portfolio = new double[portfolioStr.length];
                for (int i = 0; i < portfolioStr.length; i++) {
                    portfolio[i] = Double.parseDouble(portfolioStr[i].trim());
                }

                InvestmentRequest request = new InvestmentRequest();
                request.setUserId(userId);
                request.setPortfolio(portfolio);
                callInvestmentAPI(request);
            }
        });
    }

    private void callInvestmentAPI(InvestmentRequest request) {
        InvestmentService service = RetrofitClientInstance.getRetrofitInstance().create(InvestmentService.class);
        Call<InvestmentResponse> call = service.getRiskProfile(request);
        call.enqueue(new Callback<InvestmentResponse>() {
            @Override
            public void onResponse(Call<InvestmentResponse> call, Response<InvestmentResponse> response) {
                if (response.isSuccessful()) {
                    recommendationOutput.setText(response.body().getRecommendations());
                } else {
                    recommendationOutput.setText("Error retrieving data.");
                }
            }

            @Override
            public void onFailure(Call<InvestmentResponse> call, Throwable t) {
                recommendationOutput.setText("Network error.");
            }
        });
    }
}
