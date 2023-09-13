package leranmethodoverloading;

public class Frequencyofeachelement {
	public static void main(String[] args) {
		
		int arr[]= {1,4,5,1,8,9,5,8,6,5,6};
		int fr[]=new int[arr.length];
		
	
	int visited=-1;
	
	
	for(int i=0;i<arr.length;i++) {
		int count=1;
	for(int j=i+1;j<arr.length;j++) {
		if(arr[i]==arr[j])
		{
			count++;
			fr[j]=visited;
		}
			
	}
	if(fr[i]!=visited) 
		fr[i]=count;
		
	}
	System.out.println("element|| frequency");
	for(int i=0;i<fr.length;i++){
		if(fr[i]!=visited)
		System.out.println("   "+arr[i]+ "    |     "+fr[i]);
		}
}
		
		}


