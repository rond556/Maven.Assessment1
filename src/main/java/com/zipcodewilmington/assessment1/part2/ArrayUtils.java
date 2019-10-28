package com.zipcodewilmington.assessment1.part2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by leon on 2/16/18.
 */
public class ArrayUtils {
    /**
     * @param objectArray   an array of any type of Object
     * @param objectToCount any non-primitive value
     * @return the number of times the specified `value` occurs in the specified `objectArray`
     * Given an array of objects, named `objectArray`, and an object `objectToCount`, return the number of times the `objectToCount` appears in the `objectArray`
     */
    public static Integer getNumberOfOccurrences(Object[] objectArray, Object objectToCount) {
        int numberOfObjects = 0;
        for(int i = 0; i <= objectArray.length - 1; i++){
            if (objectArray[i].equals(objectToCount)) {
                numberOfObjects += 1;
            }
        }
        return numberOfObjects;
    }

    /**
     * @param objectArray    an array of any type of Object
     * @param objectToRemove a value to be removed from the `objectArray`
     * @return an array with identical content excluding the specified `objectToRemove`
     * Given an array of objects, name `objectArray`, and an object `objectToRemove`, return an array of objects with identical contents excluding `objectToRemove`
     */
    public static Object[] removeValue(Object[] objectArray, Object objectToRemove) {
        List<Object> objectList = new ArrayList<>();
        for(int i = 0; i <= objectArray.length - 1; i++){
            if(!objectArray[i].equals(objectToRemove)){
                objectList.add(objectArray[i]);
            }
        }
        return objectList.toArray(new Object[objectList.size()]);
    }

    /**
     * @param objectArray an array of any type of Object
     * @return the most frequently occurring object in the array
     * given an array of objects, named `objectArray` return the most frequently occurring object in the array
     */
    public static Object getMostCommon(Object[] objectArray) {
        int count = 0;
        for(int i = 0; i <= objectArray.length - 1; i++){
            int temporaryCount = 0;
            for(int j = 0; j <= 9; j++){
                if((Integer)objectArray[i] == j){
                    temporaryCount++;
                }
            }
            if(temporaryCount > count){
                count = temporaryCount;
            }
        }
        return count;
    }


    /**
     * @param objectArray an array of any type of Object
     * @return the least frequently occurring object in the array
     * given an array of objects, named `objectArray` return the least frequently occurring object in the array
     */
    public static Object getLeastCommon(Object[] objectArray) {
        int count = 0;
        for(int i = 0; i <= objectArray.length - 1; i++){
            int temporaryCount = 0;
            for(int j = 1; j <= 4; j++){
                if((Integer)objectArray[i] == j){
                    temporaryCount++;
                }
            }
            if(temporaryCount < count){
                count = temporaryCount;
            }
        }
        return count;
    }

    /**
     * @param objectArray      an array of any type of Object
     * @param objectArrayToAdd an array of Objects to add to the first argument
     * @return an array containing all elements in `objectArray` and `objectArrayToAdd`
     * given two arrays `objectArray` and `objectArrayToAdd`, return an array containing all elements in `objectArray` and `objectArrayToAdd`
     */
    public static Object[] mergeArrays(Object[] objectArray, Object[] objectArrayToAdd) {
        Object[] mergedArray = new Object[objectArray.length + objectArrayToAdd.length];
        Integer outsideCounter = 0;
        for(int i = 0; i <= objectArray.length - 1; i++){
            mergedArray[outsideCounter] = objectArray[i];
            outsideCounter++;
        }
        for(int i = 0; i <= objectArrayToAdd.length - 1; i++){
            mergedArray[outsideCounter] = objectArrayToAdd[i];
            outsideCounter++;
        }
        return mergedArray;
    }
}
