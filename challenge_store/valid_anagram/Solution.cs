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
*/


public class Solution {
    public static bool IsAnagram(string s, string t) {
        return false;   
    }

    static void Main(string[] args){
        
        string s_one = "anagram";
        string t_one = "nagaram";
        string s_two = "rat";
        string t_two = "car";
        System.Console.WriteLine(IsAnagram(s_one, t_one)); // true
        System.Console.WriteLine(IsAnagram(s_two, t_two)); // false
    }
}