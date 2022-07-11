public class Task5 {
    public static void main(String[] args) {
        String text1 = "ppnpka";
        String text2 = "ma6ina";

        int text1Position = -1;
        int text2Position = -1;
        for (int i = 0; i < text1.length(); i++) {
            if (text2.contains(String.valueOf(text1.charAt(i)))) {
                text1Position = i;
                text2Position = text2.indexOf(text1.charAt(i));
                break;
            }
        }

        if (text1Position < 0) {
            System.out.println("Ne stava");

        } else {

            for (int i = 0; i < text2.length(); i++) {
                if (i != text2Position) {
                    //print empty symbols
                    for (int spaces = 0; spaces < text1Position; spaces++) {
                        System.out.print(" ");
                    }
                    System.out.print(text2.charAt(i));
                } else {
                    System.out.print(text1);
                }
                System.out.println();
            }
        }
    }
}
