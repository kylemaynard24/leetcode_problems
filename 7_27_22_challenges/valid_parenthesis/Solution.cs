/*
The case here:
    Iterate through string:
        The first closing found has to be preceded by an opening of the same type
        use a single pointer: 
            find a closing
            see that the element before is the closing that matches that one
            fail cases:
                - if the closing character first found is found at idx 0
                - if that character prior to it is not matching the closing one
            else:
                s = createNewString(i, s);
                s = createNewString(i-1, s);
while s.Length > 0


THIS METHOD IS NOT COMPUTATIONALLY EFFICIENT, WORKS FOR SMALL INPUT BUT NOT LONGER INPUT
*/

using System;

public class Solution {
    
    public static bool IsValid(string s) {
        
        while(s.Length > 0){
            int i = 0;
            bool found = false;
            while(i < s.Length){
                // handle "]
                // System.Console.WriteLine(s); 
                // System.Console.WriteLine(i); 
                if(s[i] == ']'){
                    found = true;
                    int currIdx = i;
                    if(currIdx == 0){
                        return false;
                    }
                    else if(s[currIdx - 1] != '['){
                        return false;
                    } else {
                        s = createNewString(currIdx, s);
                        s = createNewString(currIdx - 1, s);
                        if(s.Length == 0) return true;
                        if(currIdx - 2 > 0){
                            i = currIdx - 2;
                        } else {
                            i = 0;
                        }
                    }
                }

                // handle "}"
                if(s[i] == '}'){
                    found = true;
                    int currIdx = i;
                    if(currIdx == 0){
                        return false;
                    }
                    else if(s[currIdx - 1] != '{'){
                        return false;
                    } else {
                        s = createNewString(currIdx, s);
                        s = createNewString(currIdx - 1, s);
                        if(s.Length == 0) return true;
                        if(currIdx - 2 > 0){
                            i = currIdx - 2;
                        } else {
                            i = 0;
                        }
                    }
                }

                // handle ")"
                if(s[i] == ')'){
                    found = true;
                    int currIdx = i;
                    if(currIdx == 0){
                        return false;
                    }
                    else if(!(s[currIdx - 1] == '(')){
                        return false;
                    } else {
                        s = createNewString(currIdx, s);
                        s = createNewString(currIdx - 1, s);
                        if(s.Length == 0) return true;
                        if(currIdx - 2 > 0){
                            i = currIdx - 2;
                        } else {
                            i = 0;
                        }
                    }
                }
                i += 1;
            }
            if(found == false && s.Length > 0){
                return false;
            }
        }
        return true; 
    }

    // didn't feel like working with indices to try to figure out which ones to drop
    public static string createNewString(int idxToDrop, string s){
        string result = "";
        for(int i = 0; i < s.Length; i++){
            if(i == idxToDrop) continue;
            else{
                result += s[i];
            }
        }
        return result;
    }

    static void Main(string[] args){
        string testOne = "()"; // true
        string testTwo = "(){}[]"; // true
        string testThree = "(]"; // false
        System.Console.WriteLine(IsValid(testOne));
        System.Console.WriteLine(IsValid(testTwo));
        System.Console.WriteLine(IsValid(testThree));
    }
}