public class Fruit {
    private String fruitName;
    private double weight, price, quantity;

    public String getFruitName() {
        return fruitName;
    }
    public void setFruitName(String fruitName) {
        this.fruitName = fruitName;
    }

    public double getWeight() {
        return weight;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    public double getQuantity() {
        return quantity;
    }
    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public double getPriceBefore() {
        return price * (quantity/weight);
    }

    public double getDiscount() {
        int discountBlockCount = (int) (this.quantity / 4);
        double discount;
        discount = discountBlockCount * (4 * this.price) * 0.02;
        return discount;
    }


    public double getPriceAfter() {
        return getPriceBefore() - getDiscount();
    }

    public void fruitInfo(){
        System.out.println("Nama Buah: " + getFruitName());
        System.out.println("Berat: " + getWeight());
        System.out.println("Harga: " + getPrice());
        System.out.println("Jumlah Beli: " + getQuantity() + "kg");
        System.out.println("Harga Sebelum Diskon: Rp" + getPriceBefore());
        System.out.println("Total Diskon: Rp" + getDiscount());
        System.out.println("Harga Setelah Diskon: Rp" + getPriceAfter());
        System.out.println();

    }
}
