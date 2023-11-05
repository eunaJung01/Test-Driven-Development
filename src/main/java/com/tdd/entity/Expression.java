package com.tdd.entity;

public interface Expression {

    // Money에 대한 통화 변환을 수행
    Money reduce(String to);

}
