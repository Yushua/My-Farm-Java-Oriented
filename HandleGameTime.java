public class HandleGameTime {
    private int currentHour = 6;   // Start time at 6 AM
    private int currentMinute = 0; // Start at 00 minutes
    private int endOfDayHour = 24; // End of day is 24 hours

    // Method to update the game time
    public void updateGameTime() {
        // Add 10 minutes to the current time
        currentMinute += 10;

        // If 60 minutes have passed, increment the hour and reset minutes to 0
        if (currentMinute >= 60) {
            currentHour++;
            currentMinute = 0;  // Reset minutes
        }

        // If the current hour exceeds 24 (end of day), reset to 0 (new day starts)
        if (currentHour >= endOfDayHour) {
            currentHour = 0;
        }
    }

    // Method to print the current game time and handle events
    public void printGameTime() {
        System.out.printf("Current Time: %02d:%02d\n", currentHour, currentMinute);

        if (currentHour == 22 && currentMinute == 0) { // If it's exactly 22:00
            System.out.println("It's time to go to bed!");
        }

        if (currentHour == 6 && currentMinute == 0) {  // If it's exactly 06:00
            System.out.println("Good morning! A new day starts.");
        }
    }
}
