public class RowingBoat
{
    private Oar oar;
    private Pump pump;
    private Seat seat;
    private String color;
    private double volume;
    private boolean isPumped = false;
    private Logger logger = Logger.getLogger("logs.txt");
    /**
     * Constructor
     * @param oar
     * @param pump
     * @param seat
     * @param color
     * @param volume
     */
    public RowingBoat(Oar oar, Pump pump, Seat seat, String color, double
            volume) {
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
    public void PumpBoat()
    {
        if (!isPumped)
        {
            System.out.println("Boat will be pumped for " + volume /
                    pump.getPower() + " minutes");
            isPumped = true;
        }
        else
        {
            System.out.println("Boat is already pumped");
        }
        logger.log(logger.infoFlag + "RowingBoat method PumpBoat called");
    }
    /**
     * SitIn method
     * @param count
     */
    public void SitIn(int count)
    {
        if(seat.getCapacity() >= seat.getBookedSeats() + count)
        {
            System.out.println("In boat seat " + count + " persons");
            seat.setBookedSeats(seat.getBookedSeats() + count);
            System.out.println("Now in boat " + seat.getBookedSeats() + " booked seats");
        }
        else
        {
            System.out.println("Boat did not have enough seats");
        }
        logger.log(logger.infoFlag + "RowingBoat SitIn method called");
    }
    public void GetOut(int count)
    {
        if(seat.getBookedSeats() - count >= 0)
        {
            System.out.println("From boat get out " + count + " persons");
            seat.setBookedSeats(seat.getBookedSeats() - count);
            System.out.println("Now in boat " + seat.getBookedSeats() + " booked seats");
        }
        else
        {
            System.out.println("Boat did not have " + count + " persons");
        }
        logger.log(logger.infoFlag + "RowingBoat GetOut method called");
    }
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
                "\noar=" + oar +
                "\npump=" + pump +
                "\nseat=" + seat +
                "\ncolor='" + color + '\'' +
                "\nvolume=" + volume +
                "\nisPumped=" + isPumped;
    }
}

/**
 * GetOut method
 * @param count
 */
