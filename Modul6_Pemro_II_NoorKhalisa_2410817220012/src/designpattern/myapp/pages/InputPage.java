package designpattern.myapp.pages;

import designpattern.myapp.core.AbstractPage;
import designpattern.myapp.core.Application;
import designpattern.myapp.core.InputHandler;
import designpattern.myapp.core.Page;
import designpattern.myapp.model.UserProfile;

public class InputPage extends AbstractPage {

    @Override
    public void showContent() {
        System.out.println("INPUT DATA");
        System.out.println("Silahkan isi data diri Anda.");
    }

    @Override
    public Page evaluateInput(InputHandler inputHandler, Application app) {
        String name = inputHandler.getString("Nama: ");
        int age = inputHandler.getInt("Umur: ");
        String hobby = inputHandler.getString("Hobi: ");

        UserProfile newProfile = new UserProfile(name, age, hobby);
        app.getUserProfileRepository().save(newProfile);

        System.out.println("Data profil berhasil disimpan!");
        return new MainMenuPage();
    }
}
