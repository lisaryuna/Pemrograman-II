package designpattern.myapp.core;

import designpattern.myapp.pages.DisplayPage;
import designpattern.myapp.pages.InputPage;

public class PageFactory {
    public static Page createPage(int choice) {
        switch (choice) {
            case 1: return new InputPage();
            case 2: return new DisplayPage();
            case 0: return null;
            default: return null;
        }
    }
}
