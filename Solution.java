// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int[] solution(int[] A, int K) {
        // write your code in Java SE 8
        
        int length=A.length;
        
        int remainder=K % length;
       
        int[] result = new int[length];
       
        
        if (length == K) {
            result=A;
        }
        
        if ( K == 1) {
            result = A;
        }
        
        for (int i=0; i<length; i++){
            int newK= (i + K) % length;
            result[newK] = A[i];
            
        }
        
    
        return result;
    }
}
