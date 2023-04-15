package javaPrograms;

public class MergeSort {

	
//	merge method
	public static void merge(int a[],int lb,int mid,int ub)
	{
		int b[] = new int[ub-lb+1];
		int i = lb;
		int j = mid+1;
		int k=0;
		while(i<=mid && j<=ub)
		{
			if(a[i]<=a[j])
			{
				b[k++] = a[i++];
				
			}
			else
			{
				b[k++]=a[j++];
				
			}
			
		}//while end
		
		
			while(j<=ub)
			{
				b[k++]=a[j++];
				
			}
			while(i<=mid)
			{
				b[k++] = a[i++];
				
			}
		
		for(int c=0,p=lb; c<b.length; c++,p++) {  //copy elements of second array to first array
			a[p]=b[c];
		}
		 
	}
	
	
//	merge sort method
	public static void mergesort(int a[],int lb,int ub) 
	{
		
		if(lb>=ub)         //it make sure that array has at least two elements
		{
			return;
		}
			
			int mid = (lb + ub)/2;
			mergesort(a,lb,mid);
			mergesort(a,mid+1,ub);
			merge(a,lb,mid,ub);
			
			
		}
	
	
	

	public static void main(String[] args) {
		
		int a[] = {1,5,4,3,2,1,8,9,10,5,66};
		mergesort(a,0,a.length-1);
		for(int i:a)
		  {
			System.out.print(i+"  ");
			
	    	}
		
	}

}
