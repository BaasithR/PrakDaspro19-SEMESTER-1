import java.util.Scanner;

public class StudiKasus2_19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String namaMahasiswa, perlombaan;
        int jumlahDok, peringkatJuara, danaPKM;

        System.out.print("Nama Mahasiswa  : ");
        namaMahasiswa= sc.nextLine();
        System.out.print("Jenis kegiatan (BELMAWA/BAKORMA/MANDIRI/PKM/LAINNYA) : ");
        perlombaan= sc.nextLine();
        System.out.print("Jumlah dokumen  : ");
        jumlahDok = sc.nextInt();
        System.out.print("Peringkat Juara  : ");
        peringkatJuara=sc.nextInt();

        if ((perlombaan.equalsIgnoreCase("BELMAWA")) || (perlombaan.equalsIgnoreCase("BAKORMA")) || (perlombaan.equalsIgnoreCase("MANDIRI")) && jumlahDok == 4) {
                System.out.println("Peringkat juara  : ");
                peringkatJuara=sc.nextInt();
            if (jumlahDok == 4 && peringkatJuara >0 && peringkatJuara <4) {
                System.out.println("Dana diberikan");
            } else {
                System.out.println("Dana tidak diberikan");
            }
        } else if (perlombaan.equalsIgnoreCase("PKM")) {
            if (jumlahDok ==4){
                System.out.println("Masukkan status lolos pendanaan tim(1 = lolos/0 = tidak): ");
                danaPKM = sc.nextInt();
                if (danaPKM == 1) {
                    System.out.println("Dana diberikan");
                } else if (danaPKM == 0) {
                    System.out.println("Dana tidak diberikan");

                } else {
                    System.out.println("Dana tidak diberikan");
                }
            }
        } else{
            System.out.println("Dana tidak diberikan");
        }
    }
}
