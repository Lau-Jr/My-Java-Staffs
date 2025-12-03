//This Program Does 2 by 2 Matrix Multiplication

import java.util.Scanner;
class MatMul {
	
	private boolean areMatricesMultiplicable(double[][] A, double[][] B){
		
		System.out.println(A[0].length);
		System.out.println(B.length);
		return A[0].length == B.length ? true:false;
		
		}
	
	public double[][] multiplyMatrix(double[][] A, double[][] B){
		
		return new double[A.length][B[0].length];
		
		}
	
	public static void main(String[] args){
		MatMul mm = new MatMul();
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("How Many Rows does First Matrix Have?: ");
		int r1 = input.nextInt();
		
		System.out.println("How Many Columns does First Matrix Have?: ");
		int c1 = input.nextInt();
		
		System.out.printf("Creating first Matrix Whose shape is %d by %d%n",r1,c1);
		
		double[][] A = new double[r1][c1];
		
		System.out.println("How Many Rows does Second Matrix Have?: ");
		int r2 = input.nextInt();
		
		System.out.println("How Many Columns does Second Matrix Have?: ");
		int c2 = input.nextInt();
		
		System.out.printf("Creating Second Matrix Whose shape is %d by %d%n",r2,c2);
		
		double[][] B = new double[r2][c2];
		
		if(mm.areMatricesMultiplicable(A,B)){
			mm.areMatricesMultiplicable(A,B);
			}	
		else{
			System.out.printf("AB is IMPossible");
			}
		}
	
	}
