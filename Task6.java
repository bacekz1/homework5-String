public class Task6 {
    public static void main(String[] args) {
        String text = "супер  яката задача";
        boolean flag = false;
        //if all words separated by " "
//        String[] result = text.split(" ");
//        for (int i = 0; i < result.length; i++) {
//            System.out.print(result[i].toUpperCase().charAt(0) + result[i].toLowerCase().substring(1) + " ");
//        }
//    }
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) != ' ' && !flag) {
                System.out.print(text.toUpperCase().charAt(i));
                flag = true;
            } else if (text.charAt(i) == ' ') {
                flag = false;
                System.out.print(text.charAt(i));
            } else {
                System.out.print(text.toLowerCase().charAt(i));
            }
        }
    }
}

