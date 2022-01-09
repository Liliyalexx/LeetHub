class Solution{
    
    public String removeOccurrences(String s, String part) {
  	Stack<Character> st = new Stack<>();
  int n = s.length();
  int m = part.length();
  for(int i=0;i<n;i++){
      st.push(s.charAt(i));
      if(st.size()>=m){
          String x="";
          for(int j=m-1;j>=0;j--){
              char ch = part.charAt(j);
              if(ch!=st.peek()){
                  for(int k=0;k<x.length();k++){
                      st.push(x.charAt(k));
                  }
                  break;
              }
              else{
                  x=st.peek()+x;
                  st.pop();
              }
          }
      }
  }
  StringBuilder sb = new StringBuilder();
  while(st.size()!=0){
      sb.append(st.pop());
  }
  sb.reverse();
  return sb.toString();
}
}
