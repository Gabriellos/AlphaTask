package com.alpha.task;

import com.alpha.task.controller.CurrencyController;
import com.alpha.task.service.ExchangeService;
import static org.assertj.core.api.Assertions.assertThat;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
@SpringBootTest
class TestCurrencyController {
    @Autowired
    private CurrencyController currencyController;

    @Autowired
    private ExchangeService exchangeService;

    @Test
    public void testController() throws Exception {
        assertThat(currencyController.getGif()).toString().contains("giphy.com");
    }
}
