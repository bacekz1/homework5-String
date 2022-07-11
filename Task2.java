public class Task2 {
    public static void main(String[] args) {
        String text = "uchenik uchilishe";
        String[] result = text.split(" ");

        if (result[0].length() > result[1].length()) {
            System.out.printf("%d %s%s", result[0].length(), result[1].substring(0, 5), result[0].substring(5));
        } else {
            System.out.printf("%d %s%s", result[1].length(), result[0].substring(0, 5), result[1].substring(5));

        }

    }
}
