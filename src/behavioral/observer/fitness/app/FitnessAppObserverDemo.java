package behavioral.observer.fitness.app;

import behavioral.observer.fitness.observer.GoalNotifier;
import behavioral.observer.fitness.observer.LiveActivityDisplay;
import behavioral.observer.fitness.observer.ProgressLogger;
import behavioral.observer.fitness.subject.FitnessData;

public class FitnessAppObserverDemo {
    public static void main(String[] args) {
        // Create Subject
        FitnessData fitnessData = new FitnessData();

        // Create Observers
        LiveActivityDisplay display = new LiveActivityDisplay();
        ProgressLogger logger = new ProgressLogger();
        GoalNotifier notifier = new GoalNotifier();

        // Register observers
        fitnessData.registerObserver(display);
        fitnessData.registerObserver(logger);
        fitnessData.registerObserver(notifier);

        // Simulate updates
        fitnessData.newFitnessDataPushed(500, 5, 20);
        fitnessData.newFitnessDataPushed(9800, 85, 350);
        fitnessData.newFitnessDataPushed(10100, 90, 380);

        // Remove logger and reset notifier
        fitnessData.registerObserver(logger);
        notifier.reset();
        fitnessData.dailyReset();
    }
}
