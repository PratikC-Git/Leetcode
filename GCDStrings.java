class Solution {
    public String gcdOfStrings(String str1, String str2) {
        var m = str1.length();
        var n = str2.length();
        if((str1 + str2).equals(str2 + str1)){
            if(m>n){
                while(n != 0){
                    int temp = n;
                    n = m % n;
                    m = temp;
                }
               return str1.substring(0,m); 
            }else{
                 while(m != 0){
                    int temp = m;
                    m = n % m ;
                    n = temp;
                }
                return str1.substring(0,n);
            }
        }else{
            return "";
        }
        //return str1.substring(0,m);
    }
}
