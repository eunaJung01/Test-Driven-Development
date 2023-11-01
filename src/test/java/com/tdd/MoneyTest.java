package com.tdd;

import com.tdd.entity.Dollar;
import com.tdd.entity.Franc;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class MoneyTest {

    @Test
    public void testMultiplication_4() {
        Dollar five = new Dollar(5);
        assertThat(new Dollar(10)).isEqualTo(five.times(2));
        assertThat(new Dollar(15)).isEqualTo(five.times(3));
    }

    @Test
    public void testEquality_6() {
        assertThat(new Dollar(5)).isEqualTo(new Dollar(5));
        assertThat(new Dollar(5)).isNotEqualTo(new Dollar(6));
        assertThat(new Franc(5)).isEqualTo(new Franc(5));
        assertThat(new Franc(5)).isNotEqualTo(new Franc(6));
    }

    @Test
    public void testFrancMultiplication() {
        Franc five = new Franc(5);
        assertThat(new Franc(10)).isEqualTo(five.times(2));
        assertThat(new Franc(15)).isEqualTo(five.times(3));
    }

}
