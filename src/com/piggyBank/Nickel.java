package com.piggyBank;

public class Nickel implements MoneyInterface {
    private int value = 5;
    private int coinAmount;

    public Nickel(int coinAmount) {
        this.coinAmount = coinAmount;
    }
    public Nickel() {
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
