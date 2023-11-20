//  2. Create a function to compute the XOR of two codewords.

import java.util.Scanner;
public class week2_2 
{
    public static void main(String[] ar)
    {
        Scanner i1=new Scanner(System.in);
        System.out.println("Enter codewords : ");
        xor(i1.next(),i1.next());
        i1.close();
    }
    static void xor(String a,String b)
    {
        if(a.length()!=b.length())
            System.out.println("-1");
        else
            for(int i=0;i<a.length();i++)
                System.out.print(a.charAt(i)^b.charAt(i));
    }
}
