package soal2;

import java.util.Scanner;

public class PetMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pilih jenis hewan yang ingin diinputkan: ");
        System.out.println("1 = Kucing");
        System.out.println("2 = Anjing");
        System.out.print("Masukkan pilihan: ");
        int choice = scanner.nextInt();
        scanner.nextLine();

        if (choice == 1) {
            System.out.print("Nama hewan peliharaan: ");
            String name = scanner.nextLine();
            System.out.print("Ras: ");
            String breed = scanner.nextLine();
            System.out.print("Warna Bulu: ");
            String furColour = scanner.nextLine();

            Cat cat = new Cat(name, breed, furColour);
            cat.displayCatDetail();
        } else if (choice == 2) {
            System.out.print("Nama hewan peliharaan: ");
            String name = scanner.nextLine();
            System.out.print("Ras: ");
            String breed = scanner.nextLine();
            System.out.print("Warna Bulu: ");
            String furColour = scanner.nextLine();
            System.out.print("Kemampuan: ");
            String ability = scanner.nextLine();
            String[] abilityList = ability.split(",\\s*");

            Dog dog = new Dog(name, breed, furColour, abilityList);
            dog.displayDogDetail();
        } else {
            System.out.println();
        }

        scanner.close();
    }
}
