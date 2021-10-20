package com.company;

import java.io.*;
import java.util.Scanner;

public class TesktfilGenerator {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(System.in);

        System.out.println("Hej og velkommen til Tekstfil-Generatoren!");
        System.out.print("Hvad skal din tekstfil hede?: ");
        String filnavn = input.nextLine();

        File textfile = new File(filnavn);
        PrintStream ps = new PrintStream(new FileOutputStream(textfile, true));

        System.out.println("Skriv teksten til din fil her: ");
        String filtekst = input.nextLine();
        ps.println(filtekst);



    }
}
