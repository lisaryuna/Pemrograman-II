package soal2;

public class Dog extends Pet{
    private String furColour;
    private String[] ability;
    public Dog(String name, String breed, String furColour, String[] ability) {
        super(name, breed);
        this.furColour = furColour;
        this.ability = ability;
    }

    public void displayDogDetail() {
        System.out.println();
        super.display();
        System.out.println("Memiliki warna Bulu: " + this.furColour);
        String abilityStr = String.join(" ", ability);
        System.out.println("Memiliki kemampuan: " + abilityStr);
    }
}
