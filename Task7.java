public class Task7 {
    public static void main(String[] args) {
        String text = "kabdkahb dabskdhbaskasfdsfdsdhb adkhabsdkhba adhbkhkh";
        String[] result = text.split(" ");
        int count = 0;
        for (int i = 0; i < result.length; i++) {
            count = Math.max(count, result[i].length());
        }
        System.out.printf("%d words, the longest have %d symbols", result.length, count);
    }
}
