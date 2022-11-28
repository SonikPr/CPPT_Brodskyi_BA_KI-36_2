public class Pump
{
    private String type;
    private double power;
    public Pump(String type, double power) {
        this.type = type;
        this.power = power;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public double getPower() {
        return power;
    }
    public void setPower(double power) {
        this.power = power;
    }
    @Override
    public String toString() {
        return "Pump{ " +
                "type = '" + type + '\'' +
                ", power = " + power +
                " }";
    }
}