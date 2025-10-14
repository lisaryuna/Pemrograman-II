package soal1;

import java.util.Scanner;

public class Pet {
    private String name, breed;

    public Pet(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public void input(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Nama Hewan Peliharaan: ");
        this.name = scan.nextLine();
        System.out.print("Ras: ");
        this.breed = scan.nextLine();
        scan.close();
    }

    public void display(){
        System.out.println();
        System.out.println("Detail Hewan Peliharaan: ");
        System.out.println("Nama hewan peliharaanku adalah: " + getName());
        System.out.println("Dengan ras: " + getBreed());
    }
}