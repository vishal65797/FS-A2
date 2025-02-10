// Mr.Bob and Mr.Cob are working on a Military Mission. 
// They are supposed to encode the message and send the message to the under-cover team.

// Where Cob has written a script. Where the Script says double all the ascii values other than mentioned in the bracket
// (97,101,105,111,117,65,69,73,79,85) and place a '#' in between. 

// Help Bob in writing the Code. 


// Sample Test Case-1
// input = attack the enemy
// output = at#tt#tac#ck#k t#th#he en#nem#my#y


import java.util.*;
public class prog2
{
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        String s=in.nextLine();
        System.out.println(DecodeMessage(s));
    }
    static String DecodeMessage(String s)
    {
        List<Integer> al=new ArrayList<>();
        al.add(97);
        al.add(101);
        al.add(105);
        al.add(111);
        al.add(117);
        al.add(65);
        al.add(69);
        al.add(73);
        al.add(79);
        al.add(85);
        String result="";
        char[] ch=s.toCharArray();
        for(int i=0;i<s.length();i++)
        {
            if(al.contains((int)ch[i]))
                result+=ch[i];
            else{
                result+=ch[i]+"#"+ch[i];
            }
        }
        return result;
    }
}