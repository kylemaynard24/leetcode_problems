import java.util.ArrayList;
import java.util.HashMap;

import javax.swing.SizeSequence;

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
        int[][] boxAndSizes = groupBoxes(boxTypes);
        for(int i = 0; i < boxAndSizes.length; i++){
            System.out.println("[ " + boxAndSizes[i][0] + "," + boxAndSizes[i][1] + "]");
        }
        return -1;    
    }

    // grouping method:
    /**
     * Group all boxes with same unit sizes (aggregate the total amount of boxes)
     */

    public static int[][] groupBoxes(int[][] boxTypes){
        HashMap<Integer, Integer> uniqueSizes = new HashMap<Integer, Integer>();
        // key == unit size, value = number of boxes
        // hashmap containing the each unique unit size with the number of boxes of that unique unit size
        for(int i = 0; i < boxTypes.length; i++){
            boolean found = false;
            int currentAdd = boxTypes[i][1];
            for(int j = 0; j < uniqueSizes.size(); j++){
                // if(currentAdd == uniqueSizes.get()){
                if(uniqueSizes.containsKey(currentAdd)){
                    found = true;
                }
            }
            // aggregation
            if(!found){
                uniqueSizes.put(currentAdd, boxTypes[i][0]);
            } else{
                uniqueSizes.put(currentAdd, uniqueSizes.get(currentAdd) + boxTypes[i][0]);
            }   
        }
        // create a nested array of the hashmap with the number of boxes to the unit size in nonincreasing order
        // int[] sizesToOrder = (int) uniqueSizes.keySet().toArray();
        int[] sizesToOrder = new int[uniqueSizes.keySet().size()];
        
        // List<String> keys = new ArrayList<>(uniqueSizes.keySet());
        for(int i = 0; i < uniqueSizes.keySet().size(); i++){
            // fix this
            // sizesToOrder[i] = uniqueSizes
        }
        // sort the sizesToOrder:
        for(int i = 0; i < sizesToOrder.length; i++){
            for(int j = i; j < sizesToOrder.length; j++){
                if(sizesToOrder[j] < sizesToOrder[j+1]){
                    int temp = sizesToOrder[j];
                    sizesToOrder[j] = sizesToOrder[j+1];
                    sizesToOrder[j+1] = temp;
                }
            }
        }

        // reach back into uniqueSizes and pull value of key create new array for each [uniqueSizes.get(sizesToOrder(i)), sizesToOrder[i]] -> [number_of_boxes, UnitSize]
        int[][] result = new int[sizesToOrder.length][2];
        for(int i = 0; i < sizesToOrder.length; i++){
            result[i] = new int[] {uniqueSizes.get(i), sizesToOrder[i]};
        }
        
        // [number_of_boxes, UnitSize] -> return this
        return result;
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