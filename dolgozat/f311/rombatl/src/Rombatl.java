/*
* File: Terulet.java
* Author: Dobány Norbert
* Copyright: 2024, Dobány Norbert
* Group: SZOFT II/1/N
* Date: 2024.10.01
* Github: https://github.com/notdefinitelynot/
* Licenc: GNU GPL

A program egy rombusz területét számolja ki 
a felhasználó által megadott két átlóból. 
*/
import java.util.Scanner;
public class Rombatl {
    static Scanner sc = new Scanner(System.in);
    public static void solution() {
        System.out.println("A program egy rombusz területét számolja ki a felhasználó által megadott két átlóból.");
        System.out.println("Dobány Norbert, SZOFT II/1/N");
        System.out.print("Adja meg a rombusz \"e\" átlóját: ");
        String eStr = sc.nextLine();
        double e = Double.parseDouble(eStr);
        System.out.print("Adja meg a rombusz \"f\" átlót: ");
        String fStr = sc.nextLine();
        double f = Double.parseDouble(fStr);
        double area = e*f/2;
        System.out.println("A rombusz területe: " + area);
    }
}
