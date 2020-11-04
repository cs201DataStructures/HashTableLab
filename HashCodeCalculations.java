import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * In class lab for learning about hash code functions and collisions.
 * @author arafferty
 * @author YOUR NAME HERE
 */
public class HashCodeCalculations {

    /**
     * Always returns 0.
     */
    public static int hashCode0(String s) {
        return 0;
    }
    
    /**
     * Read through the code and change this comment to what this hash code function
     * does. Note that casting a character to an integer returns its ASCII value - there
     * are 128 characters, and each has a distinct number from 0-127. 
     */
    public static int hashCode1(String s) {
        if(s.isEmpty()) {
            return 0;
        } else {
            return (int) s.charAt(0);
        }
    }
    
    /**
     * Read through the code and change this comment to what this hash code function
     * does.
     */
    public static int hashCode2(String s) {
        int hashCode = 0;
        for(int i = 0; i < s.length(); i++) {
            hashCode += (int) s.charAt(i);
        }
        return hashCode;
    }
    
    /**
     * Read through the code and change this comment to what this hash code function
     * does. Hint: You might think about how you would write an integer as a sum that
     * uses its digits to get a better understanding of what's happening here. 
     * (Note that this isn't quite the same thing, but it's similar.)
     */
    public static int hashCode3(String s) {
        int hashCode = 0;
        for(int i = 0; i < s.length(); i++) {
            hashCode = 129*hashCode + (int) s.charAt(i);
        }
        return hashCode;
    }
     
     
    
    /**
     * Implement this function so it works the way we talked about in class.
     * Compression function that takes a hash code (positive or negative) and
     * the number of buckets we have to use in our hash table, and compresses
     * the hash code into the range [0, numberOfBuckets).
     */
    public static int compressToSize(int hashCode, int numberOfBuckets) {
        return 0;//TODO: Change me!
    }
    
    /**
     * Counts the number of buckets that have no words stored at them - i.e.,
     * they have value 0 - and calculates what proportion of the total buckets
     * that is.
     */
    public static double proportionOfBucketsWithNoWords(int[] buckets) {
        int emptyBucketCount = 0;
        for(int i = 0; i < buckets.length; i++) {
            if(buckets[i] == 0) {
                emptyBucketCount++;
            }
        }
        return emptyBucketCount*1.0/buckets.length;
    }
    
    
    /**
     * Returns the maximum value in a single bucket
     */
    public static int getMaxBucketValue(int[] buckets) {
        int max = -1;//Safe starting value since all buckets[i] should be >= 0
        for(int i = 0; i < buckets.length; i++) {
            if(buckets[i] > max) {
                max = buckets[i];
            }
        }
        return max;
    }
    
    /**
     * Returns the average number of words in each non-empty bucket
     */
    public static double getAverageInNonEmptyBuckets(int[] buckets) {
        int totalCount = 0;
        int totalNonEmpty = 0;
        for(int i = 0; i < buckets.length; i++) {
            totalCount += buckets[i];
            if(buckets[i] != 0) {
                totalNonEmpty++;
            }
        }
        return totalCount*1.0/totalNonEmpty;
    }
    
    
    /**
     * Implement this method so that it calculates how many words would be placed
     * in each bucket in the array. 
     * Each individual word should be counted only once (i.e., if "the" occurs 
     * 501 times in the file, you should only hash it once, rather than thinking 
     * of it as causing 500 collisions).
     * @param numBuckets number of spots to include in the array
     * @param file file to read from
     * @param hashCodeFunctionToUse which of the hash functions to use; see lab 
     *                              description for more details
     * @return an array that indicates how many different words are place in index 0, 1, etc.
     */
    public static int[] collisionCounter(int numBuckets, String file, int hashCodeFunctionToUse) {
        //Initialize the variables you'll need to count collisions (an array, a set)
        
        try {
            Scanner scanner =  new Scanner(new File(file));
            //Write your code for counting collisions here.

            scanner.close();
        } catch(FileNotFoundException e) {
            e.printStackTrace();
        }
        return null;//Change this line to return your count of collisions
    }
    
    public static void main(String[] args) {
        //TODO: Change me!
        
    }
    
          
}
