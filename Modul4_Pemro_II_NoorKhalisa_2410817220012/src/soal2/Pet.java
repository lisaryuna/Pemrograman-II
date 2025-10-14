package soal2;

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

    public void display() {
        System.out.println("Detail Hewan Peliharaan: " );
        System.out.println("Nama hewan peliharaanku adalah: " + getName());
        System.out.println("Dengan ras: " + getBreed());
    }
}
