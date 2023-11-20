import java.util.Scanner;
public class week3_2 
{
    public static void main(String[] ar)
    {
        Scanner i1=new Scanner(System.in);
        System.out.println("Enter size of dataword : ");
        int r=hammingR(i1.nextInt());
        System.out.println("Number of redundant bits required for the given message are "+r);
        bitPositions(r);
        i1.close();
    }
    static int hammingR(int m)
    {
        // 2^r >= (m+r+1)
        int r=0;
        for(r=0;;r++)
        {
            if((Math.pow(2,r)-r) >= (m+1))
                return r;
        }
    }
    static void bitPositions(int r)
    {
        System.out.println("Bit positions are : ");
        for(int i=0;i<r;i++)
        {
            System.out.print((int)Math.pow(2,i)+" ");
        }
    }
}
