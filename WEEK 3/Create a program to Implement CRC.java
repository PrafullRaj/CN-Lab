import java.util.Scanner;

public class Main {

    public static String xor(String a, String b) {
        StringBuilder result = new StringBuilder();
        for (int i = 1; i < b.length(); i++) 
            result.append((a.charAt(i) == b.charAt(i)) ? '0' : '1');
        return result.toString();
    }

    public static String division(String dividend, String divisor) {
        int pick = divisor.length();
        String tmp = dividend.substring(0, pick);
        for (int i = pick; i < dividend.length(); i++) 
            tmp = (tmp.charAt(0) == '1') ? xor(divisor, tmp) + dividend.charAt(i) : xor("0".repeat(pick), tmp) + dividend.charAt(i);
        return (tmp.charAt(0) == '1') ? xor(divisor, tmp) : xor("0".repeat(pick), tmp);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String data = getUserInput("Enter the dataword: ", sc);
        String generator = getUserInput("Enter the CRC generator polynomial: ", sc);

        String dividend = data + "0".repeat(generator.length() - 1);
        String crc = division(dividend, generator);
        String codeword = data + crc;

        printInfo("Dataword", data);
        printInfo("CRC Generator", generator);
        printInfo("Dividend", dividend);
        printInfo("CRC", crc);
        printInfo("Codeword", codeword);
    }

    private static String getUserInput(String prompt, Scanner scanner) {
        System.out.print(prompt);
        return scanner.nextLine();
    }

    private static void printInfo(String label, String value) {
        System.out.println(label + ": " + value);
    }
}
