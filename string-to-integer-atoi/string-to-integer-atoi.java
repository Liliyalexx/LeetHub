// class Solution {
//     public int myAtoi(String str) {
//         if (str ==null || str.length() == 0){
//        return 0;
        
//         }
        
//         double result = 0;
        
//         //remove whitespaces
        
//         str = str.trim();
            
//         //handle positive and negative sign
//             boolean isNegative = false;
//             int startIndex = 0;// index of first numerical character
        
//             if (str.charAt(0) == '+' || str.charAt(0) == '-'){
//                 startIndex++;
//             }
//               if(str.charAt(0) =='-' ){
//                   isNegative = true;
            
//         }
       
        
//         //handle normal case "123"
        
//         for (int i = startIndex; i < str.length(); i++) {
//             //handle non-numerical character
            
//             if(str.charAt(i) < '0' || str.charAt(i) >'9'){
//             break;
//             }
            
//             int digitValue =(int)(str.charAt(i) - '0'); //'9' - '0'
//             result = result * 10 + digitValue;
            
//         } 
//         if(isNegative){
//         result = -result;
        
//         }
//         //handle out of Integer range
        
//         if (result > Integer.MAX_VALUE){
//          return Integer.MAX_VALUE;
//         }
        
//         if (result < Integer.MIN_VALUE){
//          return Integer.MIN_VALUE;
//         }
//         return (int)result;
       
//     }
// }

class Solution {
  public int myAtoi(String s) {
      int i = 0;
      int result = 0;
      int sign = 1;
      //base
      if (s.length() == 0) return 0;
      
      //discard white space
      while (i < s.length() && s.charAt(i) == ' ') i++;
      
      //check the sign
      if (i < s.length() && (s.charAt(i) == '+' || s.charAt(i) == '-'))
          sign = (s.charAt(i++) == '-') ? -1 : 1;
      
      // proceed only if the char is digits
      while (i < s.length() && s.charAt(i) >= '0' && s.charAt(i) <= '9'){
          // Since we are doing r =  r * 10 + digit formula
          // when r > max / 10 if u do * 10 it will overflow
          // if r == max / 10 then any number + 7 will overflow
          // same case for under flow also 
          // both case we should handle
          if (result > Integer.MAX_VALUE / 10 ||
              (result == Integer.MAX_VALUE / 10 && s.charAt(i) - '0' > Integer.MAX_VALUE % 10))
              return (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
          
          result = result * 10 + (s.charAt(i++) - '0');
      }
      
      return result * sign;
  }
}
