package com.piggyBank;

public class Penny implements MoneyInterface {
    private int value = 1;
    private int coinAmount;

    public Penny(int coinAmount) {
        this.coinAmount = coinAmount;
    }
    public Penny() {
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
