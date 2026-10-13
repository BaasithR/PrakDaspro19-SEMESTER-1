// KEDAI KOPI SENJA //

import java.util.Scanner;

public class StudiKasus1_19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int hargaPerCup = 18000;
        int jumlahCup, uangBayar;
        int totalHarga, diskon, totalBayar=0;
        int kembalian, kurang;

        System.out.print("Masukkan jumlah cup : ");
        jumlahCup = sc.nextInt();
        System.out.print("Masukkan uang bayar : ");
        uangBayar = sc.nextInt();
        totalHarga = jumlahCup*uangBayar;
        diskon = 0;

        if (totalHarga >= 100000) {
            diskon=totalHarga*10/100;
        } else{
            totalBayar = totalHarga-diskon;
        }
        System.out.print("Total harga : Rp " +totalHarga);
        System.out.println("Diskon   : Rp "+diskon);
        System.out.println("Total Bayar   : Rp "+ totalBayar);
    }
}