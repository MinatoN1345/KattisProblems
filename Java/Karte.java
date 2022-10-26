import java.util.*;
public class Karte
{
    public static void main(String[] args)
    {
        try{
            Scanner scanner = new Scanner(System.in);
            String input  = scanner.next();
            int position = 3;
            final int pTotal = 13;
            final int kTotal = 13;
            final int hTotal = 13;
            final int tTotal = 13;
            int pCount = 0;
            int kCount = 0;
            int hCount = 0;
            int tCount = 0;
            List<String> numbers = new ArrayList<String>();
            boolean duplicate = false;
            for (int i = 0; i < input.length(); i = i + 3){
                numbers.add(input.substring(i,position));
                position = position + 3;
            }
            for ( int j = 0; j < numbers.size(); j++){
                if (Collections.frequency(numbers,numbers.get(j)) == 2){
                      duplicate = true;
                }
                else{
                    if (numbers.get(j).startsWith("P")){
                        pCount++;
                    }
                    else if (numbers.get(j).startsWith("K")){
                        kCount++;
                    }
                    else if (numbers.get(j).startsWith("H")){
                        hCount++;
                    }
                    else if(numbers.get(j).startsWith("T")){
                        tCount++;
                    }
                }
            }
            if (duplicate){
                System.out.println("GRESKA");
            }
            else{
                System.out.println((pTotal - pCount) + " " + (kTotal - kCount) + " " + (hTotal - hCount) + " " + (tTotal - tCount));
            }
        }
        catch (Exception ex)
        {
        }       
    }
}
