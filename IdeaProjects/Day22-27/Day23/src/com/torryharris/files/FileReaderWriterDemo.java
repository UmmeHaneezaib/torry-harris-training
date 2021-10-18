package com.torryharris.files;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderWriterDemo {
    public static void main(String[] args) throws IOException {
        File input = new File("input.txt");
        FileReader reader = new FileReader(input);
        char[ ] array=new char[(int) input.length()];

            reader.read(array);
            String data = new String(array);
            System.out.println(data);
        reader.close();
        data = "Hello.\n Welcome to the Second output file";
        FileWriter writer = new FileWriter("output2.txt");
        writer.write(data);
        writer.flush();
        writer.close();
        }

    }

