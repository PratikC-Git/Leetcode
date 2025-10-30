class Solution {
    public boolean valid(String str1, String str2, int k){
        int m = str1.length();
        int n = str2.length();
        if(m % k > 0 || n % k > 0){
            return false;
        }else{
            String base = str1.substring(0, k);
            return str1.replace(base, "").isEmpty() && str2.replace(base, "").isEmpty();
        }
    }

    public String gcdOfStrings(String str1, String str2) {
        int m = str1.length();
        int n = str2.length();
        for (int i = Math.min(m,n); i >=1;--i){
            if(valid(str1, str2, i)){
                return str1.substring(0,i);
            }
        }
        return "";
    }
}
