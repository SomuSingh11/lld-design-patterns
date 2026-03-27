package behavioral.observer.fitness.observer;

import behavioral.observer.fitness.subject.FitnessData;

public interface FitnessDataObserver {
    void update(FitnessData data);
}
