import java.util.Scanner;

public class CharFrequencyASCII {

    // Method to find character frequencies and return 2D array
    public static String[][] findFrequency(String text) {

        int[] freq = new int[256];

        // Count frequency
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            freq[ch]++;
        }

        // Count distinct characters
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            if (freq[text.charAt(i)] > 0) {
                count++;
                freq[text.charAt(i)] = -freq[text.charAt(i)];
            }
        }

        // Store characters and frequency
        String[][] result = new String[count][2];
        int index = 0;

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (freq[ch] < 0) {
                result[index][0] = String.valueOf(ch);
                result[index][1] = String.valueOf(-freq[ch]);
                freq[ch] = 0;
                index++;
            }
        }
        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        String[][] output = findFrequency(input);

        System.out.println("Character Frequency:");
        for (int i = 0; i < output.length; i++) {
            System.out.println(output[i][0] + " : " + output[i][1]);
        }
        sc.close();
    }
}
