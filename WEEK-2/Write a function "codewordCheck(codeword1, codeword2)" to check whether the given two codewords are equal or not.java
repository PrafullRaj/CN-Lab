import java.util.Scanner;

public class CodewordChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter codeword 1: ");
        String codeword1 = scanner.nextLine();
        System.out.print("Enter codeword 2: ");
        String codeword2 = scanner.nextLine();
        int result = codewordCheck(codeword1, codeword2);
        System.out.println("The number of different bits is: " + result);
    }

    public static int codewordCheck(String codeword1, String codeword2) {
        if (codeword1.equals(codeword2)) {
            return 0;
        } else {
            int count = 0;
            for (int i = 0; i < codeword1.length(); i++) {
                if (codeword1.charAt(i) != codeword2.charAt(i)) {
                    count++;
                }
            }
            return count;
        }
    }
}
