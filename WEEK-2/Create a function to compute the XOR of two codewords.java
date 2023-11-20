import java.util.Scanner;
class week2_1
{
    public static void main(String [] ard)
    {
        Scanner i1=new Scanner(System.in);
        System.out.println("Enter codewords : ");
        System.out.println(codewordcheck(i1.next(),i1.next()));
        i1.close();
    }
    static int codewordcheck(String a,String b)
    {
        int c=0;
        if(a.length()!=b.length())
            return -1;
        else
        for(int i=0;i<a.length();i++)
        {
            if(a.charAt(i)!=b.charAt(i))
                c=c+1;
        }
        return c;
    }
}
