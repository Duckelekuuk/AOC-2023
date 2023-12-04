package com.duckelekuuk.day1;

import com.duckelekuuk.aoc.annotations.*;

import java.util.*;
import java.util.stream.Stream;

import static java.lang.Character.isDigit;

@AOCDay(day = 1)
public class Day1 {

    @AOCInput
    private List<String> input;

    @AOCSample("""
            1abc2
            pqr3stu8vwx
            a1b2c3d4e5f
            treb7uchet
            """)
    @AOCPartOne(useSample = true)
    public String getPart1() {
        int sum = 0;

        for (String line : input) {
            String digit = "";

            for (int i = 0; i < line.length(); i++) {
                char c = line.charAt(i);
                if (Character.isDigit(c)) {
                    digit += c;
                    break;
                }
            }
            for (int i = line.length() - 1; i >= 0; i--) {
                char c = line.charAt(i);
                if (Character.isDigit(c)) {
                    digit += c;
                    break;
                }
            }

            sum += Integer.parseInt(digit);
        }

        return String.valueOf(sum);
    }


    @AOCSample("""
            two1nine
            eightwothree
            abcone2threexyz
            xtwone3four
            4nineeightseven2
            zoneight234
            7pqrstsixteen
            """)
    @AOCPartTwo
    public String getPart2() {
        int sum = 0;

        String[] digitMap = """
                one
                two
                three
                four
                five
                six
                seven
                eight
                nine
                """.split("\n");

        Arrays.stream(digitMap).
                map()
    }
}
