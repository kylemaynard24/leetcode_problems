/**
    maintain index to test:
        - as long as index + 1 < s.length()
            - check for one of three cases
    Three cases to watch for:
    I can be placed before V (5) and X (10) to make 4 and 9. 
    X can be placed before L (50) and C (100) to make 40 and 90. 
    C can be placed before D (500) and M (1000) to make 400 and 900.
        if case is met increment i + 2 and add by that value

    Symbol       Value
    I             1
    V             5
    X             10
    L             50
    C             100
    D             500
    M             1000

 */

class Solution {
    public static int romanToInt(String s) {
        int lengthS = s.length();
        int i = 0;
        int total = 0;
        while(i < lengthS){
            System.out.println("Current Iteration: " + i);
            System.out.println("Current Total: " + total);
            System.out.println("Total Length = " + lengthS);
            System.out.println("Current Character: " + s.charAt(i));
            if(s.charAt(i) == 'V'){
                total += 5;
                i += 1;
                continue;
            }

            if(s.charAt(i) == 'L'){
                total += 50;
                i += 1;
                continue;
            }

            if(s.charAt(i) == 'D'){
                total += 500;
                i += 1;
                continue;
            }

            if(s.charAt(i) == 'M'){
                total += 1000;
                i += 1;
                continue;
            }

            // handle I
            if(s.charAt(i) == 'I'){
                if(i + 1 < lengthS){
                    System.out.println(i + " = " + s.charAt(i));
                    if(s.charAt(i + 1) ==  'V'){
                        System.out.println("+4");
                        total += 4;
                        i += 2;
                        continue;
                    } else if(s.charAt(i + 1) == 'X'){
                        System.out.println("+9");
                        total += 9;
                        i += 2;
                        continue;
                    } else {
                        System.out.println("in else +1");
                        total += 1;
                    }    
                } else {
                    total += 1;
                }
            }

            // handle X
            if(s.charAt(i) == 'X'){
                if(i + 1 < lengthS){
                    if(s.charAt(i + 1) ==  'L'){
                        System.out.println("+40");
                        total += 40;
                        i += 2;
                        continue;
                    } else if(s.charAt(i + 1) == 'C'){
                        System.out.println("+90");
                        total += 90;
                        i += 2;
                        continue;
                    } else {
                        System.out.println("in else +10");
                        total += 10;
                    }    
                } else {
                    total += 10;
                }
            }

            // handle C
            if(s.charAt(i) == 'C'){
                if(i + 1 < lengthS){
                    if(s.charAt(i + 1) == 'D'){
                        System.out.println("+400");
                        total += 400;
                        i += 2;
                        continue;
                    } else if(s.charAt(i + 1) == 'M'){
                        System.out.println("+900");
                        total += 900;
                        i += 2;
                        continue;
                    } else {
                        System.out.println("in else +100");
                        total += 100;
                    }    
                } else {
                    total += 100;
                }
            }

            i += 1;
            System.out.println();
        }
        return total;
    }

    public static void main(String[] args){
        // 3, 58, 1994, 34
        String[] romanTests = new String[]{"III", "LVIII", "MCMXCIV", "XXXIV"};
        // String[] romanTests = new String[]{"MCMXCIV"};
        for(int i = 0; i < romanTests.length; i++){
            System.out.println();
            System.out.println(romanTests[i] + " = " + romanToInt(romanTests[i]));
        }
    }
}