// Time Complexity: O(N)
//Space Complexity: O(N)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length()) return false;
        HashMap<Character, Character> smap = new HashMap<>();
        HashMap<Character, Character> tmap = new HashMap<>();

        for(int i =0; i<s.length();i++){
            char schar = s.charAt(i);
            char tchar = t.charAt(i);
            if(smap.containsKey(schar)){
                if(smap.get(schar)!=tchar) return false;
            }else{
                smap.put(schar,tchar);
            }

            if(tmap.containsKey(tchar)){
                if(tmap.get(tchar)!=schar) return false;
            }else{
                tmap.put(tchar,schar);
            }
        }
        return true;
    }
}