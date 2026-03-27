package behavioral.observer.fitness.subject;

import behavioral.observer.fitness.observer.FitnessDataObserver;

public interface FitnessDataSubject {
    void registerObserver(FitnessDataObserver observer);
    void removeObserver(FitnessDataObserver observer);
    void notifyObservers();
}
