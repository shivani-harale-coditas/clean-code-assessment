package com.controller;

import com.service.DashboardService;

@Controller("/api")
public class CryptoCurrencyTrackerController {

    @Autowire
    private DashboardService dashboardService;

    @PostMapping("save-currency")
    public ResponseEntity saveCurrency(@RequestBody CryptoCurrency cryptoCurrency){
        try {
            dashboardService.save(cryptoCurrency);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new ResponseEntity("Successfully saved");
    }

    @GetMapping("compare-currency")
    public ResponseEntity compareCurrency(@RequestParam List<CryptoCurrency> list){
        try {
            dashboardService.compare(list);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new ResponseEntity("Successfully compared");
    }

    @GetMapping("view-currency-graph")
    public ResponseEntity viewCurrencyGraph(@RequestParam String timePeriod){
        try {
            dashboardService.viewCurrencyGraph(timePeriod);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new ResponseEntity("Successfully compared");
    }

}
