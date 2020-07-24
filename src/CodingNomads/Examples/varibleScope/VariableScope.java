package CodingNomads.Examples.varibleScope;

public class VariableScope {

    static int globalVar = 10;

    public static int multiply(int a, int b){
        int result = a * b * globalVar;
        return result;
    }

    public static int divide(int a, int b){
        int val = globalVar / a / b;
        return val;
    }

    public static void main(String[] args) {
        Vehicle myCar = new Vehicle();
        myCar.make = "Toyota";
        myCar.model = "Supra";
        myCar.year = 1999;

        if(myCar.make.equalsIgnoreCase("Subaru")){
            String message = "This is a Subaru";
            System.out.println(message);
        }
    }
}




