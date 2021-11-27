public class Oberver3Plastic extends Observer{
    public Oberver3Plastic(WasteFactory waste){
        this.waste = waste;
        this.waste.attach(this);
    }
    @Override
    public void update()
    {
        System.out.println(" A new object: Plastic");
    }
}
