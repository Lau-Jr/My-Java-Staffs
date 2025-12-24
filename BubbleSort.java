/* public void bubbleSort() {
    // Assuming names is a String[] and nItems is the number of elements
    for (int i = nItems - 1; i > 0; i--) {          // Outer loop backward from end to start
        for (int j = 0; j < i; j++) {               // Inner loop forward from start to i-1
            if (names[j].compareTo(names[j + 1]) > 0) {  // If names[j] > names[j+1]
                // Swap names[j] and names[j+1]
                String temp = names[j];
                names[j] = names[j + 1];
                names[j + 1] = temp;
            }
        }
    }
} */

//Generics Works with Wrappers not PrimitiveTypes


public class Sort{
	
	private static <T extends Comparable<T>> T[] bubbleSort(T[] data){
		
		int dataLength = data.length;
		
		for(int i = 0; i < dataLength - 1; i++){
			
			for(int j = i; j < dataLength - 1 - i; j++ ){
				
				if (data[j].compareTo(data[j + 1]) > 0){
					
					T temp = data[j];
					data[j] = data[j+1];
					data[j+1] = temp;
					
				}
				
			}
		}
		
		return data;
	}

	private static <T extends Comparable<T>> T[] selectionSort(T[] data){
		
		int dataLength = data.length;
		
		for(int i = 0; i < dataLength -1; i++){
			
			int minIndex = i;
			
			for(int j = i + 1; j < dataLength; j++){
				
				if(data[j].compareTo(data[minIndex]) < 0){
					
					minIndex = j;
					
				}
			}
			
			T temp = data[minIndex];
			data[minIndex] = data[i];
			data[i] = temp;
		}
		
		return data;
	}
	
	public static <T extends Comparable<T>> T[] sort(String algorithm, T[] data) throws Exception {
		
		if(algorithm.toLowerCase() == "bubble sort")
			
			return bubbleSort(data);			
		
		else if(algorithm.toLowerCase() == "selection sort")
			
			return selectionSort(data);
			
		else
			throw new Exception("unsupported Sorting Algorithm: " + algorithm);		

	}
	
	public static void main(String[] args){
		
		Double[] numbers = {5.2, 3.1, 4.7, 2.9, 1.0};
		String[] names = {"Zara", "Alice", "John", "Mike", "Bob"};
		
		try{
			sort("selection sort", names);
		
			System.out.println();
			
			for (String num : names) {
				System.out.print(num + " ");
			}
			
			System.out.println();
		}
		
		catch(Exception e){
			
			System.out.printf("%nException: %s",e.getMessage());
		}
		
		
		
	}
	
} 