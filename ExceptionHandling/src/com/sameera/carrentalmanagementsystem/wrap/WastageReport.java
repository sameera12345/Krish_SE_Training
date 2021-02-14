package com.sameera.carrentalmanagementsystem.wrap;

import com.sameera.carrentalmanagementsystem.exceptions.InvalidDirectoryException;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class WastageReport {

    public void getReport() {
        try {
            FileReader fileReader = new FileReader("D:\\CarInventory\\Record.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);

        } catch (FileNotFoundException e) {
            throw new InvalidDirectoryException("File not found due to invalid directory: wrappedException");
        }
    }

    public static void main(String[] args) {

        WastageReport wastageReport = new WastageReport();

        try {
            wastageReport.getReport();
        } catch (InvalidDirectoryException e) {
            System.err.print(e.getMessage());
        }
    }
}
