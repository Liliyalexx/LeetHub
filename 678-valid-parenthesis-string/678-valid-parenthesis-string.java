// class Solution{
  
//   public boolean checkValidString(String s){

//     Stack<Character> leftChar = new Stack<>(); //Stack
//     for( int i=0; i< s.length(); i++){
//         if(s.charAt(i) =='(' || s.charAt(i) = '*' ){ //push left brackets

//           stack.push(s.charAt(i));
//         } else {
//             if(leftChar.isEmpty()){ // unmatched right char
//                 return false;

//             }

//             if(s.charAt(i) ==')' ){ // ensure Match
//               return false;
//             }

//             leftChar.pop(); // goot match.pop

//         }

//     }
//     return leftChar.isEmpty; // in case unmatched left


//   }
// }

class Solution {
    public boolean checkValidString(String s) {
       int lo = 0, hi = 0;
       for (char c: s.toCharArray()) {
           lo += c == '(' ? 1 : -1;
           hi += c != ')' ? 1 : -1;
           if (hi < 0) break;
           lo = Math.max(lo, 0);
       }
       return lo == 0;
    }
}