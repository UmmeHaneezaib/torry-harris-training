package com.torryharris.files;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileReadingDemo {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("file.txt");
        System.out.println("The File Contents are:");
        int ch;
        while((ch= fis.read())!=-1)  //EOF
            System.out.print((char)ch);
        fis.close();
        FileOutputStream fos = new FileOutputStream("output.txt");
        String str = "Hola.\n You are Viewing an output File.";
        char[] array = str.toCharArray();
        for(char c : array){
            fos.write(c);}
        fos.close();
        System.out.println("\nContents are written onto file");

    }
}
