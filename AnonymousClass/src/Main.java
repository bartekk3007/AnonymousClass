public class Main
{
    public static void main(String[] args)
    {
        Runnable r1 = new Runnable()
        {
            @Override
            public void run()
            {
                System.out.println("This is running");
            }
        };
        r1.run();
        int liczba1 = 5;
        int liczba2 = 5;
        int suma = sum(liczba1, liczba2);
    }

    private static int sum(int liczba1, int liczba2)
    {
        return liczba1 + liczba2;
    }
}