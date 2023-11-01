package com.tdd;

import com.tdd.entity.Dollar;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class MoneyTest {

    @Test
    public void testMultiplication_1() {
        Dollar five = new Dollar(5);
        five.times(2);
        assertThat(10).isEqualTo(five.amount);
    }

}
