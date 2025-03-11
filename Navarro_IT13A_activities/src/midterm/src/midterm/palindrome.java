
package midterm;

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        // Create a scanner object to take input
        Scanner scanner = new Scanner(System.in);
        
        // Ask the user to input three words
        System.out.print("Enter the first word: ");
        String huntz1 = scanner.nextLine();
        
        System.out.print("Enter the second word: ");
        String huntz2 = scanner.nextLine();
        
        System.out.print("Enter the third word: ");
        String huntz3 = scanner.nextLine();
        
        
        scanner.close();
    }

   
    public static void checkPalindrome(String word) {
        if (isPalindrome(word)) {
            System.out.println(word + " is a palindrome.");
        } else {
            System.out.println(word + " is not a palindrome.");
        }
    }

    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false; 
            }
            left++;
            right--;
        }

        return true; 
    }
}

        


