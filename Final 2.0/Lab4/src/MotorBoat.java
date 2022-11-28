public class MotorBoat extends RowingBoat implements GetInOut
{
    /**
     * Constructor
     *
     * @param oar
     * @param pump
     * @param seat
     * @param color
     * @param volume
     */
    public MotorBoat(Oar oar, Pump pump, Seat seat, String color, double volume) {
        super(oar, pump, seat, color, volume);
        logger.log(logger.infoFlag + "Motor constructor called");
    }

    @Override
    public void GetIn(int count) {
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
        logger.log(logger.infoFlag + "Motorboat GetIn method called");
    }

    @Override
    public void GetOut(int count) {
        if(seat.getBookedSeats() - count >= 0)
        {
            System.out.println("From boat get out  " + count + " persons");
            seat.setBookedSeats(seat.getBookedSeats() - count);
            System.out.println("Now in boat " + seat.getBookedSeats() + " booked seats");
        }
        else
        {
            System.out.println("Boat did not have " + count + " persons");
        }
        logger.log(logger.infoFlag + "Motorboat GetOut method called");
    }

    /**
     * Overrided method to pump boat
     */
    @Override
    public void PumpBoat() {
        if (!isPumped)
        {
            System.out.println("Boat will be pumped for " + volume / pump.getPower() + " minutes");
            isPumped = true;
        }
        else
        {
            System.out.println("Boat is already pumped");
        }
        logger.log(logger.infoFlag + "RowingBoat method PumpBoat called");
    }

    @Override
    public String toString() {
        return "MotorBoat:" +
                "\noar=" + oar +
                "\npump=" + pump +
                "\nseat=" + seat +
                "\ncolor='" + color + '\'' +
                "\nvolume=" + volume +
                "\nisPumped=" + isPumped;
    }
}