public class Sort{
	
	private static double[] bubbleSort(double[] data){
		
		return new double[];
	}

	private static double[] selectionSort(double[] data){
		
		return new double[];
	}
	
	public static double[] sort(String algorithm, double[] data){
		
		if(algorithm.toLowerCase() == "bubble sort")
			
			return bubbleSort(data);			
		
		else if(algorithm.toLowerCase() == "selection sort")
			
			return selectionSort(data);
			
		else
			throw new Exception("unsupported Sorting Algorithm");		

	
	
	public static void main(String[] args){
		
	}
	
} 