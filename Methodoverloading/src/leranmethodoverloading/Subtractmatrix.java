package leranmethodoverloading;

public class Subtractmatrix {
	public static void main(String[] args) {
		int rows,cols;
		
		
int a[][]= { {4,6,4},{5,7,3},{7,4,3} };
	int b[][]= {{3,4,3},{4,5,1},{6,2,3}};
	
	rows=a.length;
	cols=a[0].length;
	int c[][]=new int[rows][cols];
	
	for(int i=0;i<rows;i++) {
		for(int j=0;j<cols;j++) {
			c[i][j]=a[i][j]-b[i][j];
			
		}
	}
	for(int i=0;i<rows;i++) {
		for(int j=0;j<cols;j++) {
	
	System.out.println(" "  +c[i][j]);
	}
}
	
	}
	}