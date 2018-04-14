public class BinaryConverter {
//    private String result;
//    private int test;


    public BinaryConverter() {


    }

    public String changeToBinar(int number) {
        String result = "";
        do {
            int i = number % 2;
            number = number / 2;
            result += i;
        } while (number / 2 != 0);
        if (number % 2 == 1) {
            result += 1;
        }


        return reverseString(result);
    }

    public String reverseString(String string) {
        String result = "";
        for (int i = string.length() - 1; i >= 0; i--) {
            result += string.charAt(i);

        }
        return result;
    }

    public int changeToDecimal(String binary) {
        int result = 0;
        int x = 1;
        String reversString = reverseString(binary);
        for (int i = 0; i < binary.length(); i++) {
            int a = reversString.charAt(i);
            if (a == 48) {
                result += 0 * x;
            } else {
                result += 1 * x;
            }
            x *= 2;
        }

        return result;

    }


}
