//This Program Does 2 by 2 Matrix Multiplication

//C[i][j]=k=0∑n−1​A[i][k]∗B[k][j]

import java.util.Scanner;
class MatMul {
	
	private boolean areMatricesMultiplicable(double[][] A, double[][] B){
		
		System.out.println(A[0].length);
		System.out.println(B.length);
		return A[0].length == B.length ? true:false;
		
		}
	
	private double[][] getMatrixFromUser(Scanner input){
		
		System.out.println("How Many Rows does this Matrix Have?: ");
		int r = input.nextInt();
		
		System.out.println("How Many Columns does this Matrix Have?: ");
		int c = input.nextInt();
		
		System.out.printf("Creating Matrix Whose shape is %d by %d%n",r,c);
		
		double[][] A = new double[r][c];
		
		for(int i = 0; i < r; i++){
			
			for(int j = 0; j < c; j++){
				
				System.out.printf("%nEnter Value of A%d%d: ",i,j);
				A[i][j] = input.nextDouble();
				
				}
			}
		
		return A;
		}	
	
	public double[][] multiplyMatrix(double[][] A, double[][] B){
		
		double[][] C = new double[A.length][B[0].length];
		
		for(int i = 0; i< A.length; i++){
			for(int j=0;j<B[0].length; j++){
				C[i][j]=0;
				for(int k=0; k<B.length;k++){
					C[i][j] += A[i][k] * B[k][j];
					}
				}
			}
		
		return C;
		
		}
	
	private void displayMatrix(double[][] M){
		
		for(int i = 0; i < M.length; i++){			
			for(int j = 0; j < M[0].length; j++){				
				System.out.printf("%.2f ",M[i][j]);
				}
				System.out.println();
			}		
		}
	
	public static void main(String[] args){
		
		MatMul mm = new MatMul();
		
		Scanner input = new Scanner(System.in);
		
		double[][] A = mm.getMatrixFromUser(input);		
		double[][] B = mm.getMatrixFromUser(input);
		
		input.close();
		
		if(mm.areMatricesMultiplicable(A,B)){
			

			mm.displayMatrix(mm.multiplyMatrix(A,B));
			
			}	
		else{
			System.out.printf("AB is IMPossible");
			}
		}
	
	}
