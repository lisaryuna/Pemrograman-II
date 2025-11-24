package designpattern.myapp.core;

import designpattern.myapp.pages.MainMenuPage;
import designpattern.myapp.repository.InMemoryUserProfileRepository;
import designpattern.myapp.repository.UserProfileRepository;

public class Application {
    private designpattern.myapp.core.InputHandler inputHandler;
    private designpattern.myapp.core.Page currentPage;
    private boolean isRunning;
    private UserProfileRepository userProfileRepository;

    public Application() {
        this.inputHandler = new InputHandler();
        this.isRunning = true;
        this.currentPage = new MainMenuPage();
        this.userProfileRepository = new InMemoryUserProfileRepository();
    }

    public UserProfileRepository getUserProfileRepository() {
        return this.userProfileRepository;
    }

    public void start() {
        while (this.isRunning) {
            this.currentPage.showMenu();
            Page nextPage = this.currentPage.evaluateInput(this.inputHandler, this);

            if (nextPage == null) {
                this.isRunning = false;
            } else {
                this.currentPage = nextPage;
            }
        }
        System.out.println("Terima kasih!");
        this.inputHandler.close();
    }
}
