import java.util.*;
public class parity{
public static void main(String[] args) {
String dataword1 = "1000111";
System.out.println("For dataword: " + dataword1 + ", parity bit: " + computeParity(dataword1));
String dataword2 = "11100";
System.out.println("For dataword: " + dataword2 + ", parity bit: " + computeParity(dataword2));
}
public static int computeParity(String dataword) {
int count = 0;
for (int i = 0; i < dataword.length(); i++) {
if (dataword.charAt(i) == '1') {
count++;
}
}
return (count % 2 == 0) ? 0 : 1;
}
}

