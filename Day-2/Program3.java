// Somu is playing a game. The Game Rules are as follows 

// A word will be given, where Ramu has to replace the letters of the word with V/C
// If the letter is a vowel it will be de denoted by upper case letter ‘V’ and 
// if the letter is a consonant it will be denoted by upper case letter ‘C’. 

// Note - The output will contain a word containing alternating sequence of ‘C’ and ‘V’.
// It is not permissible to have two or more consecutive V or C in Sequence.
// Letters will be only(a-z/A-Z)

// input = hello 
// output = CVCV

// Explanation - When we convert the above  "hello" we have CVCCV 
// but for the output It is not permissible to have two or more consecutive V or C in Sequence.
// so CVCCV changes to CVCV 

import java.util.*;

public class Program3
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String sb=sc.next();
        StringBuilder str=new StringBuilder();
        for(int i=0;i<sb.length();i++)
        {
            if(!(sb.charAt(i)=='A' || sb.charAt(i)=='E' || sb.charAt(i)=='I'|| sb.charAt(i)=='O' ||sb.charAt(i)=='U' || sb.charAt(i)=='a' || sb.charAt(i)=='e' || sb.charAt(i)=='i' || sb.charAt(i)=='o' || sb.charAt(i)=='u'))
                str.append('C');
            else str.append('V');
        }
        for(int i=1;i<str.length();i++)
        {
            if(str.charAt(i)==str.charAt(i-1))
            {
                str.deleteCharAt(i);
                i--;
            }
        }
        System.out.println(str.toString());
          sc.close();
    }
}