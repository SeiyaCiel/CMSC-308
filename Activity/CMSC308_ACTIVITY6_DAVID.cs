using System;
namespace CMSC308_ACTIVITY6_DAVID
{
   class Program
   {
       static void Main(string[] args)
       {
        
        List<char> letter = new List<char>() { 'S', 'X',  'C', 'O', 'M', 'P', 'U', 'T', 'E', 'R'  };
        bool bulls= true;
        do 
        {
        
        Console.WriteLine("     X C O M P U T E R S     ");
        Console.WriteLine("     1 2 3 4 5 6 7 8 9 0     ");
        Console.WriteLine("Enter a code: ");

        

        string ints = Console.ReadLine();
        int myindex = ints.Length;

        List<char> lists = new List<char>(myindex);

            for(int i = 0; i != myindex; i++)
            {
            string amp = ints[i].ToString().ToUpper();
                if(letter.Contains(Convert.ToChar(amp)) is (true))
                {
                    lists.Add(Convert.ToChar(amp));
                    bulls = false;
                }
                else
                {
                Console.WriteLine("Invalid Code");
                break;
                }
            }
            Console.Write("Equivalent Number: ");
            foreach (char a in lists)
            {
                int codes = letter.IndexOf(a);
                Console.Write(codes);
            }
            Console.ReadKey();
            Console.Clear();
            }
            while (bulls = true);
        }
    }
}
