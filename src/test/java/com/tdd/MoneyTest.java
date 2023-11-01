package com.tdd;

import com.tdd.entity.Franc;
import com.tdd.entity.Money;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class MoneyTest {

    @Test
    public void testMultiplication_8() {
        Money five = Money.dollar(5);
        assertThat(Money.dollar(10)).isEqualTo(five.times(2));
        assertThat(Money.dollar(15)).isEqualTo(five.times(3));
    }

    @Test
    public void testEquality_8() {
        assertThat(Money.dollar(5)).isEqualTo(Money.dollar(5));
        assertThat(Money.dollar(5)).isNotEqualTo(Money.dollar(6));
        assertThat(new Franc(5)).isEqualTo(new Franc(5));
        assertThat(new Franc(5)).isNotEqualTo(new Franc(6));
        assertThat(new Franc(5)).isNotEqualTo(Money.dollar(5));
    }

    @Test
    public void testFrancMultiplication() {
        Franc five = new Franc(5);
        assertThat(new Franc(10)).isEqualTo(five.times(2));
        assertThat(new Franc(15)).isEqualTo(five.times(3));
    }

}
