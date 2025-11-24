package designpattern.myapp.pages;

import designpattern.myapp.core.*;

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

        Page nextPage = PageFactory.createPage(choice);

        if (nextPage == null && choice != 0) {
            System.out.println("Pilihan tidak valid");
            return this;
        }

        return nextPage;
    }
}
