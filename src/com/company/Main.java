package com.company;

import java.util.Scanner;

@SuppressWarnings("ALL")
public class Main {


    public static class NumberToWordsConverter {

        public static final String[] units = {"", "One", "Two", "Three", "Four",
                "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven", "Twelve",
                "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen",
                "Eighteen", "Nineteen"};

        public static final String[] tens = {
                "",        // 0
                "",        // 1
                "Twenty",    // 2
                "Thirty",    // 3
                "Forty",    // 4
                "Fifty",    // 5
                "Sixty",    // 6
                "Seventy",    // 7
                "Eighty",    // 8
                "Ninety"    // 9
        };

        public static String convert(final int n) {
            if (n < 0) {
                return "Out of ability";
            }

            if (n < 20) {
                return units[n];
            }

            if (n < 100) {
                return tens[n / 10] + ((n % 10 != 0) ? " " : "") + units[n % 10];
            }

            if (n < 1000) {
                return units[n / 100] + " Hundred" + ((n % 100 != 0) ? " " : "") + convert(n % 100);
            } else {
                return "Out of ability";
            }

        }
    }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Input your number:");
            int n = sc.nextInt();
            final NumberToWordsConverter numberToWordsConverter = new NumberToWordsConverter();
            System.out.println(numberToWordsConverter.convert(n));
        }

}
