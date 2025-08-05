public class checkPositiveNegative {
    public static void main(String[] args) {
        double num = 0.0;

        if(num < 0.0){
            System.out.println(num + " is a negative number");
        } else if (num > 0.0) {
            System.out.println(num + " is a positive number");
        }
        else{
            System.out.println("Number is zero");
        }

    }
}
