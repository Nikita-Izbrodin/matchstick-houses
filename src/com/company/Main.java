package com.company;

import java.util.*;

public class Main {

    public static void calc_match_stick(int house){
        int matchNum = house*6;
        if (house > 1) {
            matchNum = matchNum - (house-1);
        }
        System.out.println(matchNum);
    }

    public static void main(String[] args) {
        int house = new Scanner(System.in).nextInt();
        calc_match_stick(house);
    }
}
