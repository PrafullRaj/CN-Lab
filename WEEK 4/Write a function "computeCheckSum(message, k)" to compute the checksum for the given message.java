import java.util.Scanner;

public class Main {
    public static String computeBinaryChecksum(String binaryMessage, int k) {
        if (k <= 0) {
            throw new IllegalArgumentException("k should be a positive integer");
        }

        int blockLength = binaryMessage.length() / k;
        int checksum = 0;

        for (int i = 0; i < k; i++) {
            int start = i * blockLength;
            int end = Math.min((i + 1) * blockLength, binaryMessage.length());
            checksum += Integer.parseInt(binaryMessage.substring(start, end), 2);
        }

        return String.format("%8s", Integer.toBinaryString(~checksum & 0xFF)).replace(' ', '0');
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a binary message: ");
        String binaryMessage = scanner.nextLine();

        System.out.print("Enter the number of blocks (k): ");
        int k = scanner.nextInt();

        String result = computeBinaryChecksum(binaryMessage, k);

        System.out.println("Checksum: " + result);

        scanner.close();
    }
}
