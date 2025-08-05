public class checkAlphabetLetters {
    public static void main(String[] args) {
        char c = '@';
        if((c>='a' && c<='z') || (c>='A' && c<='Z')){
            System.out.println(c + " is a alphabat letter");
        }
        else {
            System.out.println("This is not a alphabat letter");
        }
    }
}
