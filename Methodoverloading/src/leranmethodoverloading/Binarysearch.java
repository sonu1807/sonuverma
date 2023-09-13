package leranmethodoverloading;

public class Binarysearch {
	public static void main(String[] args) {
		
		int arr[]= {10,20,30,40,50,60,70,80,90,100};
		boolean flag=false;
		
		int key=50;
	
		int beg=0;
		int end=arr.length-1;
		
		while(beg<=end) {
	
			int mid=(beg+end)/2;
			
				
			
			if(arr[mid]==key) {
				System.out.println("key element found: "+mid);
				flag=true;
				break;
				
			}
			else	if(arr[mid]<key) {
				beg=mid+1;
				
			}
			else 	if(arr[mid]>key) {
				end=mid-1;
			}
			
				
		}
		if(!flag) {
			System.out.println("element not found");
		}
		
		
	}

}
