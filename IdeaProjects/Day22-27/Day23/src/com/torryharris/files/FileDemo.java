package com.torryharris.files;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileDemo {
    public static void main(String[] argxs) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num");
        int n = sc.nextInt();
        System.out.println("Enter the Name");
        String name = sc.next();
        FileWriter writer = new FileWriter("output3.txt");

        for (int i = 0; i < n; i++) {
            writer.write(name);
            System.out.println();
        }

        writer.close();

    }
    }

