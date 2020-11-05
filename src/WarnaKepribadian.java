import java.util.Scanner;
/**
 * @author
 * NAMA     : Arsy Opraza Akma
 * KELAS    : IF1
 * NIM      : 10119001
 * Deskripsi Program: program tentang melihat kepribadian
 * berbasis OOP
 */

public class WarnaKepribadian {
    public String warnaFavorit, nama;
    public String foreground = "\033[38;2;";
    public String background = "\033[48;2;";
    public String[] netral = {"\033[0m", "\033[38;2;255;255;255m"};

    public String[] merah = {
            "MERAH",
            "112;0;0m",
            "1. Periang,\n" +
                    "2. Pemberani,\n" +
                    "3. Berani mengambil risiko dalam setiap langkah,\n" +
                    "4. Menyukai tantangan,\n" +
                    "5. Kurang sabar,\n" +
                    "6. Dapat menahan marah namun jika sudah tahap puncak toleransi, kemarahannya akan sulit dikontrol,\n" +
                    "7. memiliki energi kehangatan dan cinta."
    };
    public String[] hijau = {
            "HIJAU",
            "0;255;0m",
            "1. Romantis,\n" +
                    "2. Menyukai hal yang berbau alami dan keindahan,\n" +
                    "3. Teguh pada prinsip,\n" +
                    "4. Menginginkan kesempurnaan,\n" +
                    "5. Mudah cemburu,\n" +
                    "6. Mudah merasa iri,\n" +
                    "7. Menjungjung tinggi suatu nilai toleransi dan kepercayaan."
    };
    public String[] kuning = {
            "KUNING",
            "255;255;0m",
            "1. Optimis,\n" +
                    "2. Suka bergaul,\n" +
                    "3. Periang,\n" +
                    "4. Senang menolong,\n" +
                    "5. Lincah dan aktif,\n" +
                    "6. Tidak suka meremehkan kekurangan orang lain,\n" +
                    "7. Loyal,\n" +
                    "8. Hangat,\n" +
                    "9. Meskipun karakternya optimis dan idealis, seringkali goyah dan tidak stabil,\n" +
                    "10. Cenderung penakut."
    };
    public String[] biru = {
            "BIRU",
            "0;0;255m",
            "1. Menyenangkan,\n" +
                    "2. Bijaksana,\n" +
                    "3. Pembawaan diri tenang saat menghadapi masalah,\n" +
                    "4. Dinamis,\n" +
                    "5. Senang berbagi,\n" +
                    "6. Bersahabat,\n" +
                    "7. Tidak terlalu suka menjadi sorotan banyak orang,\n" +
                    "8. Menyembunyikan perasaan karena karakternya yang cenderung mencari jalan damai."
    };
    public String[] ungu = {
            "UNGU",
            "127;0;255m",
            "1. Optimis,\n" +
                    "2. Tidak pernah ragu,\n" +
                    "3. Menurutnya pasangan yang ideal adalah yang memiliki mental yang kuat,\n" +
                    "4. Memiliki ambisi yang benar,\n" +
                    "5. Memiliki empati yang besar,\n" +
                    "6. Memiliki sisi misterius sebab seringkali menutupi perasaannya,\n" +
                    "7. Terkadang bersikap keras kepala dan angkuh."
    };

    public void inputWarna() {
        String[][] warna = {merah, hijau, kuning, biru, ungu};
        for (String[] x : warna) {
            System.out.println(background.concat(x[1]).concat(netral[1]).concat("\t\t")
                    .concat(x[0]).concat("\t\t").concat(netral[0]));
        }

        System.out.print("\n");
        System.out.print("PILIH WARNA FAVORITMU : ");
        Scanner scanner = new Scanner(System.in);
        warnaFavorit = scanner.next().toUpperCase();
        System.out.print("NAMA KAMU : ");
        nama = scanner.next().toUpperCase();
    }

    public String prosesWarna() {
        String warna = "Warna Favoritmu adalah ".concat(foreground);
        switch (this.warnaFavorit) {
            case "MERAH" -> warna += String.join("", merah[1], merah[0], netral[0].concat("\n"), merah[2]);
            case "BIRU" -> warna += String.join("", biru[1], biru[0], netral[0].concat("\n"), biru[2]);
            case "HIJAU" -> warna += String.join("", hijau[1], hijau[0], netral[0].concat("\n"), hijau[2]);
            case "KUNING" -> warna += String.join("", kuning[1], kuning[0], netral[0].concat("\n"), kuning[2]);
            case "UNGU" -> warna += String.join("", ungu[1], ungu[0], netral[0].concat("\n"), ungu[2]);
            default -> warna = "Oops.. Belum teridentifikasi";
        }
        return warna;
    }

    public void tampilHasil() {
        System.out.print("\n");
        System.out.println("===HASIL TEST KEPRIBADIAN " + nama + "===");
        System.out.println(prosesWarna());
    }

    public static void main(String[] args) {
        System.out.println((char) 27 + "[31mYUK " + (char) 27 + "[32mCEK " + (char) 27 + "[33mKEPRIBADIANMU " + (char) 27 + "[96mDARI " + (char) 27 + "[35mWARNA " + (char) 27 + "[34mFAVORITMU ");
        System.out.print("\n");

        WarnaKepribadian warna = new WarnaKepribadian();
        warna.inputWarna();
        warna.tampilHasil();
    }
}
