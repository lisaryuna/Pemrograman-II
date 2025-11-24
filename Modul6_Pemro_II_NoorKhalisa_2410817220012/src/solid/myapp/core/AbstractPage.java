package solid.myapp.core;

public abstract class AbstractPage implements Page{

    @Override
    public void showMenu() {
        this.printHeader();
        this.showContent();
        this.printFooter();
    }

    protected abstract void showContent();

    private void printHeader() {
        System.out.println();
        System.out.println("========================================");
        System.out.println("                APLIKASI                ");
        System.out.println("========================================");
        System.out.println();
    }

    private void printFooter() {
        System.out.println();
        System.out.println("========================================");
        System.out.println("         Created by Lisa © 2025         ");
        System.out.println("========================================");
        System.out.println();
    }
}
