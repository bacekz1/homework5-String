import java.util.Arrays;

public class MethodTask {

    public static void main(String[] args) {

        //имаме 2 масива. Трябва чрез метод да върнем 3-ти с числата от масив 1 и 2 в нарастващ вид.

        int[] arr2 = {3, 5, 6, 7, 8, 10, 13};
        int[] arr1 = {1, 2, 2, 3, 4, 30, 40, 50};

        System.out.println(Arrays.toString(test(arr1, arr2)));
    }

    static int[] test(int[] arr1, int[] arr2) {
        int[] result = new int[arr1.length + arr2.length];
        int arr1Index = 0;
        int arr2Index = 0;

        for (int i = 0; i < result.length; i++) {

            if (arr1[arr1Index] <= arr2[arr2Index]) {
                result[i] = arr1[arr1Index];
                arr1Index++;
            } else {
                result[i] = arr2[arr2Index];
                arr2Index++;
            }

            if (arr1Index == arr1.length) {
                for (int j = arr2Index; j < arr2.length; j++) {
                    i++;
                    result[i] = arr2[j];
                }
                break;
            }

            if (arr2Index == arr2.length) {
                for (int j = arr1Index; j < arr1.length; j++) {
                    i++;
                    result[i] = arr1[j];
                }
                break;
            }
        }
//        solution with while loop

//        while (resultIndex < result.length) {
//
//
//            if (arr1Index < arr1.length && arr2Index < arr2.length) {
//                if (arr1[arr1Index] <= arr2[arr2Index]) {
//                    result[resultIndex] = arr1[arr1Index];
//                    arr1Index++;
//                    resultIndex++;
//                } else {
//                    result[resultIndex] = arr2[arr2Index];
//                    arr2Index++;
//                    resultIndex++;
//                }
//
//            } else if (arr1Index == arr1.length) {
//                for (int i = arr2Index; i < arr2.length; i++) {
//                    result[resultIndex] = arr2[i];
//                    resultIndex++;
//                }
//            } else if (arr2Index == arr2.length) {
//                for (int i = arr1Index; i < arr1.length; i++) {
//                    result[resultIndex] = arr1[i];
//                    resultIndex++;
//                }
//            }
//        }
        return result;
    }
}
