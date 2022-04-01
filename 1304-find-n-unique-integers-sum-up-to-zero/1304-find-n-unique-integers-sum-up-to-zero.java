// class Solution {
//     public int[] sumZero(int n) {
//         int[] result = new int[n];
//         for (int i = 0; i < n - 1; i += 2) {
//             result[i] = i + 1;
//             result[i + 1] = -(i + 1);
//         }
//         return result;
//     }
// }

// class Solution {
//     public int[] sumZero(int n) {
        
        
//         int[] ans = new int[n];
//         for(int i=0; i<n; i++) {
//             ans[i]  = (i*2)-n+1;
//         }
//         return ans;
//     }
// }

class Solution {
    public int[] sumZero(int n) {
// Declaring Size of Array of SIZE n
           int [] resultantArray = new int[n];
            int num = 1;      // Start Numbers to Fill from 1
            int start = 0;    // Take Start index at 0
            int end = resultantArray.length-1;  // Take last Index as n-1
            while(start<end){         // Fill the Array till Start < end
                /*
                Here Note n --> Can be Even or ODD
                n -> EVEN 
                    Example n = 2
                   Index -->  0  1
                            [ 0, 0 ]
                      Here    /  \ 
                          Start  End    --> AT the end these will filled by [+x, -x] i.e Symmetric Numbers
                 n -> ODD 
                    Example n = 3
                   Index -->  0  1  2
                            [ 0, 0, 0 ]
                      Here    /     \ 
                          Start     End    --> AT the end these will filled by [+x, -x] i.e Symmetric Numbers
                 --> Here Note that Loop will go till Start < end
                 --> But the Mid is Already 0    
                 --> Symmetric numbers will cancel Each other in Sum and gives 0 
                 --> Hence, 0+0 = 0        
                 */
                resultantArray[start] = num;     // Fill Start with positive Number +x
                resultantArray[end] = (-num);   //  Fill End with negative Number -x
                num++;    // Increment the Number Because for Next Numbers Because Numbers must be UNIQUE in ARRAY
                start++;  // Increment Start
                end--;    // Decrement END
            }
        // At the END return the Resultant Array    
        return resultantArray;
        
    }
}