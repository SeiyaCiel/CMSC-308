import java.util.*;

public class CMSC308_MIDTERM_DAVID 
{
    public static void main(String[] args) throws Exception 
    {
        Scanner scanner = new Scanner(System.in);
        
        Boolean mj = true;

        while (mj == true) 
        {
            System.out.print("Number of Test Cases: ");
            int TCaseNumber = scanner.nextInt();
            List<String> TCaseResults = new ArrayList<String>();

            if (TCaseNumber > 0) 
            {
                for (int i = 0; i < TCaseNumber; i++) 
                {
                    System.out.print("Number of Holidays: ");
                    int NumOfHolidays = scanner.nextInt();

                    scanner = new Scanner(System.in);

                    System.out.print("Day of Holidays: ");
                    String input = scanner.nextLine();

                    String[] inputs = input.split("\\s+");

                    if (NumOfHolidays == inputs.length) 
                    {
                        TCaseResults.add(ProcessOfHolidays(inputs));
                    } 
                    else 
                    {
                        System.out.println();
                        System.out.println("Invalid Input!");
                        TCaseResults.add("Invalid case!");
                    }
                }

                System.out.println();
                for (int i = 0; i < TCaseResults.size(); i++) 
                {
                    System.out.println(String.format("Number of Holidays for Test Case %s: %s ", i + 1, TCaseResults.get(i)));
                }
                mj = false;
            } 
            else 
            {
                System.out.println("Invalid Number of Test Cases!");
            }
        }
        scanner.close();
    }

    private static String ProcessOfHolidays(String[] inputs) 
    {
        HashSet<Integer> Holidays = new HashSet<Integer>(Arrays.asList(6, 7, 13, 14, 20, 21, 27, 28));
        int[] NumOfInputs = new int[inputs.length];

        try 
        {
            for (int i = 0; i < NumOfInputs.length; i++) 
            {
                NumOfInputs[i] = Integer.parseInt(inputs[i]);
            }

        } 
        catch (Exception e) 
        {
            return "Invalid Input!";
        }

        for (int input : NumOfInputs) 
        {
            Holidays.add(input);
        }

        List<Integer> SortOfHolidays = new ArrayList<Integer>(Holidays);
        Collections.sort(SortOfHolidays);

        String result = String.format("%s %s", SortOfHolidays.size(), SortOfHolidays);
        return result;
    }
}