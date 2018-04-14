import java.util.Arrays;

public class MenuLogic {

    private double[] multiplyArgs;

    public MenuLogic() {

    }

    public double multiply(double... args) {
        double result = 1;
        for (double arg : args) {
            result *= arg;
        }
        return result;
    }

    public void lenghtOfArgs(int qtyArgs) {
        multiplyArgs = new double[qtyArgs];
        for (int i = 0; i < qtyArgs ; i++) {
            multiplyArgs[i] = 0;
        }

    }

    public void addArg(int i, double arg) {
        multiplyArgs[i] = arg;
    }


    public double divine(double x, double y) {
        if (y != 0) {
            return x / y;
        }
        return 0;
    }

}
