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
        if(x==0)
            return;
        writeBinary(x/2);
        System.out.print(x%2);
    }



}
