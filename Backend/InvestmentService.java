package com.example.investment.service;

import com.example.investment.model.InvestmentRequest;
import com.example.investment.model.InvestmentResponse;
import org.springframework.stereotype.Service;

@Service
public class InvestmentService {

    public InvestmentResponse getRiskProfile(InvestmentRequest request) {
        // Mock implementation for demo purposes
        InvestmentResponse response = new InvestmentResponse();
        response.setRiskLevel("Moderate");
        response.setRecommendations("Consider investing in diversified index funds.");
        return response;
    }
}
