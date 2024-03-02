package java_perulangan;

import java.util.Scanner;

public class no2 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        
        int[] sisi = new int[3];

        for (int i = 0; i < 3; i++) {
            System.out.print("Masukkan Sisi " + (i + 1) + " = ");
            sisi[i] = userInput.nextInt();
        }

        boolean semuaSisiSama = true;
        for (int i = 1; i < 3; i++) {
            if (sisi[i] != sisi[0]) {
                semuaSisiSama = false;
                break;
            }
        }

        if (semuaSisiSama) {
            System.out.println("Termasuk Kubus");
        } else {
            System.out.println("Bukan Termasuk Kubus");
        }

        userInput.close();
    }
}
