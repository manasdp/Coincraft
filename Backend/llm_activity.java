package com.example.financialassistant;

import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

import org.json.JSONException;
import org.json.JSONObject;

import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class llm_activity extends AppCompatActivity {

    private EditText questionInput;
    private Button askButton;
    private TextView responseText;

    private static final String LLM_API_URL = "https://your-llm-api-endpoint.com/query"; // Replace with your LLM API URL
    private static final MediaType JSON = MediaType.get("application/json; charset=utf-8");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        questionInput = findViewById(R.id.question_input);
        askButton = findViewById(R.id.ask_button);
        responseText = findViewById(R.id.response_text);

        askButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String question = questionInput.getText().toString();
                new QueryLLMTask().execute(question);
            }
        });
    }

    private class QueryLLMTask extends AsyncTask<String, Void, String> {
        @Override
        protected String doInBackground(String... params) {
            String question = params[0];
            return queryLLM(question);
        }

        @Override
        protected void onPostExecute(String result) {
            responseText.setText(result);
        }

        private String queryLLM(String question) {
            OkHttpClient client = new OkHttpClient();
            JSONObject json = new JSONObject();
            try {
                json.put("question", question);
            } catch (JSONException e) {
                e.printStackTrace();
            }

            RequestBody body = RequestBody.create(json.toString(), JSON);
            Request request = new Request.Builder()
                    .url(LLM_API_URL)
                    .post(body)
                    .build();

            try (Response response = client.newCall(request).execute()) {
                if (!response.isSuccessful()) throw new IOException("Unexpected code " + response);
                return response.body().string(); // Return the response body from the LLM
            } catch (IOException e) {
                e.printStackTrace();
                return "Error retrieving response.";
            }
        }
    }
}
