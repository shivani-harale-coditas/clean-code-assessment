package com.service;

import java.util.List;

public class DashboardService {

    @Autowire
    private CryptoCurrencyRepository cryptoCurrencyRepository;

    public void save(CryptoCurrency cryptoCurrency) {
        try {
            CryptoCurrencyRepository.save(cryptoCurrency);
        } catch (Exception e) {
            throw new Exception("Invalid name format");
        }
    }
    public void compare(List<CryptoCurrency> list) {
        if (list[0].currentPrice > list[1].currentPrice) {
            System.out.println(list[0].name + " has better current market value");
        } else {
            System.out.println(list[1].name + " has better current market value");
        }
    }
    public void viewCurrencyGraph(String timePeriod) {
        //TODO: display graph logic
    }

}
