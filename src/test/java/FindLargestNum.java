public class FindLargestNum {
    public static void main(String[] args) {
        int x = 250;
        int y = 340;
        int z = 1535;

        if(x>y && x>z){
            System.out.println("X is the largest number");
        } else if (y>z) {
            System.out.println("Y is the largest number");
        }
        else {
            System.out.println("Z is the largest number");
        }
    }
}
