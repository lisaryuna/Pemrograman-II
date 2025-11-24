package solid.myapp.pages;

import solid.myapp.core.AbstractPage;
import solid.myapp.core.Application;
import solid.myapp.core.InputHandler;
import solid.myapp.core.Page;

public class MainMenuPage extends AbstractPage {

    @Override
    public void showContent() {
        System.out.println("MENU UTAMA: ");
        System.out.println("[1] Input Data");
        System.out.println("[2] Tampilkan Data");
        System.out.println("[0] Keluar Aplikasi");
    }

    @Override
    public Page evaluateInput(InputHandler inputHandler, Application app) {
        int choice = inputHandler.getInt("Pilih Menu: ");

        switch(choice) {
            case 1: return new InputPage();
            case 2: return new DisplayPage();
            case 0: return null;
            default:
                System.out.println("Pilihan tidak valid");
                return this;
        }
    }
}
