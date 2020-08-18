package com.taa2020.day6;

public class BasicCalculator {

//    public Integer add(Integer a, Integer b){
//        return a + b;
//    }

    public Integer add(Integer ... numbers){
        Integer sum = 0;

        for(Integer n : numbers){
            sum+=n;
        }
        return sum;
    }

    public Double add(Double ... numbers){
        Double sum = 0.0;

        for(Double n : numbers){
            sum+=n;
        }
        return sum;
    }

    public Integer oduzimanje(Integer ... numbers){
        Integer sum = numbers[0];

        for(int i = 1; i < numbers.length; i++){
            sum-=numbers[i];
        }
        return sum;
    }
//stepenovanje
    //faktorijel
    //po izboru
}
