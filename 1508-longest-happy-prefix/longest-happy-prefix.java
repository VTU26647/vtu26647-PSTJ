class Solution {
    public String longestPrefix(String s) {
        int n = s.length();
        int[] lps = new int[n];
        int len = 0, i = 1;
        while (i < n) {
            if (s.charAt(i) == s.charAt(len))
                lps[i++] = ++len;
            else if (len != 0)
                len = lps[len - 1];
            else
                lps[i++] = 0;
        }
        int j = 0;
        i = 0;
        while (i < n) {
            if (s.charAt(i) == s.charAt(j)) {
                i++;
                j++;
            }
            if (j == n)
                j = lps[j - 1];
            else if (i < n && s.charAt(i) != s.charAt(j)) {
                if (j != 0)
                    j = lps[j - 1];
                else
                    i++;
            }
        }
        return lps[n - 1] > 0 ? s.substring(0, lps[n - 1]) : "";
    }
}