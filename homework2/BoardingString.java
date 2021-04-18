import com.sun.deploy.util.StringUtils;

import java.util.Scanner;

public class BoardingString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int height = in.nextInt();
        int width = in.nextInt();
        String str = in.next();

        if (str.length() + 2 > width || height < 3)
            System.out.println("Ошибка");
        else
            printBoardingString(height, width, str);
    }
    private static void printBoardingString(int height, int width, String str) {
        printlnCharacters(width, '*');
        for (int i = 2; i < height; ++i) {
            System.out.print('*');
            if (i != height / 2 + height % 2)
                printCharacters(width - 2, ' ');
            else {
                printCharacters((width - 2 - str.length()) / 2, ' ');
                System.out.print(str);
                printCharacters((width - 2 - str.length()) / 2 + (width % 2 == 0 ? 1: 0), ' ');
            }
            printlnCharacters(1, '*');
        }
        printlnCharacters(width, '*');
    }
    private static void printCharacters(int length, char ch) {
        StringBuilder printingStr = new StringBuilder();
        for (int i = 0; i < length; ++i)
            printingStr.append(ch);
        System.out.print(printingStr);
    }
    private static void printlnCharacters(int length, char ch) {
        printCharacters(length, ch);
        System.out.println();
    }
}
