public class Observer1Glass extends Observer{
    public Observer1Glass(WasteFactory waste){
        this.waste = waste;
        this.waste.attach(this);
    }
    @Override
    public void update() {
        System.out.println( "A new object: Glass" );
    }
}
