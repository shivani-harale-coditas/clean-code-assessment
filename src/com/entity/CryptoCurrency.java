package com.entity;

public class CryptoCurrency {

    private String name;
    private Long currentPrice;
    private String marketCap;
    private Long volume;

    public CryptoCurrency(String name, Long currentPrice, String marketCap, Long volume) {
        this.name = name;
        this.currentPrice = currentPrice;
        this.marketCap = marketCap;
        this.volume = volume;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getCurrentPrice() {
        return currentPrice;
    }

    public void setCurrentPrice(Long currentPrice) {
        this.currentPrice = currentPrice;
    }

    public String getMarketCap() {
        return marketCap;
    }

    public void setMarketCap(String marketCap) {
        this.marketCap = marketCap;
    }

    public Long getVolume() {
        return volume;
    }

    public void setVolume(Long volume) {
        this.volume = volume;
    }
}
