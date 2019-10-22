package main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {

  public static void main(String[] args) {
    List<Integer> numbers = Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14);
    //Exercise 1
    numbers.stream().filter(x -> x % 2 == 0 && x > 0).forEach(System.out::println);

    System.out.println("----------------------------");

    //Exercise 2
    numbers.stream()
        .filter(x -> x > 0)
        .map(x -> x * x)
        .forEach(System.out::println);

    System.out.println("----------------------------");

    //Exercise 3
    List<Integer> numbers3 = Arrays.asList(3, 9, 2, 8, 6, 5);
    numbers3.stream()
        .map(x -> x * x)
        .filter(x -> x > 20)
        .forEach(System.out::println);

    System.out.println("----------------------------");

    //Exercise 4
    numbers.stream()
        .filter(x -> x % 2 != 0)
        .mapToInt(x -> x)
        .average()
        .ifPresent(System.out::println);

    System.out.println("----------------------------");

    //Exercise 5
    List<Integer> numbers5 = Arrays.asList(5, 9, 1, 2, 3, 7, 5, 6, 7, 3, 7, 6, 8, 5, 4, 9, 6, 2);

    int result = numbers5.stream()
        .filter(x -> x % 2 != 0)
        .mapToInt(x -> x)
        .sum();
    System.out.println(result);

    System.out.println("----------------------------");

    //Exercise 6
    String example = "Stream EXPREssion to find the uppercase ";
    List<Character> upperCaseLetters = example.chars()
        .mapToObj(c -> (char) c)
        .filter(Character::isUpperCase)
        .collect(Collectors.toList());
    System.out.println(upperCaseLetters);

    System.out.println("----------------------------");

    //Exercise 7
    List<String> cities = Arrays
        .asList("ROME", "LONDON", "NAIROBI", "CALIFORNIA", "ZURICH", "NEW DELHI", "AMSTERDAM",
            "ABU DHABI", "PARIS");
    cities.stream()
        .filter(x -> x.startsWith("P"))
        .forEach(System.out::println);

    System.out.println("----------------------------");

    //Exercise 8
    List<Character> chars = Arrays.asList('J', 'o', 'c', 'k', 'e', 'y');
    String resultof8 = chars.stream()
        .map(x -> x.toString())
        .collect(Collectors.joining());

    System.out.println(resultof8);

    System.out.println("----------------------------");

    //Exercise 9
    String examplefor9 = "Stream EXPREssion to find the uppercase ";
    Map<Character, Long> charFrequency = examplefor9.chars()
        .mapToObj(c -> (char) c)
        .collect(Collectors.groupingBy(c -> c, Collectors.counting()));
    System.out.println(charFrequency);


  }


}




