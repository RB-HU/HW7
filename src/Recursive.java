public class Recursive {
    public static void main(){
        int count;
        String strTest="banana";
        String subStr="an";
        count=RecursivePractice.countSubstrings(strTest,subStr);
        System.out.println(count);
        int test1=12340;
        int test2=1240;
        int count2=RecursivePractice.digitMatch(test1,test2);
        System.out.println(count2);
        int test3=44;
        RecursivePractice.writeBinary(test3);


    }

}
