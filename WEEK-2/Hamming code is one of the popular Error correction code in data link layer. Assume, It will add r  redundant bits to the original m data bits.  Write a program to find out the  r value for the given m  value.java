import java.util.Scanner;
public class week2_3 
{
    public static void main(String[] arg)
    {
        Scanner i1=new Scanner(System.in);
        System.out.println("Enter m : ");
        System.out.println("Number of redundant bits are : "+hammingR(i1.nextInt()));
        i1.close();
    }
    static int hammingR(int m)
    {
        int r=0;
        for(r=0;;r++)
        {
            if((Math.pow(2,r)-r)>=(m+1))
                return r;
        }
    }
}
