import java.util.Scanner;

public class CharacterFrequencyNested {

    // Method to find character frequency
    public static String[] findFrequency(String text) {

        char[] chars = text.toCharArray();
        int[] freq = new int[chars.length];

        // Initialize frequency array
        for (int i = 0; i < freq.length; i++) {
            freq[i] = 1;
        }

        // Nested loops to calculate frequency
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '0') {
                continue;
            }

            for (int j = i + 1; j < chars.length; j++) {
                if (chars[i] == chars[j]) {
                    freq[i]++;
                    chars[j] = '0'; // Mark duplicate
                }
            }
        }

        // Count valid characters
        int count = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != '0') {
                count++;
            }
        }

        // Store result in 1D String array
        String[] result = new String[count];
        int index = 0;

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != '0') {
                result[index++] = chars[i] + " : " + freq[i];
            }
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        String[] output = findFrequency(input);

        System.out.println("Character Frequency:");
        for (int i = 0; i < output.length; i++) {
            System.out.println(output[i]);
        }

        sc.close();
    }
}
