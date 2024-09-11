class Solution {
    public boolean isPalindrome(String s) {
        String in = s.replaceAll("[\\s\\W_]","");
        in = in.toLowerCase();
        System.out.println(in);
        int p1 = 0; int p2 = in.length()-1;
        while(p1<=p2){
            if(in.charAt(p1)!=in.charAt(p2))
            return false;
            p1++;
            p2--;
        }
        return true;
    }
}