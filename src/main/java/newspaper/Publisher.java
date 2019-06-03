package newspaper;

import java.util.ArrayList;
import java.util.List;

public class Publisher implements Subject{
    private List<Observer> observers;
    private Newspaper newspaper;
    private String name;

    public Publisher(){
        this.observers=new ArrayList<>();
        this.newspaper=new Newspaper();
    }
    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObserver() {
        for(Observer o: observers){
            o.update(newspaper);
        }
    }

    public void setNewspaper(String name, String headline, String context){
        this.newspaper.setAll(name,headline,context);
        notifyObserver();
    }
}
