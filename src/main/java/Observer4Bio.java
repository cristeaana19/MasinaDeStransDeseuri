public class Observer4Bio extends Observer {
    public Observer4Bio(WasteFactory waste){
        this.waste = waste;
        this.waste.attach(this);
    }
    @Override
    public void update()
    {
        System.out.println(" A new object: Bio");
    }
}
