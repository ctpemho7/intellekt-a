package org.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;

public class Test {
    public static void importUsersToList(String path) throws IOException {
        LinkedList<String> users = new LinkedList<>();
        for (int i = 0; i < 4; i++) {
            try {
                BufferedReader reader = new BufferedReader(new FileReader(path));
                String currentLine = reader.readLine();
                if (currentLine != "")
                    users.add(currentLine);
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }

    }
    public class Tests {


    }
}

