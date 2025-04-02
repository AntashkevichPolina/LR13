package org.example;

public class App {
    public static void main(String[] args) {
        Tester.printGreeting();
        Tester tester = new Tester("Полина", "Анташкевич", 5);
        tester.displayInfo();
        tester.displayInfo(5);
        tester.displayInfo(50000.0);








    }
}

