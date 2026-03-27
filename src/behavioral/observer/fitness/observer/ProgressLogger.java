package behavioral.observer.fitness.observer;

import behavioral.observer.fitness.subject.FitnessData;

public class ProgressLogger implements FitnessDataObserver {
    @Override
    public void update(FitnessData data){
        System.out.println("Logger → Saving to DB: Steps=" + data.getSteps() +
                ", ActiveMinutes=" + data.getActiveMinutes() +
                ", Calories=" + data.getCalories());
        // Simulated DB/file write...
    }
}
