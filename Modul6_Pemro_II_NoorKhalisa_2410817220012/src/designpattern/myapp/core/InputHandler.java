package designpattern.myapp.core;

import java.util.Scanner;

public class InputHandler {
    private Scanner scanner;

    public InputHandler() {
        this.scanner = new Scanner(System.in);
    }

    public String getString(String prompt) {
        System.out.print(prompt);
        return this.scanner.nextLine();
    }

    public int getInt(String prompt) {
        while(true) {
            System.out.print(prompt);
            String input = this.scanner.nextLine();

            try {
                return Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("Input salah! Harap masukkan angka.");
            }
        }
    }

    public void close() {
        this.scanner.close();
    }
}
