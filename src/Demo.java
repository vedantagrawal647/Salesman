/* Q. There is a company that manufactures three types of products. In this company,there are
 5 salesmen. Each salesman is supposed to sell three products. Write a program to print
(i) The total no of sales by each salesman and
(ii) total sales of each item.
The structure of the class Company is as follows:-
class Company
{
	int products[];
}
Output :-
 Enter the sales of 3 items sold by salesman 1: 23 23 45
Enter the sales of 3 items sold by salesman 2: 34 45 63
Enter the sales of 3 items sold by salesman 3: 36 33 43
Enter the sales of 3 items sold by salesman 4: 33 52 35
Enter the sales of 3 items sold by salesman 5: 32 45 64
Total Sales By Salesman 1 = 91
Total Sales By Salesman 2 = 142
Total Sales By Salesman 3 = 112
Total Sales By Salesman 4 = 120
Total Sales By Salesman 5 = 141
Total sales of item 1 = 158
Total sales of item 2 = 198
Total sales of item 3 = 250*/

import java.util.Scanner;

class Company
{
    int salesman[][];

    Company()
    {
        salesman=new int[5][3];
        Scanner s=new Scanner(System.in);

        for(int i=0;i<5;i++)
        {
            System.out.print("Enter the sales of 3 items sold by salesman " + (i+1) + ": ");
            for(int j=0;j<3;j++)
            {
                int d=s.nextInt();
                salesman[i][j]=d;
            }

        }

    }
    public void test()
    {
          for(int i=0;i<5;i++)
          {
              int c=0;
              for (int j = 0; j < 3; j++)
              {
                      c=c+salesman[i][j];
              }
              System.out.println("Total Sales By Salesman " + (i + 1) + "= " + c);
          }

          for(int i=0;i<3;i++)
          {
              int c=0;
              for (int j = 0; j < 5; j++)
              {
                      c=c+salesman[j][i];
              }
              System.out.println("Total sales of item " + (i + 1) + "= " + c);
          }


    }
}

public class Demo {
    public static void main(String[] args) {
        Company obj = new Company();
        obj.test();
    }
}

