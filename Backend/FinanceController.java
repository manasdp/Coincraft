package com.example.controller;

import com.example.model.UserQuery;
import com.example.model.RecommendationResponse;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays; // Example static recommendations

@RestController
@RequestMapping("/api/finance")
public class FinanceController {

    @PostMapping("/recommendations")
    public RecommendationResponse getRecommendations(@RequestBody UserQuery userQuery) {
        // Dummy implementation; replace with actual logic
        String query = userQuery.getQuery();
        
        // Here you would integrate OpenAI's GPT-3.5 Turbo for real recommendations
        // For now, return some static recommendations as an example
        return new RecommendationResponse(Arrays.asList("Save 20% of your income", "Set a budget for entertainment", "Track your spending habits"));
    }
}
