public class Problem5
{
    public static void main(String[] args)
    {
        final int ROW = 5;
        for (int row = 1; row <= ROW; row++)
        {
            for (int col = 0; col < row; col++)
            {
                System.out.printf("*");
            }
            System.out.println("");
        }
    }
}
