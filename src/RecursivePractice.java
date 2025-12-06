import java.util.*;
public class RecursivePractice {
    public  static int countSubstrings(String word, String substring){
        int targetLength=substring.length();
        int count=countSubstringsHelper(word,substring,targetLength);
        return count;
    }
    private static int countSubstringsHelper(String word,String substring, int targetLength){

        if(word.length()<targetLength)
        {
            return 0;
        }
        int count=0;
        if(word.substring(0,targetLength).equals(substring)){
            count++;
        }
        return (count+countSubstringsHelper(word.substring(1),substring,targetLength));

    }
    public static int digitMatch(int x, int y) {
        if (x == 0 || y == 0) {
            return 0;
        }
        int count = 0;
        if (x % 10 == y % 10) {
            count++;
        }
        return count+digitMatch(x/10,y/10);
    }
    public static void writeBinary(int x){
        if(x<0){
            throw new IllegalArgumentException("Illegal Input!");
        }
        if(x==0)
            return;
        writeBinary(x/2);
        System.out.print(x%2);
    }

    public static int findSecondLargest(int[] arr) {
        int MaxIndex;
        int SecondMaxIndex;
        int MoveIndex = 0;
        if (arr[0] > arr[1]) {
            MaxIndex = 0;
            SecondMaxIndex = 1;
        } else {
            MaxIndex = 1;
            SecondMaxIndex = 0;
        }
        int finalSecondIndex=findSecondLargestHelper(arr,MoveIndex,MaxIndex,SecondMaxIndex);
        return arr[finalSecondIndex];
    }

    private static int findSecondLargestHelper(int[] arr, int index, int MaxIndex,int SecondMaxIndex){
        if(index==arr.length){
            return SecondMaxIndex;
        }
        if(arr[index]<=arr[MaxIndex]&&arr[index]>arr[SecondMaxIndex]){
            SecondMaxIndex=index;
        }
        if(arr[index]>arr[MaxIndex]){
            MaxIndex=index;
        }
        return findSecondLargestHelper(arr,index+1,MaxIndex,SecondMaxIndex);
    }
    public static double permutation(int n, int r){
        if(n<r||n<0||r<0){
            throw new IllegalArgumentException("Illegal Input!");
        }
       return permutaitonHelper(n,r);

    }
    private static double permutaitonHelper(int n,int r){

       if(n==1){
           return 1;
       }
       return n*1.0/Math.max((n-r),1)*permutaitonHelper(n-1,r);
    }

    public static int maxSum(ArrayList<Integer> list, int limit){
        int index=0;
        int currentSum=0;
        int MaxSum=maxSumHelper(list,index,currentSum,limit);
        return MaxSum;
    }

    private static int maxSumHelper(ArrayList<Integer> list, int index, int currentSum, int remainingLimit) {
        if (index >= list.size()) {
            return currentSum;
        }

        if (remainingLimit <= 0) {
            return currentSum;
        }

        int currentValue = list.get(index);

        int sumWithout = maxSumHelper(list, index + 1, currentSum, remainingLimit);


        int sumWith = currentSum;
        if (currentValue <= remainingLimit) {
            sumWith = maxSumHelper(list, index + 1,
                    currentSum + currentValue,
                    remainingLimit - currentValue);
        }

        return Math.max(sumWithout, sumWith);
    }
}
