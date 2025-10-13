package soal1;

import java.util.Scanner;

public class Pet {
    private String name, breed;

    Pet(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }


    public void input(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Nama Hewan Peliharaan: ");
        String name = scan.nextLine();
        System.out.print("Ras: ");
        String breed = scan.nextLine();
    }

    public void display(){
        System.out.println();
        System.out.println("Detail Hewan Peliharaan: ");
        System.out.println("Nama hewan peliharaanku adalah: " + name);
        System.out.println("Dengan ras: " + breed);
    }
}
