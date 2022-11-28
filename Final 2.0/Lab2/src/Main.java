import java.util.*;
import java.io.*;
public class Main {
    public static void main (String [] args)throws IOException
    {
        int size = 0;
        System.out.print("Enter size\t");
        Scanner scanner_in = new Scanner(System.in);
        BufferedWriter writer = new BufferedWriter((new
                FileWriter("MyFile.txt")));
        while (true)
        {
            try
            {
                size = scanner_in.nextInt(); //вводимо розмір матриці з клавіатури
                if (size <= 3)//перевіряємо чи наша матриця є більшої  розмірності ніж 3
                {
                    System.out.print("The size of the matrix is less than  3!\nRepeat the input\t\t");//якщо ні то виводимо відповідний текст і просимо повторити ввід
                        size = scanner_in.nextInt();//вводимо розмір матриці з клавіатури
                    scanner_in.nextLine();
                }
                break;
            }
            catch (Exception e)
            {
                System.out.println("Incorrect input of int. Try again. ");
                System.out.print("Enter size\t");
                scanner_in.nextLine();
            }
        }
        scanner_in.nextLine();
        String filler;
        System.out.print("Enter fill character\t");
        filler = scanner_in.nextLine();//вводимо символ заповнювач з клавіатури)
        while (true)
        {
            if (filler.length() != 1)
            {
                System.out.println("fill character must be one character!");
                System.out.print("Enter fill character\t");
                filler = scanner_in.nextLine();
            }
            else break;
        }
        char [][]arr = new char[size][size];
        System.out.print("Would You like to fill the unfilled array space with the character other than ' ' to see the result? Y/N?\r\n");
        String choice = scanner_in.nextLine();
        String EmptyFiller = " ";
            if (choice.equals("Y")) {
                System.out.print("Enter empty fill character\r\n");
                EmptyFiller = scanner_in.nextLine();
            }




        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                arr[i][j] = (char)EmptyFiller.codePointAt(0);
            }
        }
        for (int i = 0; i < size-1; i++)
        {
            if(i==0 ||i==size-1)
            {
                System.out.println();
                writer.write("\n");
                continue;
            }
            for (int j = 1; j < size-1; j++)
            {
                arr[1][j] = (char)filler.codePointAt(0);//заповнюємо верхню горизонтальну частину заштрихованої області
                arr[i][1] = (char)filler.codePointAt(0);//заповнюємо ліву вертикальну частину заштрихованої області
                arr[size-2][j] = (char)filler.codePointAt(0);//заповнюємо нижню горизонтальну частину заштрихованої області
                arr[i][size-2] = (char)filler.codePointAt(0);
            }

        }
        //Array display
        for(int i=0; i<size; i++){
            for(int j = 0; j< size; j++){
                System.out.print(" ");
                System.out.print(arr[i][j]);
                writer.write(" ");
                writer.write( arr[i][j]);
            }
            System.out.println();
            writer.write("\n");
        }

        scanner_in.close();
        writer.flush();
        writer.close();
    }
}