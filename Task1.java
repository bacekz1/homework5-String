public class Task1 {
    public static void main(String[] args) {
        String text = "Abcd Efgh kjsbdfksdjbf";
        String[] result = text.split(" ");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i].toUpperCase() + " ");
            //cover the case with last " "
            if (i + 1 < result.length) {
                System.out.print(result[i].toLowerCase() + " ");
            } else {
                System.out.print(result[i].toLowerCase());
            }
        }
    }
}
