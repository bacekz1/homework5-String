public class Task10 {
    public static void main(String[] args) {
        String text= "Hello";
        for (int i = 0; i < text.length(); i++) {
            char result = (char) (text.codePointAt(i) + 5);
            System.out.print(result);
        }
    }
}
