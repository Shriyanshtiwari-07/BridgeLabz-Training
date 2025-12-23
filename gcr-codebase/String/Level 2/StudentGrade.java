import java.util.*;

public class StudentGrade {

    // Method to generate random PCM scores
    public static int[][] generatePCM(int n) {
        int[][] pcm = new int[n][3];
        for (int i = 0; i < n; i++) {
            pcm[i][0] = (int)(Math.random() * 50) + 50; // Physics
            pcm[i][1] = (int)(Math.random() * 50) + 50; // Chemistry
            pcm[i][2] = (int)(Math.random() * 50) + 50; // Maths
        }
        return pcm;
    }

    // Method to calculate total, average, percentage
    public static double[][] calculateResult(int[][] pcm) {
        double[][] result = new double[pcm.length][3];

        for (int i = 0; i < pcm.length; i++) {
            int total = pcm[i][0] + pcm[i][1] + pcm[i][2];
            double avg = total / 3.0;
            double percent = (total / 300.0) * 100;

            result[i][0] = total;
            result[i][1] = Math.round(avg * 100.0) / 100.0;
            result[i][2] = Math.round(percent * 100.0) / 100.0;
        }
        return result;
    }

    // Method to calculate grade
    public static String[] calculateGrade(double[][] result) {
        String[] grade = new String[result.length];

        for (int i = 0; i < result.length; i++) {
            double p = result[i][2];

            if (p >= 90) grade[i] = "A";
            else if (p >= 75) grade[i] = "B";
            else if (p >= 60) grade[i] = "C";
            else if (p >= 40) grade[i] = "D";
            else grade[i] = "Fail";
        }
        return grade;
    }

    // Method to display scorecard
    public static void display(int[][] pcm, double[][] result, String[] grade) {
        System.out.println("Phy\tChem\tMath\tTotal\tAvg\t%\tGrade");
        System.out.println("------------------------------------------------");

        for (int i = 0; i < pcm.length; i++) {
            System.out.println(
                pcm[i][0] + "\t" + pcm[i][1] + "\t" + pcm[i][2] + "\t" +
                (int)result[i][0] + "\t" + result[i][1] + "\t" +
                result[i][2] + "\t" + grade[i]
            );
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[][] pcm = generatePCM(n);
        double[][] result = calculateResult(pcm);
        String[] grade = calculateGrade(result);

        display(pcm, result, grade);
    }
}
