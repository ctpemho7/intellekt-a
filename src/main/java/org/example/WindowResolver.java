package org.example;

import java.util.Scanner;

public class WindowResolver {

    public static void main(String[] args) {
        while (true) {
            int id = getUserInput();
            int window = switch (id) {
                case 1, 4, 7 -> 26;
                case 2, 3, 5, 6 -> 27;
                case 8, 9, 10 -> 28;
                default -> 30;
            };

            System.out.printf("По вашему вопросу обратитесь в окно %d", window);
        }
    }

    static Scanner in = new Scanner(System.in);

    private static int getUserInput() {
        return in.nextInt();
    }



   
}



