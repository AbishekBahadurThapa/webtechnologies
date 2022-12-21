import java.util.*;
public class MergeSort {
	                        
	ArrayList getInput(ArrayList<Integer>arr) {
		arr.add(38);
		arr.add(27);
		arr.add(43);
		arr.add(3);
		arr.add(9);
		arr.add(82);
		arr.add(10);
		
		System.out.println("Unsorted ArrayList"+arr);
		return arr;
	}
      void getOutput(ArrayList<Integer>arr){
	  System.out.println("Sorted Array:"+arr);
    
 }

	void merge(ArrayList<Integer>arr, int beg, int mid, int end){
    ArrayList<Integer>
	temp=new
	ArrayList<>();
       
        int i= beg;
		int j= mid+1;

		
		while (i<=mid && j<=end) {
			if(arr.get(i)<arr.get(j)) {
				temp.add(arr.get(i));
			    i++;
			 } else{
         
		temp.add(arr.get(j));
		  j++;
		 }
	   } 
	    while(i<=mid){
			temp.add(arr.get(i));
			i++;
		}
	     while(j<=end){
			temp.add(arr.get(j));
			j++;
		 }
          for(int k=beg,l=0;k<=end;k++,l++){
			arr.set(k,temp.get(l));
		  }
        }
		void sort(ArrayList<Integer>arr,int beg,int end)
		{
			if(beg>=end){
				return;
			}
		      int mid=(beg+end)/2;
			  sort(arr,beg,mid);
			  sort(arr,mid+1,end);

			merge(arr,beg,mid,end);
		}

   
    public static void main(String[] args) {
	
	MergeSort obj = new MergeSort(); 
   

	ArrayList<Integer>arr=new ArrayList<>();
	arr=obj.getInput(arr);
	int n=arr.size();
	obj.sort(arr,0,n-1);
	obj.getOutput(arr);
	}
}


