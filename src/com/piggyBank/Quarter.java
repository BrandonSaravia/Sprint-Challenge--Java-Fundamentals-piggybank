package com.piggyBank;

public class Quarter implements MoneyInterface {
    private int value = 25;
    private int coinAmount;

    public Quarter(int coinAmount) {
        this.coinAmount = coinAmount;
    }
    public Quarter() {
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
