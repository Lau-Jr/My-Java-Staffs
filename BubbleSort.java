public class Sort{
	
	private static double[] bubbleSort(double[] data){
		
		int dataLength = data.length;
		
		for(int i = 0; i < dataLength - 1; i++){
			
			for(int j = i; j < dataLength - 1 - i; j++ ){
				
				if (data[j] < data[j+1]){
					
					double temp = data[j];
					data[j] = data[j+1];
					data[j+1] = temp;
					
				}
				
			}
		}
		
		return data;
	}

	private static double[] selectionSort(double[] data){
		
		return new double[]{};
	}
	
	public static double[] sort(String algorithm, double[] data) throws Exception {
		
		if(algorithm.toLowerCase() == "bubble sort")
			
			return bubbleSort(data);			
		
		else if(algorithm.toLowerCase() == "selection sort")
			
			return selectionSort(data);
			
		else
			throw new Exception("unsupported Sorting Algorithm: " + algorithm);		

	}
	
	public static void main(String[] args){
		
		double[] numbers = {5.2, 3.1, 4.7, 2.9, 1.0};
		
		try{
			sort("bubbe sort", numbers);
		
			System.out.println();
			
			for (double num : numbers) {
				System.out.print(num + " ");
			}
			
			System.out.println();
		}
		
		catch(Exception e){
			
			System.out.printf("%nException: %s",e.getMessage());
		}
		
		
		
	}
	
} 