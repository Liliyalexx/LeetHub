
class Solution {
public String reverseWords(String s) {
s = s.strip();
String [] arr = s.split(" ");
int len = arr.length-1;
String str=arr[len];
for(int i=len-1; i>=0; i--) {
if(arr[i].length()>0)
str = String.join(" ", str, arr[i]);
}
return str;
}
}