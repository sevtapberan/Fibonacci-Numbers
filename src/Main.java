public class Main {

    public static void main(String[] args)
    {
        // Fibonacci numbers, for examples 0 1 1 2 3 5 8....

        int first=0;
        int second=1;
        System.out.println(first);
        System.out.println(second);

        int total=0;

        for(int i=2; i<=9; i++)
        {
            total=first+second;
            System.out.println(total);
            first=second;
            second=total;
        }

    }
}
