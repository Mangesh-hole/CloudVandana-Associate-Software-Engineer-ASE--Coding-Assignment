import java.lang.*;
import java.util.*;

public class RomanToIntger
{
    int value(char n)
    {
        if(n == 'I')
           return 1;
        if(n == 'V')
           return 5;
        if(n == 'X')
           return 10;
        if(n == 'L')
           return 50;
        if(n == 'C')
           return 100;
        if(n == 'D')
           return 500;
        if(n == 'M')
           return 1000;
        return -1;
    }
      int romanToDecimal(String str)
        {
          int res = 0;
          for(int i = 0; i < str.length(); i++)
             {
                int s1 = value(str.charAt(i));
                if(i + 1 < str.length())
                  {
                    int s2 = value(str.charAt(i + 1));
                    if(s1 > s2)
                      {
                        res = res + s1;
                      }
                      else
                        {
                            res = res + s2 - s1;
                            i++;
                        }
                  }
                  else
                     {
                        res = res + s1;
                     }              
             }
             return res;
      }
      public static void main(String args[])
       {
         RomanToIntger val = new RomanToIntger();
         String str = "IX";
         System.out.println("Integer from of Roman Number" + " is " + val.romanToDecimal(str));  
       }
}