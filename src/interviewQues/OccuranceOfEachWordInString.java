package interviewQues;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class OccuranceOfEachWordInString {

	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input string
        System.out.print("Enter the string: ");
        String inputString = scanner.nextLine();

        // Substring to find
        System.out.print("Enter the substring to find: ");
        String substring = scanner.nextLine();

        // Find and print occurrences
        int occurrences = countSubstringOccurrences(inputString, substring);
        System.out.println("Occurrences of '" + substring + "': " + occurrences);

        scanner.close();
    }

    public static int countSubstringOccurrences(String input, String substring) {
        int count = 0;
        int index = input.indexOf(substring);

        while (index != -1) {
            count++;
            index = input.indexOf(substring, index + 1);
        }

        return count;
    }
}