package com.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Readfile implements Readable {
    String str;

    public Readfile(String str) {
        this.str = str;
    }
    @Override
    public void readContent() {
        try {
            tryReadContent();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
            System.err.println(e.getMessage());
        }
    }
    public void tryReadContent() throws FileNotFoundException {
     File file = new File("adat.txt");
     Scanner sc = new Scanner(file);   
     while(sc.hasNextLine()){
         System.out.println(sc.nextLine());
    }
    
}
