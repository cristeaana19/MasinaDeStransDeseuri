public class Observer2Paper extends Observer {
    public Observer2Paper(WasteFactory waste){
        this.waste = waste;
        this.waste.attach(this);
    }
    @Override
    public void update()
    {
        System.out.println(" A new object: Paper");
    }
}
