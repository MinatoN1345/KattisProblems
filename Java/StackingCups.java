import java.util.*;
import java.lang.Character;
public class StackingCups
{
    public static void main(String[] args)
    {
        try{
            System.out.println();
            Scanner scanner = new Scanner(System.in);
            int noOfCases = scanner.nextInt();
            int[] radiusArray = new int[noOfCases];
            String[] colourArray = new String[noOfCases];
            boolean aDigit = false;
            for (int i = 0; i < noOfCases; i++) 
            {
             String input1 = scanner.next();
             String input2 = scanner.next();
             for(int j = 0; j < input1.length(); j++)
             {
              if(Character.isDigit(input1.charAt(j)))
              {
                aDigit = true;
              }
              else
              {
               aDigit = false; 
              }
             }
             if (aDigit)
             {
              int numericInput1 = Integer.parseInt(input1);
              numericInput1 = numericInput1 / 2;
              radiusArray[i] = numericInput1;
              colourArray[i] = input2;
             }
             else
             {
              radiusArray[i] = Integer.parseInt(input2);
              colourArray[i] = input1;
             }
            }
            int[] arrayToSort = Arrays.copyOf(radiusArray,radiusArray.length);
            Arrays.sort(arrayToSort);
            for (int k = 0; k < noOfCases; k++) 
            {
               int counter = 0;
                while(counter < noOfCases)
               {
                if(arrayToSort[k] == radiusArray[counter])
                {
                   System.out.println(colourArray[counter]);
                }
                counter++;
               }
            }
        }
        catch (Exception ex)
        {
        }       
    }
}
