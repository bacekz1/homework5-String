public class Task1 {
    public static void main(String[] args) {
        String text = "Abcd Efgh";
        String[] result = text.split(" ");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[0].toUpperCase() + " ");
            if (i + 1 < result.length) {
                System.out.print(result[0].toLowerCase() + " ");
            } else {
                System.out.print(result[0].toLowerCase());
            }
        }
    }
}
