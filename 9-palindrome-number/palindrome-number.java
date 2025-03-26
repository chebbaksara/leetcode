class Solution {
    public boolean isPalindrome(int x) {
       boolean res=true;
       String aux = Integer.toString(x);
       int talla = aux.length();
       int j = talla-1;   
       for(int i= 0;i<talla; i++ ){
             if(aux.charAt(i) == aux.charAt(j)){
                j--;
            }else{res = false; break;}

        } 
        return res; 
    }
}