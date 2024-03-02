package java_perulangan;

import java.util.Scanner;

public class no3 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        int[] sisi = new int[3];

        for (int i = 0; i < 3; i++) {
            System.out.print("Masukkan Sisi " + (char) ('a' + i) + " = ");
            sisi[i] = userInput.nextInt();
        }

	if (sisi[0] > sisi[1] || sisi[1] > sisi[2]) {
            System.out.println("Masukkan Tidak Valid. Pastikan a <= b <= c.");
            return;
        }

        boolean sikuSiku = (sisi[0] * sisi[0] + sisi[1] * sisi[1] == sisi[2] * sisi[2]);
        boolean tumpul 	 = (sisi[0] * sisi[0] + sisi[1] * sisi[1] < sisi[2] * sisi[2]);

        if (sikuSiku) {
            System.out.println("Segitiga Siku-Siku");
        } else if (tumpul) {
            System.out.println("Segitiga Tumpul");
        } else {
            System.out.println("Segitiga Lancip");
        }

        userInput.close();
    }
}
