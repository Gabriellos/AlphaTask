package com.alpha.task.controller;

import com.alpha.task.service.ExchangeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/result")
public class CurrencyController {
    @Autowired
    private ExchangeService exchangeService;

    @Value("${code}")
    private String currencyCode;

    @GetMapping
    public String getGif() {
        return "redirect:" + exchangeService.getCurrencyState(currencyCode);
    }
}