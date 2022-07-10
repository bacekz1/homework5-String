public class Task4 {
    public static void main(String[] args) {
        String text = "Anna Dosewa Asenowa, Iwo Peekjnkjkbkjbw Peew";
        String[] names =text.split(", ");

        int position = 0;
        int count = 0;
        for (int i = 0; i < names.length; i++) {
            int tempCount = 0;
            for (int j = 0; j < names[i].length(); j++) {
                tempCount += names[i].codePointAt(j);
            }
            if (tempCount > count) {
                count = tempCount;
                position = i;
            }
        }
        System.out.println(names[position]);
    }
}
