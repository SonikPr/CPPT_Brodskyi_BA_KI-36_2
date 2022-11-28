import java.util.InputMismatchException;
import java.util.Scanner;
public class CalculateTheEquation implements CalculateTheEquationInterface
{
    @Override
    public double doCalculation(double variable) {
        try {
            return 1 / Math.cos(4*variable);

        } catch (ArithmeticException e){
            System.out.println("Arithmetic exception: illegal value.");
        }
        return 0;
    }
    @Override
    public double doCalculationWithInputInside() {
        try {
            Scanner inputScanner = new Scanner(System.in);
            System.out.print("Enter the X value: ");
            double value = inputScanner.nextDouble();
            inputScanner.nextLine();
            return 1 / Math.cos(4*value);
        } catch (ArithmeticException e){
            System.out.println("Arithmetic exception: illegal value.");
        }
        catch (InputMismatchException e){
            System.out.println("Input exception: illegal value.");
        }
        return 0;
    }
}

