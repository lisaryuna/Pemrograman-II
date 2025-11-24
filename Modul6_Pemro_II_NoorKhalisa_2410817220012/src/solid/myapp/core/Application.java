package solid.myapp.core;

import solid.myapp.pages.MainMenuPage;
import solid.myapp.repository.InMemoryUserProfileRepository;
import solid.myapp.repository.UserProfileRepository;

public class Application {
    private InputHandler inputHandler;
    private Page currentPage;
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
