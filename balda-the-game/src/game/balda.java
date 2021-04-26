package game;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class balda {
    public static void main(String[] args) {
        HashSet<Character> alphabet = new HashSet<>();
        Scanner in = new Scanner(System.in);
        System.out.println("Please, type host word");
        String word = in.nextLine();
        for (char ch:
                word.toCharArray()) {
            alphabet.add(ch);
        }
        LinkedHashSet<String> listOfWordsP1 = new LinkedHashSet<>();
        LinkedHashSet<String> listOfWordsP2 = new LinkedHashSet<>();
        System.out.println("Hey! Host word is \"" + word + "\".");
        String nextWord;
        boolean isP1Turn = true;
        printTurn(isP1Turn);
        while (!(nextWord = in.nextLine()).isEmpty()) {
            addNewWord(nextWord, alphabet, listOfWordsP1, listOfWordsP2, isP1Turn);
            isP1Turn = !isP1Turn;
            printTurn(isP1Turn);
        }
        isP1Turn = !isP1Turn;
        printTurn(isP1Turn);
        while (!(nextWord = in.nextLine()).isEmpty()) {
            addNewWord(nextWord, alphabet, listOfWordsP1, listOfWordsP2, isP1Turn);
            printTurn(isP1Turn);
        }
        if (listOfWordsP1.size() > listOfWordsP2.size())
            System.out.println("P1 WINS!");
        else if (listOfWordsP2.size() > listOfWordsP1.size())
            System.out.println("P2 WINS!");
        else
            System.out.println("DRAW!");
        System.out.println("Count of words P1: " + listOfWordsP1.size());
        System.out.println("List of words P1: " + listOfWordsP1);
        System.out.println("Count of words P2: " + listOfWordsP2.size());
        System.out.println("List of words P2: " + listOfWordsP2);
    }
    private static void printTurn(boolean isP1Turn) {
        if (isP1Turn)
            System.out.println("It's first player turn");
        else
            System.out.println("It's second player turn");
    }
    private static void addNewWord(String nextWord, HashSet<Character> alphabet, LinkedHashSet<String> listOfWordsP1, LinkedHashSet<String> listOfWordsP2, boolean isP1Turn) {
        LinkedHashSet<String> currentListOfWords;
        if (isP1Turn)
            currentListOfWords = listOfWordsP1;
        else
            currentListOfWords = listOfWordsP2;
        if (!isCorrectWord(nextWord, alphabet))
            System.out.println("Incorrect word! Try another word");
        else {
            if (!listOfWordsP1.contains(nextWord) && !listOfWordsP2.contains(nextWord)) {
                currentListOfWords.add(nextWord);
                System.out.println("Word accepted");
            } else
                System.out.println("this word was already typed");
        }
    }
    private static boolean isCorrectWord(String word, HashSet<Character> alphabet) {
        for (char ch :
                word.toCharArray()) {
            if (!alphabet.contains(ch))
                return (false);
        }
        return (true);
    }
}
