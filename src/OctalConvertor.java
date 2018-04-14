public class OctalConvertor {
    private BinaryConverter binary;

    public OctalConvertor() {
        binary = new BinaryConverter();
    }


    public String binaryToOctal(String binaryString) {
        int decimal = binary.changeToDecimal(binaryString);

        String result = "";
        do {
            int i = decimal%8;
            decimal = decimal / 8;
            result += i;
        } while (decimal / 8 != 0);
        if (decimal % 2 == 1) {
            result += 1;
        }


        return binary.reverseString(result);
    }
}