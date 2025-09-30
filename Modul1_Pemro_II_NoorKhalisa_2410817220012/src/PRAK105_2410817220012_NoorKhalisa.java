import java.util.Scanner;

public class PRAK105_2410817220012_NoorKhalisa {
        public static void main(String[] args) {
        final double PI = 3.14;
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jari-jari: ");
        double radius = input.nextDouble();

        System.out.print("Masukkan tinggi: ");
        double height = input.nextDouble();

        double volume = PI * radius * radius * height;

        System.out.printf("Volume tabung dengan jari-jari %.1f cm dan tinggi %.1f cm adalah %.3f m3",
                radius, height, volume);

        input.close();
    }
}