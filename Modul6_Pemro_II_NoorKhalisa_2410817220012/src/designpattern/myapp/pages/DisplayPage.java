package designpattern.myapp.pages;

import designpattern.myapp.core.AbstractPage;
import designpattern.myapp.core.Application;
import designpattern.myapp.core.InputHandler;
import designpattern.myapp.core.Page;
import designpattern.myapp.model.UserProfile;

public class DisplayPage extends AbstractPage {

    @Override
    public void showContent() {
        System.out.println("LIHAT DATA PROFIL");
    }

    @Override
    public Page evaluateInput(InputHandler inputHandler, Application app) {
        UserProfile profile = app.getUserProfileRepository().getUserProfile();
        if (profile == null) {
            System.out.println("Belum ada data yang diinput.");
        } else {
            System.out.println("Nama:  " + profile.getName());
            System.out.println("Umur: " + profile.getAge());
            System.out.println("Hobi: " + profile.getHobby());
        }

        inputHandler.getString("\nTekan Enter untuk kembali ke menu utama.");
        return new MainMenuPage();
    }
}
