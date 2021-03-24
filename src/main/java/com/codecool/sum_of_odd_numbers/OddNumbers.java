package com.codecool.sum_of_odd_numbers;

import java.util.List;

public class OddNumbers {

    public static Integer sum(List<Integer> numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) % 2 == (numbers.get(i) < 0 ? -1 : 1)) {
                sum += numbers.get(i);
            }
        }
        return sum;
    }
}