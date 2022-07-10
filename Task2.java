public class Task2 {
    public static void main(String[] args) {
        String text = "uchenik uchilishe";

        String[] split = text.split(" ");
        if (split[0].length() > split[1].length()) {
            System.out.printf("%d %s%s", split[0].length(), split[1].substring(0, 5), split[0].substring(5));
        } else {
            System.out.printf("%d %s%s", split[1].length(), split[0].substring(0, 5), split[1].substring(5));

        }

    }
}
