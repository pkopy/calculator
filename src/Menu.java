import java.util.Scanner;

public class Menu {
    private Scanner scanner;
    private MenuLogic logic;

    public Menu(){
        scanner = new Scanner(System.in);
    }

    public void start() {
        System.out.println("Calculator ver 1.0");

        String answer;

        do{
            System.out.println("Wybierz opcję: ");

            printChoseList();
            checkAnswer(answer = scanner.nextLine());
        }while(!answer.equalsIgnoreCase("exit"));
    }

    public void checkAnswer(String answer) {
        switch (answer) {
            case "1": {
                System.out.println("Podaj liczby które chcesz pomnożyć oddzielone przecinkiem:");

                
                break;

            }
        }

    }

    public void printChoseList() {
        System.out.println();
        System.out.println("1 - mnożenie,");
        System.out.println("2 - dzielenie,");
        System.out.println("3 - zamiana typu binarnego na dzisiętny,");
        System.out.println("4 - zamiana typu dzisiętnego na binarny,");
        System.out.println("5 - zamiana typu binarnego na ósemkowy");
        System.out.println("6 - pierwiastek x z liczby y");

    }


}
