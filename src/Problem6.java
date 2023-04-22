public class Problem6
{
    public static void main(String[] args)
    {
        final int ROW = 5;
        for (int row = 0; row <= ROW; row++)
        {
            for (int col = 5; col > row; col--)
            {
                System.out.printf("*");
            }
            System.out.println("");
        }
    }
}
