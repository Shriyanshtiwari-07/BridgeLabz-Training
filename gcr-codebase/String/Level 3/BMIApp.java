import java.util.Scanner;

class BMIApp {

    public static String[][] calculateBMITable(double[][] input) {

        String[][] bmiTable = new String[10][4];

        for (int i = 0; i < 10; i++) {

            double weight = input[i][0];
            double heightCm = input[i][1];
            double heightM = heightCm / 100;

            double bmi = weight / (heightM * heightM);

            String status;
            if (bmi < 18.5)
                status = "Underweight";
            else if (bmi < 25)
                status = "Normal";
            else if (bmi < 30)
                status = "Overweight";
            else
                status = "Obese";

            bmiTable[i][0] = String.valueOf(heightCm);
            bmiTable[i][1] = String.valueOf(weight);
            bmiTable[i][2] = String.format("%.2f", bmi);
            bmiTable[i][3] = status;
        }

        return bmiTable;
    }
    public static void display(String[][] table) {

        System.out.println("\nPerson\tHeight\tWeight\tBMI\tStatus");
        System.out.println("--------------------------------------------");

        for (int i = 0; i < table.length; i++) {
            System.out.println(
                (i + 1) + "\t" +
                table[i][0] + "\t" +
                table[i][1] + "\t" +
                table[i][2] + "\t" +
                table[i][3]
            );
        }
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double[][] data = new double[10][2];

        for (int i = 0; i < 10; i++) {
            System.out.println("Enter details for Person " + (i + 1));
            System.out.print("Weight (kg): ");
            data[i][0] = sc.nextDouble();
            System.out.print("Height (cm): ");
            data[i][1] = sc.nextDouble();
        }

        String[][] result = calculateBMITable(data);
        display(result);

        sc.close();
    }
}
