import java.util.Scanner;

class ReplaceWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();
        String oldWord = sc.nextLine();
        String newWord = sc.nextLine();
        String result = "";

        for (int i = 0; i < sentence.length(); ) {
            int j = 0;

            while (j < oldWord.length() &&
                   i + j < sentence.length() &&
                   sentence.charAt(i + j) == oldWord.charAt(j)) {
                j++;
            }

            if (j == oldWord.length()) {
                result = result + newWord;
                i = i + oldWord.length();
            } else {
                result = result + sentence.charAt(i);
                i++;
            }
        }

        System.out.println(result);
    }
}
