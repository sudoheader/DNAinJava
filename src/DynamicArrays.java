
public class DynamicArrays {

	public static void main(String[] args) {
		
//		ArrayList<String> arrayList = new ArrayList<String>();
		DynamicArray dynamicArray = new DynamicArray();
		
		dynamicArray.add("A");
		dynamicArray.add("B");
		dynamicArray.add("C");
		dynamicArray.add("D");
		dynamicArray.add("E");

		dynamicArray.delete("A");
		dynamicArray.delete("B");
		
//		dynamicArray.insert(0, "X");
//		dynamicArray.delete("A");
//		System.out.println(dynamicArray.search("C"));
		
		System.out.println(dynamicArray);
		System.out.println("size: " + dynamicArray.size);
		System.out.println("capacity: " + dynamicArray.capacity);
		System.out.println("empty: " + dynamicArray.isEmpty());
	}
}
