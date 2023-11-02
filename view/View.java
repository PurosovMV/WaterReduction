package view;

import java.util.Scanner;

import controller.Controller;

public class View {
    private final Controller controller;

    public View(Controller controller) {
        this.controller = controller;
    }


    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }

    public void run() {

        while (true) {
            System.out.println("Выбор режима фильтрации:");
            System.out.println("1. Безнапорный");
            System.out.println("2. Напорный");
            System.out.println("3. Напорно-безнапорный");
            System.out.println("4. Выход");

            String input = prompt("Выберете действие: ");
            switch (input) {
                case ("4"):
                    return;
                case ("1"):
                return;
                    
                case ("2"):
                    return;
                case ("3"):
                    System.out.println();
                    controller.pressureFreeFiltrationMode();
                    System.out.println();
                    break;
                default:
                    System.out.println("Неизвестная команда!");
                    break;

            }

        }
    }
    
}
