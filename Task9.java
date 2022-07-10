//public class Task9 {
//    public static void main(String[] args) {
//        //мога да слагам тия резултати в един Стинг и да измисля филма с положителни/отрицателни и да го сплитна по " "..........
//        String text = "asd-12sdf45-56asdf100";
//        boolean isPositive = true;
//        int tempResult = 0;
//        int result = 0;
//        for (int i = 0; i < text.length(); i++) {
//
//            if (i>0 && Character.isDigit(text.charAt(i-1)) && !Character.isDigit(text.charAt(i))) {
//                System.out.println();
//                result += tempResult;
//                tempResult = 0;
//                isPositive = true;
//            }
//
//            if (text.codePointAt(i) == 45) {
//                System.out.print(text.charAt(i));
//                isPositive = false;
//            }
//
//            if (isPositive && Character.isDigit(text.charAt(i))){
//                System.out.print(text.charAt(i));
//                tempResult += Character.getNumericValue(text.charAt(i));
//            }
//             if (!isPositive && Character.isDigit(text.charAt(i))){
//                System.out.print(text.charAt(i));
//                tempResult -= Character.getNumericValue(text.charAt(i));
//            }
//        }
//        System.out.println();
//        System.out.println(result);
//    }
//}
