import java.util.Scanner;

public class Menu {
    private Scanner scanner;
    private MenuLogic logic;
    private BinaryConverter binary;
    private RootsNumber roots;
    private OctalConvertor octal;

    public Menu(){
        scanner = new Scanner(System.in);
        logic = new MenuLogic();
        binary = new BinaryConverter();
        roots = new RootsNumber();
        octal = new OctalConvertor();
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

    private void checkAnswer(String answer) {
        switch (answer) {
            case "1": {
                System.out.println("Podaj liczby które chcesz pomnożyć oddzielone przecinkiem:");
                logic.changeStringToArray(scanner.nextLine(), ",");
                System.out.println(logic.multiply(logic.getMultiplyArgs()));

                break;
            }

            case "2": {
                System.out.println("Podaj dzielną i dzielnik oddzielone przecinkiem:");
                logic.changeStringToArray(scanner.nextLine(),",");
                System.out.println(logic.divine(logic.getMultiplyArgs()));
                break;


            }

            case "3": {
                System.out.println("Podaj liczbe do konwersji");
                System.out.println(binary.changeToBinar(Integer.valueOf(scanner.nextLine())));
                break;
            }

            case "5": {
                System.out.println("Podaj liczbe do konwersji");
                System.out.println(octal.binaryToOctal(scanner.nextLine()));
                break;
            }

            case "4": {
                System.out.println("Podaj liczbe do konwersji");
                System.out.println(binary.changeToDecimal(scanner.nextLine()));
                break;
            }

            case "6": {
                System.out.println("Podaj stopień pierwiastka");
                int degree = Integer.valueOf(scanner.nextLine());
                System.out.println("Podaj liczbę");
                int root = Integer.valueOf(scanner.nextLine());
                System.out.println(roots.rootsNumber(root, degree));
                break;
            }
        }

    }

    private void printChoseList() {
        System.out.println();
        System.out.println("1 - mnożenie,");
        System.out.println("2 - dzielenie,");
        System.out.println("3 - zamiana typu dzisiętnego na binarny,");
        System.out.println("4 - zamiana typu binarnego na dziesiętny,");
        System.out.println("5 - zamiana typu binarnego na ósemkowy");
        System.out.println("6 - pierwiastek x z liczby y");

    }


}
