//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int n = 4;
        Pattern9(n);
    }

    /* pattern1
    *
    * *
    * * *
    * * * *
     */
    static void Pattern1(int n)
    {
        for (int row = 1; row <= n; row++)
        {
            for(int col = 1; col <= row; col++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    /* pattern2
    * * * * *
    * * * * *
    * * * * *
    * * * * *
     */

    static void Pattern2(int n)
    {
        for(int row = 1; row <= n; row++)
        {
            for(int col = 1; col <= n; col++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    /* pattern3
    * * * * *
    * * * *
    * * *
    * *
    *
     */

    static void Pattern3(int n)
    {
        for(int row = 1; row <= n; row++)
        {
            for(int col = 1; col <= n-row+1; col++)//if col or row starts from zero them col <= n-row
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    /*Pattern4
    1
    1 2
    1 2 3
    1 2 3 4
    1 2 3 4 5
     */
    static void Pattern4(int n)
    {
        for(int row = 1; row <= n; row++)
        {
            for(int col = 1; col <= row; col++)
            {
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }
    /* Pattern5
     *
     **
     ***
     ****
     *****
     ****
     ***
     **
     *
     */

    static void Pattern5(int n)
    {
        for(int row = 1; row <= 2*n-1; row++)
        {
            if (row <= n)
            {
                for(int col = 1; col <= row; col++)
                {
                    System.out.print("* ");
                }
            }
            else if(row > n)
            {
                for(int col = 1; col <= 2*n-row; col++) // 2n-row for 6throw -> 2*5 - 6->4 we need to print 4 stars goes on
                {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }

    /* Pattern6
         *
        * *
       * * *
      * * * *
     * * * * *
      * * * *
       * * *
        * *
         *
     */
    static void Pattern6(int n)
    {
        for(int row = 1; row <= 2*n -1; row++)
        {
            if(row <= n)
            {
                for(int col = 1; col <= n-row; col++)
                {
                    System.out.print(" ");
                }
                for(int col = 1; col <= row; col++)
                {
                    System.out.print("* ");
                }
            }
            else if (row > n)
            {
                for(int col = 1; col <= row - n; col++)
                {
                    System.out.print(" ");
                }
                for(int col = 1; col <= 2*n-row; col++)
                {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }

    /* Pattern7
     *        *
     **      **
     ***    ***
     ****  ****
     **********
     ****  ****
     ***    ***
     **      **
     *        *
     */
    static void Pattern7(int n)
    {
        for(int row = 1; row <= 2*n-1; row++)
        {
            if(row <= n)
            {
                for(int col = 1; col <= row; col++)
                {
                    System.out.print("*");
                }
                for(int col = 1; col <= 2*(n - row); col++)
                {
                    System.out.print(" ");
                }
                for(int col = 1; col <= row; col++)
                {
                    System.out.print("*");
                }
            }
            else
            {
                for(int col = 1; col <= 2*n-row; col++)
                {
                    System.out.print("*");
                }
                for(int col = 1; col <= 2*(row-n); col++)
                {
                    System.out.print(" ");
                }
                for(int col = 1; col <= 2*n-row; col++)
                {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
    /*
            1
          2 1 2
        3 2 1 2 3
      4 3 2 1 2 3 4
    5 4 3 2 1 2 3 4 5
     */

    static void Pattern8(int n)
    {
        for(int row = 1; row <= n; row++)
        {
            for(int col = 1; col <=2*(n-row); col++)
            {
                System.out.print(" ");
            }
            for(int col = row; col >= 1; col--)
            {
                System.out.print(col + " ");
            }
            for(int col = 2; col <= row; col++)
                System.out.print(col + " ");

            System.out.println();
        }
    }

    /*
         1
        212
       32123
      4321234
       32123
        212
         1
     */

    static void Pattern9(int n)
    {
        for(int row = 1; row < 2*n; row++) {
            if (row <=n)
            {
                for (int col = 1; col <= n - row; col++)
                {
                    System.out.print(" ");
                }
                for(int col = row; col >= 1; col--)
                {
                    System.out.print(col);
                }
                for(int col = 2; col <= row; col++)
                {
                    System.out.print(col);
                }
                for(int col = 1; col <= n-row; col++)
                {
                    System.out.print(" ");
                }
                System.out.println();
            }

            else
            {
                for (int col = 1; col <= row- n; col++)
                {
                    System.out.print(" ");
                }
                for(int col = 2*n - row; col >= 1; col--)
                {
                    System.out.print(col);
                }
                for(int col = 2; col <= 2*n-row; col++)
                {
                    System.out.print(col);
                }
                System.out.println();
            }

        }
    }
    /*
         4 4 4 4 4 4 4
         4 3 3 3 3 3 4
         4 3 2 2 2 3 4
         4 3 2 1 2 3 4
         4 3 2 2 2 3 4
         4 3 3 3 3 3 4
         4 4 4 4 4 4 4
     */

}