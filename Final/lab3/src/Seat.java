public class Seat
{
    private int capacity;
    private String material;
    private int bookedSeats = 0;

    public Seat(int capacity, String material) {
        this.capacity = capacity;
        this.material = material;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int getBookedSeats() {
        return bookedSeats;
    }

    public void setBookedSeats(int bookedSeats) {
        this.bookedSeats = bookedSeats;
    }

    @Override
    public String toString() {
        return "Seat{ " +
                "capacity = " + capacity +
                ", material = '" + material + '\'' +
                ", bookedSeats = " + bookedSeats +
                " }";
    }
}
