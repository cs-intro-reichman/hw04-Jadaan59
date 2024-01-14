import java.util.Arrays;

public class ArrayOps {
    public static void main(String[] args) {
       int [] array = {0,1,3};
       int [] testsecond = {6,9,4,7,3,4};
       int [] testissorted = {7,5,4,3,-12};
       int [] testForIsOrder = {1,2,3},test2={1,2,3} ;
       System.out.println(findMissingInt(array));
       System.out.println(secondMaxValue(testsecond));
       System.out.println(isSorted(testissorted));
       System.out.println(containsTheSameElements(testForIsOrder, test2));

    }

    public static int findMissingInt (int [] array) {
        int[] NewArr = new int[(array.length) +1];
        NewArr = MakeNewArr(NewArr);
        int MissingInt = 0;
            for (int i = 0; i < array.length; i++){
                if (array.length == 1){
                    MissingInt = 1;
                }
                if (array[i] != NewArr[i]) {
                    MissingInt = (int) NewArr[i];
                }
            }
        return MissingInt;
    }
    // Makes new integer array that contains the numbers from 0 to the length of the new array.
    public static int[] MakeNewArr (int [] array){
        int [] arr = new int[array.length];
        for (int i = 0; i < array.length; i++){
            arr[i] = i;
        }
        return arr;
    }

    public static int secondMaxValue(int [] array) {
        int MaxInt = 0;
        array = withOutMax(array);
        for (int i = 0; i < array.length; i++){
            if (array[i] > MaxInt){
                MaxInt = array[i];
            }
    }
        return MaxInt;
    }
    public static int[] withOutMax(int [] array){
        int max = array[0];
        int maxIndex = 0;

        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                maxIndex = i;
            }
        }
        array[maxIndex] = 0;
        return array;
    }

    public static boolean containsTheSameElements(int [] array1,int [] array2) {
      boolean isContains = false;
        if(array1.length >= array2.length){
          for (int i = 0; i < array2.length; i++){
              if(contains(array1,(int) array2[i])){
                  isContains = true;
              }else{
                  isContains = false;
                  break;
              }
          }
      }
        if(array1.length < array2.length){
            for (int i = 0; i < array1.length; i++){
                if(contains(array2,(int) array1[i])){
                    isContains = true;
                }else{
                    isContains = false;
                    break;
                }
            }
        }
        return isContains;
    }

    public static boolean contains(int[]array, int value){
        for (int i = 0; i< array.length; i++){
            if (array[i] == value){
                return true;
            }
        }
        return false;
    }
    public static boolean isSorted(int [] array) {
        boolean istrue = false;
        boolean istrue2 = false;
        boolean finalresult = false;
        for (int i=0; i < (array.length - 1); i++){
            if (array[i+1] >= array[i]) {
               istrue = true;
            }else {
               istrue = false;
               break;
            }
        }
        for (int i=0; i < (array.length - 1); i++){
            if (array[i+1] <= array[i]) {
                istrue2 = true;
            }else {
                istrue2 = false;
                break;
            }
        }
        if (istrue || istrue2){
            finalresult = true;
        }
        return finalresult;
    }

}
