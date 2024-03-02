package java_perulangan;

import java.util.Scanner;

public class no1 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        
        System.out.print("Masukkan Nilai n = ");
        int n = userInput.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }

        userInput.close();
    }
}
