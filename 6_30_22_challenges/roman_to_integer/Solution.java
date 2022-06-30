/**
    maintain index to test:
        - as long as index + 1 < s.length()
            - check for one of three cases
    Three cases to watch for:
        - I before V (4) and X(9)
        - X before L (50) and C(90)
        - C before D (500) and X (1000)
        if case is met increment i + 2 and add by that value
 */

class Solution {
    public static int romanToInt(String s) {
        int lengthS = s.length();
        int i = 0;
        int total = 0;
        while(i < lengthS){
            if(s.charAt(i).equals("I") && (i + 1 < s.length())){
                if(s.charAt(i + 1).equals("V")){
                    total += 4;
                    i += 2;
                    continue;
                } else if(s.charAt(i + 1).equals("X")){
                    total += 9;
                    i += 2;
                    continue;
                } else {
                    total += 1;
                    i += 1;
                }
            }
        }
        return total;
    }

    public static void main(String[] args){
        // 3, 58, 1994
        String[] romanTests = new String[]{"III", "LVIII", "MCMXCIV"};
        for(int i = 0; i < romanTests.length; i++){
            System.out.println(romanTests[i] + " = " + romanToInt(romanTests[i]));
        }
    }
}