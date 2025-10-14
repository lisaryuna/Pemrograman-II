package soal2;

public class Cat extends Pet {
    private String furColour;
    public Cat(String name, String breed, String furColour) {
        super(name, breed);
        this.furColour = furColour;
    }

    public String getFurColour() {
        return furColour;
    }

    public void displayCatDetail() {
        System.out.println();
        super.display();
        System.out.println("Memiliki warna bulu: " + getFurColour());
    }
}
