import java.util.*;
public class Oktalni
{
    public static void main(String[] args)
    {
        try {
            Scanner scanner = new Scanner(System.in);
            String input = scanner.next();
            int counter = 0;
            int three = 3;
            while(input.length() % 3 != 0)
            {
             input = "0" + input;
            }
            String[] groupArray = new String[input.length()/3];
            for (int i = 0; i < input.length(); i=i+3)
            {
             groupArray[counter] = input.substring(i,three);
             switch(groupArray[counter])
             {
                case "000":
                   groupArray[counter] = "0";
                   break;
                case "001":
                   groupArray[counter] = "1";
                   break;
                case "010":
                   groupArray[counter] = "2";
                   break;
                case "011":
                   groupArray[counter] = "3";
                   break;
                case "100":
                   groupArray[counter] = "4";
                   break;
                case "101":
                   groupArray[counter] = "5";
                   break;
                case "110":
                   groupArray[counter] = "6";
                   break;
                case "111":
                   groupArray[counter] = "7";
                   break;
             }
             three = three + 3;
             counter++;
            }            
            for(int j = 0; j < groupArray.length; j++)
            {
              System.out.print(groupArray[j]);
            }
        }

        catch (Exception e) 
        {
        }
    }
}
