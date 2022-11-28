public class Main {
    public static void main(String[] args) {
        MotorBoat motorBoat = new MotorBoat(
                new Oar(34.6, "plastic"),
                new Pump("Electric", 60),
                new Seat(6, "plastic"),
                "black", 900
        );

        motorBoat.PumpBoat();
        motorBoat.PumpBoat();

        motorBoat.GetIn(4);
        motorBoat.GetIn(4);
        motorBoat.GetOut(4);

        System.out.println(motorBoat);
    }
}