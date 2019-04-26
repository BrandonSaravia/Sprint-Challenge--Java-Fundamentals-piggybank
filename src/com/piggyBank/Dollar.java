package com.piggyBank;

public class Dollar implements MoneyInterface {
    private int value = 100;
    private int coinAmount;

    public Dollar(int coinAmount) {
        this.coinAmount = coinAmount;
    }
    public Dollar() {
        coinAmount = 1;
    }

    @Override
    public int getValue() {
        return value * this.coinAmount;
    }

    @Override
    public void removeCoins(int coinsRemoved) {
        this.coinAmount -= coinsRemoved;
    }
}
