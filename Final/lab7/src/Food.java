public class Food implements Item
{
    private double volume;
    private String type;
    private String expirationDate;

    public Food(double volume, String type, String expirationDate) {
        this.volume = volume;
        this.type = type;
        this.expirationDate = expirationDate;
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

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    @Override
    public double getVolume() {
        return volume;
    }

    @Override
    public void PrintInfo() {
        System.out.println("Food{ volume - " + volume + "; food type " + type + "; expiration date - " +  expirationDate + " }");
    }
}
