/*
Valid Anagram:
Given two strings s and t, return true if t is an anagram of s and false
otherwise

An Anagram is a word or phrase formed by rearranging the letters of a different 
word or phrase, typically using all the original letters exactly once

Find questions to ask to understand the problem better
Think about the data structures and algorithms you would use to solve
Design the program
Write the program
Test the program


SDLC:
    1. Planning
    2. Analysis
    3. Design
    4. Implementation
    5. Testing and Integration
    6. Maintenance

    Run a C# application:
    Mono

    mcs -> compile program
    mono .exe -> run program

Time: O(n^2)
Space: O(1)

iterate through drop letters from s until empty
if not empty return false 
else true 

Time: O(n)
Space: O(n)

hashmap:
frequency counter of s
iterate through t and until all values of keys == 0
*/


    // public static bool IsAnagram(string s, string t) {
    //     if(s.Length != t.Length) return false;
    //     for(int i = 0; i < t.Length; i++){
    //         for(int j = 0; j < s.Length; j++){
    //             if(s[j] == t[i]){
    //                 s = removeChar(s, j);
    //             }
    //         }
    //     }
    //     if(s.Length > 0){
    //         return false;
    //     }
    //     return true;   
    // }

    // public static string removeChar(string s, int idx){
    //     string result = "";
    //     for(int i = 0; i < s.Length; i++){
    //         if(i == idx) continue;
    //         else{
    //             s += s[i];
    //             i += 1;
    //         }
    //     }
    //     return result;
    // }


public class Solution {


    static void Main(string[] args){
        
        string s_one = "anagram";
        string t_one = "nagaram";
        string s_two = "rat";
        string t_two = "car";
        System.Console.WriteLine(IsAnagram(s_one, t_one)); // true
        System.Console.WriteLine(IsAnagram(s_two, t_two)); // false
    }
}