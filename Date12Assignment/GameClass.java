package Date12Assignment;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GameClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string to calculate the score");
        String entered = sc.nextLine();
        String[] splittedOnSpace = entered.split("\\s+");
        List<Integer> addedValues = new ArrayList<>();
        int score = 0;


        for (String str : splittedOnSpace) {
            try {
                // checking it is a number
                int num = Integer.parseInt(str);
                if (num >= -999 && num <= 999) {
                    score += num;
                    addedValues.add(num);
                    System.out.println("added"+" "+ num +" "+ score);
                }
            } catch (NumberFormatException e) {
                // if it is c remove the previous number
                if (str.equalsIgnoreCase("C")) {
                    if (!addedValues.isEmpty()) {
                        int last = addedValues.remove(addedValues.size() - 1);
                        score -= last;
                        System.out.println("ignored the value from" + score);

                    }
                    // if it is d ,double the previous values
                } else if (str.equalsIgnoreCase("D")) {
                    if (!addedValues.isEmpty()) {
                        int last = addedValues.get(addedValues.size() - 1);
                        int doubled = last * 2;
                        score += doubled;
                        addedValues.add(doubled);

                    }
                    // it it is plua add to last two values added
                } else if (str.equals("+")) {
                    if (addedValues.size() >= 2) {
                        int last = addedValues.get(addedValues.size() - 1);
                        int secondLast = addedValues.get(addedValues.size() - 2);
                        int sum = last + secondLast;
                        score += sum;
                        addedValues.add(sum);

                    }
                }
            }
        }
        System.out.println("\nFinal Score: " + score);
        System.out.println(addedValues);
    }
}