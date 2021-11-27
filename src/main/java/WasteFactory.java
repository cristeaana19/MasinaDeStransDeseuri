import java.util.ArrayList;
import java.util.List;

public class WasteFactory {
    private List<Observer> observers = new ArrayList<Observer>();
    private int state;
    public Waste getWaste(String wasteType)
    {
        if(wasteType == null){
            return null;
        }
        if(wasteType.equalsIgnoreCase("GLASS")){
            return new Glass();

        } else if(wasteType.equalsIgnoreCase("PAPER")){
            return new Paper();

        } else if(wasteType.equalsIgnoreCase("PLASTIC")){
            return new Plastic();
        }else if(wasteType.equalsIgnoreCase("BIO")){
            return new Bio();
        }

        return null;
    }
    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        notifyAllObservers();
    }

    public void attach(Observer observer){
        observers.add(observer);
    }

    public void notifyAllObservers(){
        for (Observer observer : observers) {
            observer.update();
        }
    }

}
