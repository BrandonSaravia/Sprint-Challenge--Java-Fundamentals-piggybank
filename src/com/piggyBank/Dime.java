package com.piggyBank;

public class Dime implements MoneyInterface {
    private int value = 10;
    private int coinAmount;

    public Dime(int coinAmount) {
        this.coinAmount = coinAmount;
    }
    public Dime() {
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
