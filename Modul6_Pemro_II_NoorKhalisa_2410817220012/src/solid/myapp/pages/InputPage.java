package solid.myapp.pages;

import solid.myapp.core.AbstractPage;
import solid.myapp.core.Application;
import solid.myapp.core.InputHandler;
import solid.myapp.core.Page;
import solid.myapp.model.UserProfile;

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
