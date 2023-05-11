public class Botlte extends Product{
       private double volume;

    public Botlte(String name, Double cost, double volume) {
        super(name, cost);
        this.volume = volume;
    }

    @Override
    public String toString() {
        String s = super.toString();
        return s + " " + volume + "l";

    }
}
