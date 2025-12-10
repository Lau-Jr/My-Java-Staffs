public class {
	
	
	public static double[] sort(String algorithm, double[] data){
		
		if(algorithm.lowerCase() == "bubble sort")
			
			return bubbleSort(data);			
		
		else if(algorithm.lowerCase() == "selection sort")
			
			return selectionSort(data);
			
		else
			throw new Exception("unsupported Sorting Algorithm");
		

	
	
	public static void main(String[] args){
		
	}
	
} 