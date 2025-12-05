public class RecursivePractice {
    public  int countSubstrings(String word, String substring){
        int targetLength=substring.length();
        int count=countSubstringsHelper(word,substring,targetLength);
        return count;
    }
    private int countSubstringsHelper(String word,String substring, int targetLength){

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

}
