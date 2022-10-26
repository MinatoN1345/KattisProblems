import java.util.*;
public class ANewAlphabet
{
    public static void main(String[] args)
    {
        try {
            Scanner scanner = new Scanner(System.in);
            String toConvert = scanner.nextLine();
            char[] arrayForWord = new char[toConvert.length()];
            String fullWord= "";
            for (int i = 0; i < toConvert.length(); i++)
            {
              arrayForWord[i] = toConvert.charAt(i);
              if (arrayForWord[i] == 'A' || arrayForWord[i] == 'a')
              {
                fullWord = fullWord + "@";
              }
              else if (arrayForWord[i] == 'B' || arrayForWord[i] == 'b')
              {
                fullWord = fullWord + "8";
              }
              else if (arrayForWord[i] == 'C' || arrayForWord[i] == 'c')
              {
                fullWord = fullWord + "(";
              }
              else if (arrayForWord[i] == 'D' || arrayForWord[i] == 'd')
              {
                fullWord = fullWord + "|)";
              }
              else if (arrayForWord[i] == 'E' || arrayForWord[i] == 'e')
              {
                fullWord = fullWord + "3";
              }
              else if (arrayForWord[i] == 'F' || arrayForWord[i] == 'f')
              {
                fullWord = fullWord + "#";
              }
              else if (arrayForWord[i] == 'G' || arrayForWord[i] == 'g')
              {
                fullWord = fullWord + "6";
              }
              else if (arrayForWord[i] == 'H' || arrayForWord[i] == 'h')
              {
                fullWord = fullWord + "[-]";
              }
              else if (arrayForWord[i] == 'I' || arrayForWord[i] == 'i')
              {
                fullWord = fullWord + "|";
              }
              else if (arrayForWord[i] == 'J' || arrayForWord[i] == 'j')
              {
                fullWord = fullWord + "_|";
              }
              else if (arrayForWord[i] == 'K' || arrayForWord[i] == 'k')
              {
                fullWord = fullWord + "|<";
              }
              else if (arrayForWord[i] == 'L' || arrayForWord[i] == 'l')
              {
                fullWord = fullWord + "1";
              }
              else if (arrayForWord[i] == 'M' || arrayForWord[i] == 'm')
              {
                fullWord = fullWord + "[]\\/[]";
              }
              else if (arrayForWord[i] == 'N' || arrayForWord[i] == 'n')
              {
                fullWord = fullWord + "[]\\[]";
              }
              else if (arrayForWord[i] == 'O' || arrayForWord[i] == 'o')
              {
                fullWord = fullWord + "0";
              }
              else if (arrayForWord[i] == 'P' || arrayForWord[i] == 'p')
              {
                fullWord = fullWord + "|D";
              }
              else if (arrayForWord[i] == 'Q' || arrayForWord[i] == 'q')
              {
                fullWord = fullWord + "(,)";
              }
              else if (arrayForWord[i] == 'R' || arrayForWord[i] == 'r')
              {
                fullWord = fullWord + "|Z";
              }
              else if (arrayForWord[i] == 'S' || arrayForWord[i] == 's')
              {
                fullWord = fullWord + "$";
              }
              else if (arrayForWord[i] == 'T' || arrayForWord[i] == 't')
              {
                fullWord = fullWord + "']['";
              }
              else if (arrayForWord[i] == 'U' || arrayForWord[i] == 'u')
              {
                fullWord = fullWord + "|_|";
              }
              else if (arrayForWord[i] == 'V' || arrayForWord[i] == 'v')
              {
                fullWord = fullWord + "\\/";
              }
              else if (arrayForWord[i] == 'W' || arrayForWord[i] == 'w')
              {
                fullWord = fullWord + "\\/\\/";
              }
              else if (arrayForWord[i] == 'X' || arrayForWord[i] == 'x')
              {
                fullWord = fullWord + "}{";
              }
              else if (arrayForWord[i] == 'Y' || arrayForWord[i] == 'y')
              {
                fullWord = fullWord + "`/";
              }
              else if (arrayForWord[i] == 'Z' || arrayForWord[i] == 'z')
              {
                fullWord = fullWord + "2";
              }
              else
              {
                fullWord = fullWord + arrayForWord[i];
              }
            }
            System.out.println(fullWord);
        }

        catch (Exception e) 
        {
        }
    }
}
