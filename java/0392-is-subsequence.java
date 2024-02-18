class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.length()>t.length()){
            return false;
        }

        int j = 0;
        for(int i=0; i<t.length(); i++){
            if(j==s.length()){
                break;
            }
            if(t.charAt(i)==s.charAt(j)){
                j++;
            }
        }

        return j==s.length();
    }
}