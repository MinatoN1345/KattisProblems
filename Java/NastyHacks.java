import java.util.*;
public class NastyHacks
{
    public static void main(String[] args)
    {
        try{
            System.out.println();
            Scanner scanner = new Scanner(System.in);
            int noOfTestCases = scanner.nextInt();
            String[] resultArray = new String[noOfTestCases];
            for (int i = 0; i < noOfTestCases; i++){
                int r  = scanner.nextInt();
                int e  = scanner.nextInt();
                int c  = scanner.nextInt();
                if ((e - c) > r){
                    resultArray[i] = "advertise";
                }
                else if ((e - c) == r)
                {
                  resultArray[i] = "does not matter";  
                }
                else if ((e - c) < r)
                {
                  resultArray[i] = "do not advertise";  
                }
            }
            for (String result : resultArray){
              System.out.println(result);
            }
        }
        catch (Exception ex)
        {
        }       
    }
}
