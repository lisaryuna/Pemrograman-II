package soal2;

public class Pet {
    private String name, breed;

    public Pet(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }

    public void display() {
        System.out.println("Detail Hewan Peliharaan: " );
        System.out.println("Nama hewan peliharaanku adalah: " + this.name);
        System.out.println("Dengan ras: " + this.breed);
    }
}
