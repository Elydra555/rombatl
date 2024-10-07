/*
* File: Rombter.java
* Author: Klíber Regő Benedek
* Copyright: 2024, Klíber Regő Benedek
* Group: Szoft II/I/N
* Date: 2024-09-30
* Github: https://github.com/Elydra5/
* Licenc: GNU GPL
*/

import java.util.Scanner;

public class Rombter {

    public void RombuszTerulet(){

        System.out.println("Ez a program kiszámolj a rombusz területét.");
        System.out.println("Klíber Regő Benedek, II-1-N");

        Scanner sc = new Scanner(System.in);

        System.out.print("Első átló: ");
        String elsoBekeres = sc.nextLine();
        Double elsoAtlo = Double.valueOf(elsoBekeres);

        System.out.print("Második átló: ");
        String masodikBekeres = sc.nextLine();
        Double masodikAtlo = Double.valueOf(masodikBekeres);

        Double eredmeny = (1.0/2.0) * elsoAtlo * masodikAtlo;

        System.out.println("A rombusz területe: " + eredmeny);

        sc.close();
    }
}
