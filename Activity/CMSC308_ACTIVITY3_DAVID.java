import java.util.Scanner;

public class CMSC308_ACTIVITY3_DAVID
{
    public static void main(String []args)
    {
    	
        int english, math, science, mapeh;
        float avg, average;
        Scanner scanner = new Scanner(System.in);

		
        System.out.print("English:");
        english = scanner.nextInt();
        System.out.print("Math:");
        math = scanner.nextInt();
        System.out.print("Science:");
        science = scanner.nextInt();
        System.out.print("MAPEH:");
        mapeh = scanner.nextInt();
        scanner.close();

        avg = english + math + science + mapeh;
        
        average = (avg / (4 * 100)) * 100;
        System.out.println("Average: " + average);
        if(average>=100)
        {
            System.out.println("Invalid Grade");
        }
        else if(average>=98 && average<100)
        {
           System.out.println("With Highest Honors");
        } 
        else if(average>=95 && average<97.99)
        {
            System.out.println("With High Honors");
        }
        else if(average>=90 && average<94.99)
        {
            System.out.println("With Honors");
        }
        else if(average>=75 && average<89.99)
        {
            System.out.println("Passed");
        }
        else
        {
            System.out.println("Failed");
        }
    }
}