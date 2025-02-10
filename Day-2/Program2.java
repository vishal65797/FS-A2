//Rahul and Rohith are playing a switch game.
// Rahul has given a string PresentState that contains only '+' and '-' . Both take turns to switch two consecutive "++" into "--" . The game ends when a person can no longer make a move, and therefore the other person will be the winner.
// Return all possible states of the string presentState after one valid move. You may return the answer in any order.If there is no valid move, return an empty list [] .

// Input Format:
// -------------
// Line-1: A string represents present state.

// Output Format:
// --------------
// Array of strings of possible states.

// Constraints:

    
//     1 <= string.length <= 500   
//     string[i] is either '+' or '-'

// Sample Input-1:
// ---------------
// --++- 

// Sample Output-1:
// ----------------
// [-----]

// Explanation:
// -------------
// ++ will be converted as --. Then game ends.

// Sample Input-2:
// ---------------
// --+++-++

// Sample Output-2:
// ----------------
// [----+-++, --+---++, --+++---]

import java.util.*;
public class Program2
{
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        String s=in.next();
        List<StringBuilder> al=new ArrayList<>();
        for(int i=1;i<s.length();i++)
        {
            StringBuilder sb=new StringBuilder(s);
            if(s.charAt(i)==s.charAt(i-1) && s.charAt(i)=='+')
            {
                sb.setCharAt(i-1,'-');
                sb.setCharAt(i,'-');
                al.add(sb);
            }
            
        }
        for(int i=0;i<al.size();i++)
        {
            System.out.println(al.get(i));
        }
        
    }
}