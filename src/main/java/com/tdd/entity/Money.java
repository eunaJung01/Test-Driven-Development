package com.tdd.entity;

public abstract class Money {

    protected int amount;

    public abstract Money times(int multiplier);

    // factory method
    public static Dollar dollar(int amount) {
        return new Dollar(amount);
    }

    // factory method
    public static Money franc(int amount) {
        return new Franc(amount);
    }

    @Override
    public boolean equals(Object object) {
        Money money = (Money) object;
        return amount == money.amount && getClass().equals(money.getClass());
    }

}
