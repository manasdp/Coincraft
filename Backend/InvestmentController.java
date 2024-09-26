package com.example.investment.controller;

import com.example.investment.model.InvestmentRequest;
import com.example.investment.model.InvestmentResponse;
import com.example.investment.service.InvestmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/investment")
public class InvestmentController {

    @Autowired
    private InvestmentService investmentService;

    @PostMapping("/profile")
    public InvestmentResponse getRiskProfile(@RequestBody InvestmentRequest request) {
        return investmentService.getRiskProfile(request);
    }
}
