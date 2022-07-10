import java.util.Arrays;

public class Task8 {
    public static void main(String[] args) {


        String text = "kaa]]aak, blabla, apaa";
        String[] result = text.split(", ");
        System.out.println(Arrays.deepToString(result));
        boolean isPalindrom = true;
        for (int i = 0; i <result.length ; i++) {
            for (int j = 0; j <result[i].length()/2 ; j++) {
                if (result[i].charAt(j) != result[i].charAt(result[i].length()-1 -j)){
                    isPalindrom = false;
                    break;
                }
            }
            System.out.println(isPalindrom ? "yes." : "no.");
        }

    }
}
