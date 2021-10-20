package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Random;
import java.util.Scanner;

public class GætEtTal {

    public static void main(String[] args) throws FileNotFoundException {
        File talGæt = new File("data/output.txt");
        PrintStream psTal = new PrintStream(new FileOutputStream(talGæt, true));
        Scanner input = new Scanner(System.in);
        Scanner talTxt = new Scanner(talGæt);
        Random random = new Random();

        int tal = random.nextInt(5) + 1;
        int gæt = 0;
        int gætCounter = 0;

        System.out.println("Gæt et tal mellem 1 og 5");

        while (gæt != tal) {
            gæt = input.nextInt();
            System.out.println(gæt);
            gætCounter++;
        }

        psTal.println(gætCounter);
        System.out.println("Hurrah! Du gættede " + tal + " som var det rigtige tal!");
        System.out.println("Antal gæt: " + gætCounter);
    }
}
