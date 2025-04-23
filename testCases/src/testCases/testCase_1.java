package testCases;
//Designed by Tortoise
/*
Test Name: Reading a File
Please read the [TestCase1 Section] in 'README.md'
for information regarding the usage, expected results
and anything else relevant.
**Only edit where it's marked 'EDIT THIS:'
 */


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class testCase_1 {
    public static void main(String[] args) {
        //File to read
        //Do not change this, but give this address to the AI
        File file = new File("testCase1-testfile.txt");

        //File object will be passed so keep in consideration
        aiGeneratedFunction(file);

    }




    public static void aiGeneratedFunction(File file) {
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.err.println("An error occurred while reading the file: " + e.getMessage());
        }
    }
}
