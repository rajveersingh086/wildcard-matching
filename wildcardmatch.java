package leetcode;
import java.util.*;

// hard problem :flipkart ,amazon 6+.
//simple traversal solution.
// time complexity O(n) m space complexithy : O(1)

// '?' it denote for a sequence matching.
// ' * ' its is a single matching pattern aur empty matching.
class wildcardmatch {
    public static boolean isMatch(String s ,String p){
        int t =s.length();
        int m = p.length();

        int i = 0 ,j=0 ,startIndex = -1 ,match = 0;

        while (i<t){
            if (j<m && (p.charAt(j) == '?'|| p.charAt(j)==s.charAt(i))){
                i++;
                j++;
            }
            else if
                (j < m && p.charAt(j) == '*'){
                    startIndex = j;
                    match = i;
                    j++;
                }
                else if (startIndex != -1){
                    j = startIndex + 1;
                    match++;
                    i = match;
                }
                else{
                    return false;
                }
            }
            while (j<m && p.charAt(j) == '*'){
                j++;
            }
            return j== m ;
        }
    }

