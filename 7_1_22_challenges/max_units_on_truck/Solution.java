/**
 * 
 * Input: [[1,3], [2,2], [3, 1]], trucksize = 4
 * Output: 8
 * 
 * Explanation of algorithm:
 * There are:
 *  - 1 box of the first type that contains 3 units
 *  - 2 boxes of the second type that contains 2 units each
 *  - 3 boxes of the third type that contain 1 unit each
 *  You can take all the boxes of the first and second types, and one box of the third type
 * The total number of units will be = (1 * 3) + (2 * 2) + (1 * 1) = 8
 * 
 * 
 * 
 * Example 2:
 * boxTypes = [[5, 10], [2, 5], [4, 7], [3, 9]] trucksize = 10
 * output = 91
 * ordered BoxTypes by unitSize
 * [[5, 10], [3, 9], [4, 7], [2, 5]]
 * (5 * 10) + (3 * 9) + (2 * 7) = 50 + 27 + 14 = 91
 * 
 * 
 * Strategy:
 * Order by Unit size
 * take as many as you can until truckSize == 0 (truckSize - boxSize)
 */


class Solution {
    public static int maximumUnits(int[][] boxTypes, int truckSize){
        int [][] orderedUnitSize = orderByUnitSize(boxTypes);
        int totalUnits = 0;
        // System.out.println("after orderByUnitSize");

        System.out.println("Ordered Units");
        for(int i = 0; i < orderedUnitSize.length; i++){
            System.out.println("[" + orderedUnitSize[i][0] + " " + orderedUnitSize[i][1]+ "]");
        }
        System.out.println("End of Ordered Units");
        int i = 0;
        while(i < orderedUnitSize.length){
            System.out.println("i = " + i);
            
            while(orderedUnitSize[i][0] > 0 && truckSize > 0){
                if(truckSize <= 0) break;
                // System.out.println("Adding: " + orderedUnitSize[i][1]);
                System.out.println("Truck Size: " + truckSize);
                totalUnits += orderedUnitSize[i][1];
                System.out.println("Looking at orderedUnitSize[i][1] = " + orderedUnitSize[i][1]);
                orderedUnitSize[i][0] -= 1;
                truckSize -= 1;
                // System.out.println(orderedUnitSize[i][0]);
            }   
            i++;
        }
        return totalUnits;
    }

    public static int[][] orderByUnitSize(int[][] boxTypes){
        // get unit sizes
        int[] unitSizes = new int[boxTypes.length];
        for(int i = 0; i < boxTypes.length; i++){
            unitSizes[i] = boxTypes[i][1];
        }
        // order unit sizes
        // this sort method only works in one-dimensional
        // how can you extend it to 2-d arrays

        // cancel ^ only have to get the total of boxes with that unit size
        for(int i = 0; i < unitSizes.length; i++){
            for(int j = 0; j < unitSizes.length - 1; j++){
                if(unitSizes[j] < unitSizes[j+1]){
                    int temp = unitSizes[j];
                    unitSizes[j] = unitSizes[j+1];
                    unitSizes[j+1] = temp;
                }
            }
        }

        // check that they are in order:
        // System.out.println("Printing unitSizes");
        for(int i = 0; i < unitSizes.length; i++){
            // System.out.println(unitSizes[i]);
        }

        // create new nested array with sizes in order
        int[][] newBoxTypes = new int[unitSizes.length][2];
        for(int i = 0; i < unitSizes.length; i++){
            for(int j = 0; j < unitSizes.length; j++){
                if(unitSizes[i] == boxTypes[j][1]){
                    newBoxTypes[i] = boxTypes[j];
                }
            }
        }

        // return
        return newBoxTypes;
    }

    public static void main(String[] args){
        // output here: 8
        // int[][] oneBoxTypes = new int[][] {{1, 3}, {2, 2}, {3, 1}};
        // int oneTruckSize = 4;
        int[][] twoBoxTypes = new int[][] {{2,1}, {4,4}, {3, 1}, {4, 1}, {2,4}, {3,4}, {1,3}, {4, 3}, {5, 3}, {5, 3}};
        // in order not working
        int twoTruckSize = 13;
        // * boxTypes = [[5, 10], [2, 5], [4, 7], [3, 9]] trucksize = 10
        // output = 91
        int[][] threeBoxTypes = new int[][] {{5, 10}, {2, 5}, {4, 7}, {3,9}};
        int threeTruckSize = 10;

        
    
        // System.out.println("Test one: " + maximumUnits(oneBoxTypes, oneTruckSize));
        System.out.println("Test two: " + maximumUnits(twoBoxTypes, twoTruckSize));
        // System.out.println("Test two: " + maximumUnits(threeBoxTypes, threeTruckSize));
    }
}