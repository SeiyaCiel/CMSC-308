import java.util.Scanner;

public class CMSC308_ACTIVITY7_DAVID
{
    public static void main(String []args)
    {
        Scanner scanner = new Scanner(System.in);

        int bulls = 0;
        do 
        {
            System.out.print("Calculator Menu\r\n"
                + "[1] Addition\r\n"
                + "[2] Subtraction\r\n"
                + "[3] Multiplication\r\n"
                + "[4] Division\r\n"
                + "[5] Exponent\r\n"
                + "[6] Modulo\r\n"
                + "[7] Exit\r\n");

            try
            {
                System.out.print("Choose an operation: ");
                int operations = Integer.parseInt(scanner.next());

                switch(operations)
                {
                case 1:
                    
                    System.out.println("Enter the Augend: ");
                    int au = scanner.nextInt();
                    System.out.println("Enter the Addend: ");
                    int ad = scanner.nextInt();
                    int total = au + ad;
                    System.out.println("The sum of " + au + " and " + ad + " is " + total);
                    break;

                case 2:
                    
                    System.out.println("Enter the Minued: ");
                    int min = scanner.nextInt();
                    System.out.println("Enter the Subtrahend: ");
                    int sub = scanner.nextInt();
                    int totals = min - sub;
                    System.out.println("The difference of " + min + " and " + sub + " is " + totals);
                    break;

                case 3:
                    
                    System.out.println("Enter the Multiplicand: ");
                    int mul = scanner.nextInt();
                    System.out.println("Enter the Multiplier: ");
                    int mult = scanner.nextInt();
                    int totalss = mul * mult;
                    System.out.println("The product of " + mul + " and " + mult + " is " + totalss);
                    break;

                case 4:
                    
                    System.out.println("Enter the Dividend: ");
                    int div = scanner.nextInt();
                    System.out.println("Enter the Divisor: ");
                    int divi = scanner.nextInt();
                    int totalsss = div / divi;
                    System.out.println("The quotient of " + div + " and " + divi + " is " + totalsss);
                    break;

                case 5:
                    
                    System.out.println("Enter the Base: ");
                    double base = scanner.nextInt();
                    System.out.println("Enter the Exponent: ");
                    double expo = scanner.nextInt();
                    double totalssss = Math.pow(base, expo);
                    System.out.println("The result of " + base + " and " + expo + " is " + totalssss);
                    break;

                case 6:
                    
                    System.out.println("Enter the Numerator: ");
                    int nume = scanner.nextInt();
                    System.out.println("Enter the Denominator: ");
                    int deno = scanner.nextInt();
                    int totalsssss = nume % deno;
                    System.out.println("The remainder of " + nume + " and " + deno + " is " + totalsssss);
                    break;

                case 7:
                    
                    bulls = 1;
                    System.out.println("Arigatou Gozaimasu");
                    break;

                default:
                    System.out.println("Input was invalid: ");
                    
                }
            } 
            catch (Exception r)
            {
                System.out.println("Input was invalid: ");

            }
        }while (bulls == 0);
    
    }
}
