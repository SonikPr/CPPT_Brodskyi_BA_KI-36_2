public class Main
{
    public static void main(String[] args)
    {
        Jar<? super Item> jar = new Jar<>();
        jar.AddItem(new Liquid(56.7, "Jucy"));
        jar.AddItem(new Liquid(12, "Coke"));
        jar.AddItem(new Food(521, "Apple", "10-10-2023"));
        jar.AddItem(new Food(23, "Burger", "10-09-2022"));
        jar.AddItem(new Liquid(433, "Sprite"));
        jar.AddItem(new Food(43, "Meat", "12-12-2022"));
        jar.AddItem(new Liquid(5435, "Fanta"));
        jar.AddItem(new Food(511, "Eggs", "10-11-2022"));
        System.out.println("Min element is: " );
        jar.FindMin().PrintInfo();
    }
}
