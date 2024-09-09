import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class FarmGame {
    private HandleGameTime gameTimeHandler = new HandleGameTime();  // Create an instance of HandleGameTime
    private boolean isGameRunning = true;
    private int handleTime = 3;

    public static void main(String[] args) {
        new FarmGame().startGame();
    }

    public void startGame() {
        // Scheduled executor to simulate the game loop (every 3 seconds is 10 in-game minutes)
        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);

        scheduler.scheduleAtFixedRate(() -> {
            if (isGameRunning) {
                updateGame();
            }
        }, 0, handleTime, TimeUnit.SECONDS);  // Every 3 seconds represents 1/6th of an hour (10 minutes)
    }

    public void updateGame() {
        gameTimeHandler.updateGameTime();   // Handle time update
        gameTimeHandler.printGameTime();    // Print the updated time
    }
}
