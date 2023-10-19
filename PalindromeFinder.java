import java.util.Scanner;

public class PalindromeFinder {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Masukkan angka: ");
            int angka = input.nextInt();

            int nextPalindrome = findNextPalindrome(angka);
            System.out.println("Angka palindrome terdekat selanjutnya dari " + angka + " adalah " + nextPalindrome);
        }
    }

    public static int findNextPalindrome(int angka) {
        while (true) {
            angka++;
            if (isPalindrome(angka)) {
                return angka;
            }
        }
    }

    public static boolean isPalindrome(int angka) {
        String angkaStr = Integer.toString(angka);
        int panjang = angkaStr.length();
        for (int i = 0; i < panjang / 2; i++) {
            if (angkaStr.charAt(i) != angkaStr.charAt(panjang - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}