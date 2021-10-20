package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class DMI {

    public static void main(String[] args) throws FileNotFoundException {
        File dmiFile = new File("data/DMI.txt");

        Scanner inputDmi = new Scanner(dmiFile);
        double sum = 0;
        String by = "";
        double temp = 0;
        int count = 0;

        while (inputDmi.hasNext()) {
            by = inputDmi.next();

            if (inputDmi.hasNextInt()) {
                temp = inputDmi.nextInt();
                sum += temp;
            }
            count++;
            System.out.printf("%s %.0f grader\n", by, temp);
        }
        double gennemsnitsTemperatur = sum / count;
        System.out.println("Gennemsnitstemperaturen for alle byer: " + Math.round(gennemsnitsTemperatur));
    }
}
