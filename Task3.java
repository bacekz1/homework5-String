public class Task3 {
   static byte counter = 0;
  static boolean flag = false;
    public static void main(String[] args) {

        String text1 = "0ipopotam";
        String text2 = "hi3opotuk";


        if (text1.length() == text2.length()){
            System.out.println("The strings have same length.");
            findDifferences(text1,text2);

        } else if (text1.length()> text2.length()) {
            System.out.println("String 1 have bigger length.");
            findDifferences(text2,text1);
        }
        else {
            System.out.println("String 2 have bigger length.");
            findDifferences(text1,text2);
        }
    }
    static void findDifferences(String a, String b) {
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != b.charAt(i)){
                if(!flag){
                    System.out.println("Difference by positions:");
                    flag = true;
                }
                System.out.printf("%d %s-%s",i+1,a.charAt(i),b.charAt(i));
                System.out.println();
            }
        }

    }

}

