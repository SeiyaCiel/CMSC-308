import java.util.Scanner;

public class CMSCS308_ACTIVITY4_DAVID 
{
    public static void main(String []args) throws Exception
    {
        Scanner scanner = new Scanner(System.in);
        boolean belles = false;
        do
        {
            System.out.print("No. of test cases: ");
            int testcases = scanner.nextInt();

            if (1 <= testcases && testcases <= 10)
            {
                String TCases[] = new String[testcases];
                for (int a = 0; a < testcases; a++)
                {
                    scanner = new Scanner(System.in);
                    TCases[a] = scanner.nextLine();
                }
                System.out.println("Results: ");
                System.lineSeparator();

                for (String input:TCases)
                System.out.println(PTCases(input));
                belles = true;
            }
            else
                System.out.println("Enter 1-10 numbers only");

        }
        while (!belles);
        scanner.close();
    }

    private static String PTCases (String input)
    {
    String[] TCases = input.split("\\s+");
    if (TCases.length != 2)
        return "Your input is invalid!";

        try
        {
            int uber = Integer.parseInt(TCases[0]);
            int grab = Integer.parseInt(TCases[1]);

            if (uber < 1 || uber > 1000)
            return "Your input is invalid!";

            if (uber < grab)
            return "FIRST";

            else if (uber > grab)
            return "SECOND";

            else
            return "ANY";
        }    
        catch (Exception r)
        { 
           return "Your input is invalid!";
        }
    }
}




