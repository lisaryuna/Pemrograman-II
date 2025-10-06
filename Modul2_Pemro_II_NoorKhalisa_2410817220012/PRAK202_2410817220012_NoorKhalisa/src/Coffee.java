public class Coffee {
    public String coffeeName, size;
    private String customerName;
    public double price;

    public String getCoffeeName() {
        return coffeeName;
    }

    public String getSize() {
        return size;
    }

    public double getPrice() {
        return price;
    }

    public String getCustomerName() {
        return customerName;
    }
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public double getCoffeeTax() {
        return 0.11 * price;
    }

    public void info() {
        System.out.println("Nama Kopi: " + getCoffeeName());
        System.out.println("Ukuran: " + getSize());
        System.out.println("Harga: Rp. " + getPrice());
    }
}
