import java.util.ArrayList;

public abstract class Subject {
    private ArrayList<Observer> observers = new ArrayList<>();

    public void register(Observer observer) {
        observers.add(observer);
    }

    protected void notifyObservers(Flight flight) {
        for (Observer observer : observers) {
            observer.update(flight);
        }
    }
}

