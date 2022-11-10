public class Liquid implements Item
{
    private double volume;
    private String type;

    public Liquid(double volume, String type) {
        this.volume = volume;
        this.type = type;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public double getVolume() {
        return volume;
    }

    @Override
    public void PrintInfo() {
        System.out.println("Liquid{ volume - " + volume + "; liquid type " + type + " }");
    }
}
