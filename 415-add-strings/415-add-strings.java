class Solution{

  public String addStrings(String num1, String num2) {
        StringBuilder result = new StringBuilder();

        int i = num1.length() - 1; //began from the back and move forward to the beginning
        int j = num2.length() - 1; //began from the back and move forward to the beginning

        int carry = 0;


        while( i >= 0 || j >= 0) {
          int sum = carry;
          if( i >=0){
            sum += num1.charAt(i--) - '0';
          }

          if ( j >=0){
            sum+=num2.charAt(j--) - '0';
          }

          result.append(sum % 10);
          carry = sum/10;

        }

        if(carry !=0) {
          result.append(carry);
        }

        return result.reverse().toString();
  }
}