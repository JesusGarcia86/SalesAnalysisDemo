import java.util.*;
import java.io.*;

public class SalesAnalysisDemo
{

    public static void main(String [] args) throws IOException
    {
	 File file = new File("SalesData.txt");
	 Scanner inputFile = new Scanner(file);
	 double total=0;
	 int count=0;
	 double finaltotal=0;
	 double greatest=0;
	 double lowest=Integer.MAX_VALUE;
	 int num=0;
	 int num1=0;

	while(inputFile.hasNext())
	{
	String s = inputFile.nextLine();
	StringTokenizer token = new StringTokenizer(s,",");
	count++;

		while(token.hasMoreTokens())
		{
		total+=Double.parseDouble(token.nextToken());
		}

		if(total>greatest)
		{
			greatest=total;
			num=count;
		}

		if (total<lowest)
		{
		lowest=total;
		num1=count;
		}


		finaltotal+=total;

	System.out.printf("Weekly sales from week " + count + " is "+ "$%.2f\n ", total);
	System.out.printf("Average for week " + count + " is "+ "$%.2f\n ", (total/7));
	total=0;
	}
	System.out.printf("Total sale of all weeks = "+ "%.2f\n", finaltotal);
	System.out.printf("Average weekly sales = "+ "%.2f\n", (finaltotal/count));
	System.out.println("The week number with the highest amount of sales is: " + num);
	System.out.println("The week number with the lowest amount of sales is: " + num1);
	}


}
