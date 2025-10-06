public class Soal2Main {
    public static void main(String[] args) {
        Coffee coffee1 = new Coffee();
        coffee1.coffeeName = "Espresso";
        coffee1.size = "Medium";
        coffee1.price = 25000;

        coffee1.info();
        coffee1.setCustomerName("Alice");
        System.out.println("Pembeli Kopi: " + coffee1.getCustomerName());
        System.out.println("Pajak Kopi: Rp. " + coffee1.getCoffeeTax());
    }
}
