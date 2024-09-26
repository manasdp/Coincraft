package com.example.investment.model;

public class InvestmentResponse {
    private String riskLevel;
    private String recommendations;

    // Getters and Setters
    public String getRiskLevel() {
        return riskLevel;
    }
    public void setRiskLevel(String riskLevel) {
        this.riskLevel = riskLevel;
    }
    public String getRecommendations() {
        return recommendations;
    }
    public void setRecommendations(String recommendations) {
        this.recommendations = recommendations;
    }
}
