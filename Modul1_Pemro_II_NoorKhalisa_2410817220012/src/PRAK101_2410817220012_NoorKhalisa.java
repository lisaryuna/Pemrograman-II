import java.util.Scanner;

public class PRAK101_2410817220012_NoorKhalisa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Nama Lengkap: ");
        String fullName = input.nextLine();

        System.out.print("Masukkan Tempat Lahir: ");
        String birthPlace = input.nextLine();

        System.out.print("Masukkan Tanggal Lahir: ");
        int day = input.nextInt();

        System.out.print("Masukkan Bulan Lahir: ");
        int month = input.nextInt();

        System.out.print("Masukkan Tahun Lahir: ");
        int year = input.nextInt();

        System.out.print("Masukkan Tinggi Badan: ");
        int height = input.nextInt();

        System.out.print("Masukkan Berat Badan: ");
        double weight = input.nextDouble();

        String monthName = switch (month) {
            case 1 -> "Januari";
            case 2 -> "Februari";
            case 3 -> "Maret";
            case 4 -> "April";
            case 5 -> "May";
            case 6 -> "Juni";
            case 7 -> "Juli";
            case 8 -> "Agustus";
            case 9 -> "September";
            case 10 -> "Oktober";
            case 11 -> "November";
            case 12 -> "Desember";
            default -> "Bulan tidak tersedia";
        };

        System.out.println("Nama Lengkap " + fullName + ", Lahir di " + birthPlace +
                " pada Tanggal " + day + " " + monthName + " " + year);
        System.out.println("Tinggi Badan " + height + " cm dan Berat Badan " + weight + " kilogram");
        input.close();
    }
}
