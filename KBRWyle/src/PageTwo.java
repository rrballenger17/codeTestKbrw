import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;



// page two of the code test including parts one, two, and three

public class PageTwo {
	
	// gets a list of integer values ranging
	// from start to end inclusive. The values are 
	// added sequentially and then the collection is shuffled.
	private static List<Integer> getShuffledList(int start, int end){
		List<Integer> nums = new ArrayList<Integer>();
		
		for(int i=start; i<=end; i++){
			nums.add(i);
		}
		
		Collections.shuffle(nums);
		
		return nums;
	}
	
	// gets the the shuffled array list
	// of integers from 1 to 10 inclusive.
	private static List<Integer> collectionOne(){
		return getShuffledList(1, 10);

	}
	
	// gets the the shuffled array list
	// of integers from 6 to 15 inclusive.
	private static List<Integer> collectionTwo(){
		
		return getShuffledList(6, 15);
		
	}
	

	
	// makes a duplicate of the first array of values.
	// The values from the second array are added in 
	// if the new array doesn't already contain that
	// value. The new collection and sorted and the middle
	// element is removed.
	private static List<Integer> collectionThree(List<Integer> one, List<Integer> two){
		
		List<Integer> nums = new ArrayList<Integer>(one);
		
		for(int i=0; i<two.size(); i++){
			int x = two.get(i);
			
			if(!nums.contains(x)){
				nums.add(x);
			}
		}
		
		Collections.sort(nums);
		
		nums.remove(nums.size() / 2);
		
		return nums;
	}
	
	// a new copy of the array is created. It
	// is sorted in reverse order and printed.
	private static void printReverseOrder(List<Integer> arr){
		
		List<Integer> rev = new ArrayList(arr);
		
		Collections.reverse(rev);
		
		System.out.println(rev.toString());
		
	}
	
	// The two arrays from the parameters are printed. 
	// The size of the arrays is also printed and the 
	// end-of-part line is printed as well.
	private static void partOne(List<Integer> one, List<Integer> two){
    	System.out.println(one.toString());
    	System.out.println(two.toString());
    	
    	System.out.println(one.size());
    	System.out.println(two.size());
	
    	printEndPart();

	}
	
	// The reverse order of elements, the size,
	// and end-part line are printed.
	private static void partTwo(List<Integer> three){
		printReverseOrder(three);
		System.out.println(three.size());
    	printEndPart();
	}
	
	// A hashmap with 5 unique key/values is created and returned.
	private static Map<Integer, Integer> collectionFour(){
		
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		map.put(1, 11);
		map.put(2, 22);
		map.put(3, 33);
		map.put(4, 44);
		map.put(5, 55);
		
		
		return map;
	}
	
	
	// If the map contains the key from the parameter, 
	// the key and its value are printed. 
	private static void printKeyValue(Map<Integer, Integer> map, int key){
		
		if(map.keySet().contains(key)){
			System.out.println("key: " + key + " value: " + map.get(key));
		}
		
	}
	
	
	private static void printNewLine(){
		System.out.println("");

	}
	
	private static void printEndPart(){
		System.out.println("=========");

	}
	
	// a duplicate key/value is added, which doesn't
	// change the map. The duplicate key and its value,
	// which is retrieved, are printed. All the keys
	// and their values are then printed. Finally the size
	// of the map is printed.
	private static void partThree(Map<Integer, Integer> map){
		
		int key = 4;
		
		int value = 44;
		
		// add the duplicate
		map.put(key,  value);
		
		// print the key / value if the key is present
		printKeyValue(map, key);
		
		printNewLine();
		
		for(int i: map.keySet()){
			printKeyValue(map, i);
		}
		
		System.out.println(map.keySet().size());
		
	}
	
	
    public static void main(String[] args) {
    	
    	// part one
    	List<Integer> one = collectionOne();
    	List<Integer> two = collectionTwo();
    	partOne(one, two);
    	
    	// part two
    	List<Integer> three = collectionThree(one, two);
    	partTwo(three);
    	
    	// A hashmap was chosen because it stores 
    	// key/value pairs as requested and because it
    	// is very efficient. It has a constant O(1)
    	// time for get and put operations, assuming
    	// that the hash function disperses the elements
    	// across the buckets.
    	Map<Integer, Integer> four = collectionFour();
    	
    	partThree(four);
    	
    }
}
