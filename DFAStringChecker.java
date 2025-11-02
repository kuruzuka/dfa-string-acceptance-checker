package com.janvier;

import java.util.Scanner;

public class DFAStringChecker {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Input: ");
        String input = scanner.nextLine();
        
        // Validate input (only binary strings)
        if (!input.matches("[01]+")) {
            System.out.println("Error: Please enter a valid binary string (only 0s and 1s)");
            scanner.close();
            return;
        }
        
        // Check if string ends with "01"
        boolean isAccepted = input.endsWith("01");
        
        if (isAccepted) {
            System.out.println("Output: Accepted");
        } else {
            System.out.println("Output: Rejected");
        }
        
        scanner.close();
    }
}

