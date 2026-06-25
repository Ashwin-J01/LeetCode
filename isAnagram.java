class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()==t.length()){
        String[] a1=s.split("");
        String[] a2=t.split("");
        Arrays.sort(a1);
        Arrays.sort(a2);
        String s1=Arrays.toString(a1);
        String t1=Arrays.toString(a2);
        if(s1.equals(t1))
            return true;
        return false;
        }
        else
            return false;
        
    }
}
