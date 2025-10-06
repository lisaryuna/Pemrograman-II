public class FruitStore {
    public static void main(String[] args) {
        Fruit fruit1 = new Fruit();
        fruit1.setFruitName("Apel");
        fruit1.setWeight(0.4);
        fruit1.setPrice(7000);
        fruit1.setQuantity(40);

        Fruit fruit2 = new Fruit();
        fruit2.setFruitName("mangga");
        fruit2.setWeight(0.2);
        fruit2.setPrice(3500);
        fruit2.setQuantity(15);

        Fruit fruit3 = new Fruit();
        fruit3.setFruitName("alpukat");
        fruit3.setWeight(0.25);
        fruit3.setPrice(10000);
        fruit3.setQuantity(12);

        fruit1.fruitInfo();
        fruit2.fruitInfo();
        fruit3.fruitInfo();
    }
}
