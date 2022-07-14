/*
Maximum Units on a Truck:

You are assigned to put some amount of boxes onto one truck.
You are given a 2D array boxTypes, where boxTypes = [numberOfBoxes, numberOfUnitsPerBox]
    * numberOfBoxes is the number of boxes of type i 
    * numberOfUnitsPerBox is the number of units in each box of type i

You are also given an integer truckSize, which is the maximum number of boxes that
can be put on the truck. You can choose any boxes to put on the truck as long as the number of
boxes does not exceed truckSize

Return the maximum total number of units that can be put on the truck

Input: boxTypes = [[1, 3], [2, 2], [3, 1]], truckSize = 4
Output: 8
Explanation: There are:
    - 1 box of the first type that contains 3 units
    - 2 boxes of the second type that contains 2 units each
    - 3 boxes of the third type that contain 1 unit each
Strategy:
    High Level:
        A cool feature of a map is that all the keys are unique
        Create a map with key = unitSize and value = (numberOfBoxes) aggregated
        Order the keys in descending order
        while trucksize > 0:
            check to see that value of key > 0
            total += unitSize
            decrease value of that key until 0
        return the total
*/

using System;
using System.Collections.Generic;


public class Solution {
    public int MaximumUnits(int[][] boxTypes, int truckSize) {
        int total = 0;
        IDictionary<int, int> boxes = orderUnitSizes(boxTypes);
        System.Console.WriteLine(boxes);
        // int[] orderedKeys = new int[this.boxes.keys.Count];
        // List<int> boxKeys = boxes.Keys;
        // foreach (var item in boxKeys)
        // {
        //     System.Console.WriteLine(item);
        // }
        // return total;
        return -1;
    }

    public IDictionary<int, int> orderUnitSizes(int[][] boxTypes){
        // iterate through boxTypes
        // Create a Dictionary<int, int> to return
        IDictionary<int, int> resultDictionary = new IDictionary<>();
        return resultDictionary;

        // for each boxType:
            // grab the unitSize which is in [i][1]
            // grab the unitCount which is in [i][0]
                // if the unitSize does not exist add it, set the unitCount as the value
                // if it does exist access it then add the unitCount to the unitCount of that key
        // for(int i = 0; i < boxTypes.length; i++){
        //     int unitSize = boxTypes[i][1];
        //     int unitCount = boxTypes[i][0];
        //     if(!(resultDictionary.ContainsKey(unitSize))){
        //         // key does not exist
        //         resultDictionary[unitSize] = unitCount;
        //     } else {
        //         resultDictionary[unitSize] += unitCount;
        //     }
        // }
        // return resultDictionary;
    }

    static void Main(string[] args){
        System.Console.WriteLine("Hello World");
        // test 1:
        int[,] boxTypes = new int[3,2] {
            {1, 3}, 
            {2, 2}, 
            {3, 1}
        };
        int truckSize = 4;
        System.Console.WriteLine(MaximumUnits(boxTypes, truckSize));
    }
}