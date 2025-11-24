package designpattern.myapp.core;

public interface Page {
    void showMenu();
    Page evaluateInput(InputHandler inputHandler, Application app);
}
