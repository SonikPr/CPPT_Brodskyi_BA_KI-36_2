/**
 * Class RowingBoar
 * @author
 * @version 1.0
 */
public abstract class RowingBoat
{
    protected Oar oar;
    protected Pump pump;
    protected Seat seat;
    protected String color;
    protected double volume;
    protected boolean isPumped = false;
    protected Logger logger = Logger.getLogger("logs.txt");

    /**
     * Constructor
     * @param oar
     * @param pump
     * @param seat
     * @param color
     * @param volume
     */
    public RowingBoat(Oar oar, Pump pump, Seat seat, String color, double volume) {
        this.oar = oar;
        this.pump = pump;
        this.seat = seat;
        this.color = color;
        this.volume = volume;
        logger.log(logger.infoFlag + "RowingBoat constructor called");
    }

    /**
     * Pump boat method
     */
    public abstract void PumpBoat();

    public Oar getOar() {
        return oar;
    }

    public void setOar(Oar oar) {
        this.oar = oar;
    }

    public Pump getPump() {
        return pump;
    }

    public void setPump(Pump pump) {
        this.pump = pump;
    }

    public Seat getSeat() {
        return seat;
    }

    public void setSeat(Seat seat) {
        this.seat = seat;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public boolean isPumped() {
        return isPumped;
    }

    public void setPumped(boolean pumped) {
        isPumped = pumped;
    }

    @Override
    public String toString() {
        return "RowingBoat:" +
                "\noar = " + oar +
                "\npump = " + pump +
                "\nseat = " + seat +
                "\ncolor = '" + color + '\'' +
                "\nvolume = " + volume +
                "\nisPumped = " + isPumped;
    }
}
