public class Oar
{
    private double length;
    private String material;

    public Oar(double length, String material) {
        this.length = length;
        this.material = material;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return "Oar{ " +
                "length = " + length +
                ", material = '" + material + '\'' +
                " }";
    }
}
