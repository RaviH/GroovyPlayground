package com.mayabansi.file;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

/**
 * Created by IntelliJ IDEA.
 * User: Ravi Hasija
 * Date: Aug 7, 2011
 * Time: 1:16:50 AM
 * To change this template use File | Settings | File Templates.
 */
public class CreateBigFileInJava {

    public static void main(String []  args) {
        try {
            BufferedWriter outputFile = new BufferedWriter(new FileWriter("D:\\code\\IProjects\\GroovyPlayground\\BigFileInJava.txt", true));
            Random rand = new Random();
            int accountNumber = 1;
            int customerNumber = 1001101;
            int totalMin = 1000;
            float price = 69.99f;

            Long startTime = System.currentTimeMillis();

            for (int i = 1; i <= 200000; i++) {
                accountNumber = rand.nextInt(1001011);
                customerNumber = rand.nextInt(2002110);
                int totalMinsUsed = rand.nextInt(1000);
                int totalMinsAvail = totalMin - totalMinsUsed;
                String line = accountNumber + "," + customerNumber + "," + totalMin + "," + totalMinsUsed++  + "," + totalMinsAvail + "," + price + "," + "John Smith\n";

                if (i == 1) {
                    outputFile.write(line);
                } else {
                    outputFile.append(line);
                }
            }
            long endTime = System.currentTimeMillis();
            System.out.println ("Time taken: " + (endTime - startTime) + " msec");
            outputFile.close();
        } catch (
            IOException e) {
        }
    }
}
