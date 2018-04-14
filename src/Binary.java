public class Binary {
    private String result;
    private int test;


    public Binary(){


    }

    public String changeToBinar(int number){
           result = "";
        do {
           int i = number%2;
           number = number/2;

               result += i;


        }while(number/2 != 0);
        if(number%2 == 1) {
            result += 1;
        }



        return reverseString(result);
    }

    public String reverseString(String string) {
        String result ="";
        for (int i = string.length()-1; i >= 0  ; i--) {
            result += string.charAt(i);

        }
        return result;
    }



}
