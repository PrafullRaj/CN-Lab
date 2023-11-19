import java.util.Scanner;

class Main
{
  
public static void main (String[]args)
  {
    
Scanner sc = new Scanner (System.in);
    
 
System.out.print ("Enter codeword 1: ");
    
String codeword1 = sc.nextLine ();
    
 
System.out.print ("Enter codeword 2: ");
    
String codeword2 = sc.nextLine ();
    
 
String xorRet = xorCs (codeword1, codeword2);
    
System.out.println (xorRet);
  
} 
 
public static String xorCs (String codeword1, String codeword2)
  {
    
if (codeword1.length () != codeword2.length ())
      {
	
return "-1";
      
}
    else
      {
	
StringBuilder xorRet = new StringBuilder ();
	
for (int i = 0; i < codeword1.length (); i++)
	  {
	    
char bit1 = codeword1.charAt (i);
	    
char bit2 = codeword2.charAt (i);
	    
xorRet.append (bit1 == bit2 ? '0' : '1');
	  
} 
return xorRet.toString ();
      
}
  
}

}
