import java.util.*;
import java.math.BigInteger;
public class OddManOut
{
    public static void main(String[] args)
    {
        try {
            System.out.println();
            Scanner scanner = new Scanner(System.in);
            int noOfCases = scanner.nextInt();
            List<BigInteger> numbersList = new ArrayList<BigInteger>();
            List<BigInteger> outputList = new ArrayList<BigInteger>();
            for(int i = 0; i < noOfCases; i++)
            {
                int noOfGuests = scanner.nextInt();
                for(int j = 0; j < noOfGuests; j++)
                {
                    BigInteger number = scanner.nextBigInteger();
                    numbersList.add(number);                    
                } 
                for(BigInteger bigInteger:numbersList)
                {
                    if(Collections.frequency(numbersList,bigInteger) == 1)
                    {
                        outputList.add(bigInteger);
                    }              
                }            
                numbersList.clear();
            }      
            for(int m = 0; m < noOfCases; m++)
            {
                System.out.println("Case #"+ (m+1) + ": "+ outputList.get(m));
            }
        }
        catch (Exception e) 
        {
        }
    }
}
