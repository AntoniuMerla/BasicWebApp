package de.tum.in.ase.eist;

import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class QueryProcessor {

    public String process(String query) {
        query = query.toLowerCase();
        if (query.contains("shakespeare")) {
            return "William Shakespeare (26 April 1564 - 23 April 1616) was an " +
                    "English poet, playwright, and actor, widely regarded as the greatest " +
                    "writer in the English language and the world's pre-eminent dramatist.";
        } else if (query.contains("name")) {
            return "MyTeam";
        } else { // TODO extend the programm here
            if (query.contains("what is ")) {
                String[] question = query.split("what is ");
                if (question[1].equals("your name")) {
                    return "Antoniu";
                }
                if (question[1].contains("plus")) {
                    String[] numbers = question[1].split(" plus ");
                    int number0 = Integer.parseInt(numbers[0]);
                    int number1 = Integer.parseInt(numbers[1]);
                    number1 = number0 + number1;
                    return String.valueOf(number1);
                }
            }
            if (query.contains("which of the following numbers is the largest: ")) {
                String[] numberList = query.split("which of the following numbers is the largest: ");
                String[] numbers = numberList[1].split(", ");
                int maximum = Integer.MIN_VALUE;
                for (String number : numbers) {
                    int intValue = Integer.parseInt(number);
                    if (maximum < intValue) ;
                    {
                        maximum = intValue;
                    }
                }
                return String.valueOf(maximum);
            }
            return "";
        }
    }
}
