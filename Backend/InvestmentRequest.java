package com.example.investment.model;

public class InvestmentRequest {
    private String userId;
    private double[] portfolio;

    // Getters and Setters
    public String getUserId() {
        return userId;
    }
    public void setUserId(String userId) {
        this.userId = userId;
    }
    public double[] getPortfolio() {
        return portfolio;
    }
    public void setPortfolio(double[] portfolio) {
        this.portfolio = portfolio;
    }
}
