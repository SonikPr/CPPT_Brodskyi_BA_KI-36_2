public class Main {
    public static void main(String[] args) {
        RowingBoat rowingBoat = new RowingBoat(
                    new Oar(34.6, "plastic"),
                    new Pump("Electric", 60),
                    new Seat(6, "plastic"),
                    "black", 900
        );

        rowingBoat.PumpBoat();
        rowingBoat.PumpBoat();

        rowingBoat.SitIn(4);
        rowingBoat.SitIn(4);
        rowingBoat.GetOut(4);

        System.out.println(rowingBoat);
    }
}