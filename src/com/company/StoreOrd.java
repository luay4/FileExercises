package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class StoreOrd {

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("data/demo.txt");

        Scanner input = new Scanner(file);
        String text = "";
        boolean goOn = true;

        while (input.hasNext()) {
            text += input.next() + " ";
        }

        String[] ordliste = text.split(" ");
        String tekstSB = "";

        for (int i = 0; i < ordliste.length; i++) {
            String word = ordliste[i];
            if (word.length() >= 5) {
                word = word.toUpperCase();
            }
            tekstSB += word + " ";
        }

        System.out.println(tekstSB);
    }
}
