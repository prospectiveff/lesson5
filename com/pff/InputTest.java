package com.pff;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class InputTest {

    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Enter falename");
        }

        String line;
        ArrayList<String> list = new ArrayList();

        try {
            BufferedReader fin = new BufferedReader(new InputStreamReader(new FileInputStream(args[0])));
            while ((line = fin.readLine()) != null) {
                System.out.println("LIne: " + line);
                list.add(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Failed to open file " + args[0]);
            System.out.println("Error: " + e);
            return;
        } catch (IOException e) {
            System.out.println("I/O error in file " + args[0]);
            System.out.println("Error: " + e);
            return;
        }

        Collections.sort(list);
        System.out.println("Sorted lines list:");
        for (String item : list) {
            System.out.println(item);
        }
    }
}
