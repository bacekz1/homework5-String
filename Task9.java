public class Task9 {
    public static void main(String[] args) {

        String text = "asd-12sdf45-56asdf100 ";
        boolean isPositive = true;
        boolean isDigit = false;
        int tempResult;
        int result = 0;
        int startIndex = 0;

        for (int currentIndex = 0; currentIndex < text.length(); currentIndex++) {

            if (!isDigit && Character.isDigit(text.charAt(currentIndex))) {
                startIndex = currentIndex;
                isDigit = true;
            }

            if (isDigit && !Character.isDigit(text.charAt(currentIndex))) {
                tempResult = Integer.parseInt(text.substring(startIndex, currentIndex));
                tempResult = isPositive ? tempResult : tempResult * -1;
                System.out.println(tempResult);
                result += tempResult;
                startIndex = -1;
                isPositive = true;
                isDigit = false;
            }

            if (currentIndex == text.length() - 1 && startIndex>=0) {
                tempResult = Integer.parseInt(text.substring(startIndex));
                tempResult = isPositive ? tempResult : tempResult * -1;
                System.out.println(tempResult);
                result += tempResult;
                break;
            }

            if (text.charAt(currentIndex) == '-') {
                isPositive = false;
            }
        }
        System.out.printf("Sum = %d",result);
    }
}
