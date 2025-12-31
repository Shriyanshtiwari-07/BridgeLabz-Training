public class DigitalWatchSimulation {

    public static void main(String[] args) {

        System.out.println("Digital Watch Started...\n");
        for (int hour = 0; hour < 24; hour++) {

           
            for (int minute = 0; minute < 60; minute++) {

                
                if (hour == 13 && minute == 0) {
                    System.out.println("\nPower Cut at 13:00 ❌ Watch Stopped");
                    break;
                }
                               System.out.println(
                        (hour < 10 ? "0" + hour : hour) + ":" +
                        (minute < 10 ? "0" + minute : minute)
                );
            }

            if (hour == 13) {
                break;
            }
        }
    }
}
