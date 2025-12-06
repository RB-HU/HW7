
import org.junit.jupiter.api.Test;
import java.io.*;
import java.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class RecursiveTesting {
@Test
    void Test11(){
    String testing="bannnana";
    String sub="na";
    int count=RecursivePractice.countSubstrings(testing,sub);
    assertTrue(count==2);
}
    @Test
    void Test12(){
        String testing="banana";
        String sub="ana";
        int count=RecursivePractice.countSubstrings(testing,sub);
        assertTrue(count==2);
    }

    @Test
    void Test13(){
        String testing="";
        String sub="an";
        int count=RecursivePractice.countSubstrings(testing,sub);
        assertTrue(count==0);
    }

    @Test
    void Test21(){
        int testing=2321;
        int testing2=1312;
        int count=RecursivePractice.digitMatch(testing,testing2);
        assertTrue(count==1);
    }

    @Test
    void Test22(){
        int testing=2321123;
        int testing2=1312;
        int count=RecursivePractice.digitMatch(testing,testing2);
        assertTrue(count==1);
    }

    @Test
    void Test23(){
        int testing=1312;
        int testing2=1312;
        int count=RecursivePractice.digitMatch(testing,testing2);
        assertTrue(count==4);
    }

    @Test
    void Test31(){
    int testing=15;
    PrintStream originaloutput=System.out;
    ByteArrayOutputStream output=new ByteArrayOutputStream();
    PrintStream outputstream =new PrintStream(output);
    System.setOut(outputstream);
    RecursivePractice.writeBinary(testing);
    String expection="1111";
    String trueOutput=output.toString();
    assertTrue(expection.equals(trueOutput));
    System.setOut(originaloutput);
    }

    @Test
    void Test32(){
    int test=44;
    PrintStream original=System.out;
    ByteArrayOutputStream newOutput=new ByteArrayOutputStream();
    PrintStream newPrint=new PrintStream(newOutput);
    System.setOut(newPrint);
    String expected="101100";
    RecursivePractice.writeBinary(test);
    String trueOutput=newOutput.toString();
    assertEquals(expected,trueOutput);
    System.setOut(original);

    }

    @Test
    void Test33(){
    int test=-3;
    PrintStream original=System.out;
    ByteArrayOutputStream newOutput=new ByteArrayOutputStream();
    PrintStream newPrint=new PrintStream(newOutput);
    System.setOut(newPrint);
    try {
        RecursivePractice.writeBinary(test);
    }
    catch(IllegalArgumentException e) {
        assertEquals("Illegal Input!",e.getMessage());
        }
    }

    @Test
    void Test41(){
        int[] testing={1,3,2,8,5};
        int SecMax=RecursivePractice.findSecondLargest(testing);
        System.out.println(SecMax);
        assertTrue(SecMax==5);
    }

    @Test
    void Test42(){
        int[] testing={1,2,2,4,4};
        int SecMax=RecursivePractice.findSecondLargest(testing);
        assertTrue(SecMax==4);
    }

    @Test
    void Test43(){
        int[] testing={2,1,3};
        int SecMax=RecursivePractice.findSecondLargest(testing);
        assertTrue(SecMax==2);
    }

    @Test
    void Test51(){
        int testing1=5;
        int testing2=3;
        double perm=RecursivePractice.permutation(testing1,testing2);
        System.out.println(perm);
        assertTrue(perm==60);
    }

    @Test
    void Test52(){
        int testing1=3;
        int testing2=2;
        double perm=RecursivePractice.permutation(testing1,testing2);
        assertTrue(perm==6);
    }

    @Test
    void Test53(){
    int testing1=-2;
    int testing2=1;
    try{
        RecursivePractice.permutation(testing1,testing2);
    }
    catch(IllegalArgumentException e){
        assertEquals("Illegal Input!",e.getMessage());
    }
    }

    @Test
    void Test61(){
        ArrayList<Integer> testing1=new ArrayList<Integer>();
        testing1.add(7);
        testing1.add(30);
        testing1.add(8);
        testing1.add(22);
        testing1.add(6);
        testing1.add(1);
        testing1.add(14);
        int limit=19;
        int maxtotal=RecursivePractice.maxSum(testing1,limit);
        assertTrue(maxtotal==16);
    }

    @Test
    void Test62(){
        ArrayList<Integer> testing1=new ArrayList<Integer>();
        testing1.add(6);
        testing1.add(2);
        testing1.add(9);
        testing1.add(6);
        int limit=0;
        int maxtotal=RecursivePractice.maxSum(testing1,limit);
        assertTrue(maxtotal==0);
    }

    @Test
    void Test63(){
        ArrayList<Integer> testing1=new ArrayList<Integer>();
        int limit=13;
        int maxtotal=RecursivePractice.maxSum(testing1,limit);
        assertTrue(maxtotal==0);
    }

}
