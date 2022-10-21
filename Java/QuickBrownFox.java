import java.util.*;
public class QuickBrownFox
{
    public static void main(String[] args)
    {
        try{
            Scanner scanner = new Scanner(System.in);
            String pangram ="abcdefghijklmnopqrstuvwxyz";
            String missing = "";
            List<String> resultsList = new ArrayList<String>();
            int noOfTestCases = scanner.nextInt();
            String input = "";
            for(int i = 0; i <= noOfTestCases; i++)
            {
                input  = scanner.nextLine().toLowerCase();
                for(int j = 0; j < pangram.length(); j++){
                    String charAt = pangram.charAt(j) +"";
                    if(Character.isLetter(pangram.charAt(j)))
                    {
                        if (!input.contains(charAt)){
                            missing = missing + pangram.charAt(j);
                        }
                    }
                }
                if( i > 0){
                    if(missing.length() == 0)
                    {
                        resultsList.add("pangram");
                    }else
                    {
                        resultsList.add(missing);
                    }
                }
                missing = "";
            }
            for(String result : resultsList)
            {
                if(result.equals("pangram"))
                {
                    System.out.println(result);
                }
                else
                {
                    System.out.println("missing " + result);
                }
            }
        }
        catch (Exception ex)
        {
        }       
    }
}
