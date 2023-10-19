import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Masukkan sebuah kata: ");
            String kata = input.nextLine();

            if (isPalindrome(kata)) {
                System.out.println(kata + " adalah palindrome.");
            } else {
                System.out.println(kata + " bukan palindrome.");
            }
        }
    }

    public static boolean isPalindrome(String str) {
        str = str.toLowerCase(); // Ubah ke huruf kecil agar tidak sensitif terhadap huruf besar/kecil
        int panjang = str.length();

        for (int i = 0; i < panjang / 2; i++) {
            if (str.charAt(i) != str.charAt(panjang - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
