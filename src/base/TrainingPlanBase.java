package base;

import interfaces.Observer;
import interfaces.Subject;

import java.util.ArrayList;
import java.util.List;

public abstract class TrainingPlanBase implements Subject {
    protected List<Observer> observers;
    private String programDetailsMessage;

    public TrainingPlanBase() {
        this.observers = new ArrayList<Observer>();
    }
    
    @Override
    public void registerObserver(Observer observer) {
        if (!observers.contains(observer)) {
            observers.add(observer);
            observer.update("Трябва да платите 50 лв");
        }
    }
    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }
    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(this.programDetailsMessage);
        }
    }
    public void setProgramDetailsMessage(String message) {
        this.programDetailsMessage = message;
        notifyObservers();
    }
    @Override
    public List<Observer> getObservers() {
        return this.observers;
    }
}
