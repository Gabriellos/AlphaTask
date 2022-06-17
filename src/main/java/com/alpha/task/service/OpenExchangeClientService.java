package com.alpha.task.service;

import com.alpha.task.entity.Exchange;
import com.alpha.task.model.OpenExchangeGetParameters;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.cloud.openfeign.SpringQueryMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "openExchangeAPI", url = "${openExchangeAPI.api.baseurl}")
public interface OpenExchangeClientService {

    @GetMapping("/latest.json")
    public Exchange getLatest(@SpringQueryMap OpenExchangeGetParameters parameters);

    @GetMapping("/historical/{date}")
    public Exchange getExchangeOnPreviousDate(@SpringQueryMap OpenExchangeGetParameters parameters ,
                                              @PathVariable String date);
}
