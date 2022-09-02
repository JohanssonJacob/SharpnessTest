package com.sharpness;

import com.sharpness.Calculators.AdvancedMultiOperator;
import com.sharpness.Calculators.OneOperator;
import com.sharpness.Calculators.SimpleMultiOperator;
import com.sharpness.DetectAnagram.DetectAnagram;
import com.sharpness.FindAllLinks.FindLinks;

import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);
    static boolean running = true;

    public static void main(String[] args) {
        startApplication();
    }

    public static void startApplication() {

        while (running){

            log(
                    "Select application: \n" +
                    "1: Detect Anagrams. \n" +
                    "2: Find all links on a website. \n" +
                    "3: Calculator with one operator \n" +
                    "4: Simple Calculator with two operators (+ - or * /) \n" +
                    "5: Advanced Calculator with unlimited operators. \n" +
                    "Q: Quit."
            );

            String input = scanner.nextLine();

            switch (input) {
                case "1":
                    anagramMenu();
                    break;
                case "2":
                    findLinksMenu();
                    break;
                case "3":
                    oneOperatorMenu();
                    break;
                case "4":
                    simpleMultiOperatorMenu();
                    break;
                case "5":
                    advancedMultiOperatorMenu();
                    break;
                case "q", "Q":
                    log("Quitting...");
                    running = false;
                    break;
                default:
                    log("Wrong input...");
            }
        }
    }

    public static void anagramMenu() {
        DetectAnagram detAn = new DetectAnagram();
        log("Enter the first word: ");
        String wordOne = scanner.nextLine();
        log("Enter the second word: ");
        String wordTwo = scanner.nextLine();

        if (detAn.detectAnagram(wordOne, wordTwo)) {
            log("True");
        } else {
            log("False");
        }
    }

    public static void findLinksMenu() {
        FindLinks findLinks = new FindLinks();
        log("Paste desired link: ");
        String link = scanner.nextLine();
        try {
            findLinks.findAllLinks(link);
        } catch (Exception e) {
            log(e.getMessage());
        }
    }

    public static void oneOperatorMenu() {
        OneOperator oneOperator = new OneOperator();
        log("Enter your expression with one operator: ");
        String input = scanner.nextLine();
        log("Result: " + oneOperator.evaluate(input) + "\n");

    }

    public static void simpleMultiOperatorMenu() {
        SimpleMultiOperator simpleMultiOperator = new SimpleMultiOperator();
        log("Enter your expression, max two different operators (+ - or * /)");
        String input = scanner.nextLine();
        log("Result: " + simpleMultiOperator.evaluate(input) + "\n");
    }

    public static void advancedMultiOperatorMenu() {
        AdvancedMultiOperator advancedMultiOperator = new AdvancedMultiOperator();
        log("This calculator supports + - * /, any amount & any order.");
        log("Enter your expression: ");
        String input = scanner.nextLine();
        log("Result: " + advancedMultiOperator.evaluate(input));
    }


    public static void log(String logMessage) {
        System.out.println(logMessage);
    }
}
