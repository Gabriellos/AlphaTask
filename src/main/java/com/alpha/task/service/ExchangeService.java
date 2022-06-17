package com.alpha.task.service;

import com.alpha.task.entity.Exchange;
import com.alpha.task.model.OpenExchangeGetParameters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Service
public class ExchangeService {

    @Autowired
    private OpenExchangeClientService openExchangeClientService;

    @Autowired
    private ReturnRandomGifService returnRandomGifService;

    public String getCurrencyState(String code) {
        OpenExchangeGetParameters queryParams = new OpenExchangeGetParameters();
        Exchange currentDate = openExchangeClientService.getLatest(queryParams);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String yesterday = LocalDateTime.now().plusDays(-1).format(formatter) + ".json";

        Exchange previousDate = openExchangeClientService.getExchangeOnPreviousDate(queryParams, yesterday);

        try {
            if (currentDate.getRates().get(code) > previousDate.getRates().get(code))
                return returnRandomGifService.getRandomGifURL("rich");
            else
                return returnRandomGifService.getRandomGifURL("broke");
        } catch (Exception e) {
            return "Неизвестный код валюты";
        }
    }
}
