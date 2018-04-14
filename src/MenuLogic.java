public class MenuLogic {

//    private double multiplyFirs

   public MenuLogic(){

   }

   public double multiply(double... args){
       double result = 1;
       for (double arg : args) {
           result *= arg;
       }
       return result;
   }
}
