/*
Length of Last Word:

Given a string s consisting of words and spaces,
return the length of the last word in the string.

A word is a maximal substring consisting of non-space characters
only.

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
    public static int LengthOfLastWord(string s) {
        return -1;
    }

    
    static void Main(string[] args){
        System.Console.WriteLine("Hello World");
        string sOne = "Hello World";
        System.Console.WriteLine(LengthOfLastWord(sOne)); //5

        string sTwo = "   fly me    to    the    moon ";
        System.Console.WriteLine(LengthOfLastWord(sTwo)); //4
    }
}

