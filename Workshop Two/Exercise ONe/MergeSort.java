import java.util.*;
public class MergeSort {
	                        
	ArrayList getInput(ArrayList<Integer>al) {
		al.add(38);
		al.add(27);
		al.add(43);
		al.add(3);
		al.add(9);
		al.add(82);
		al.add(10);
		
		System.out.println("Unsorted ArrayList"+al);
		return al;
	}
      void getOutput(ArrayList<Integer>al){
	  System.out.println("Sorted Array:"+al);
    
 }

	void merge(ArrayList<Integer>al, int beg, int mid, int end){
    ArrayList<Integer>
	temp=new
	ArrayList<>();
       
        int i= beg;
		int j= mid+1;

		
		while (i<=mid && j<=end) {
			if(al.get(i)<al.get(j)) {
				temp.add(al.get(i));
			    i++;
			 } else{
         
		temp.add(al.get(j));
		  j++;
		 }
	   } 
	    while(i<=mid){
			temp.add(al.get(i));
			i++;
		}
	     while(j<=end){
			temp.add(al.get(j));
			j++;
		 }
          for(int k=beg,l=0;k<=end;k++,l++){
			al.set(k,temp.get(l));
		  }
        }
		void sort(ArrayList<Integer>al,int beg,int end)
		{
			if(beg>=end){
				return;
			}
		      int mid=(beg+end)/2;
			  sort(al,beg,mid);
			  sort(al,mid+1,end);
			merge(al,beg,mid,end);
		}

   
    public static void main(String[] args) {
	
	MergeSort obj = new MergeSort(); 
   

	ArrayList<Integer>al=new ArrayList<>();
	al=obj.getInput(al);
	int n=al.size();
	obj.sort(al,0,n-1);
	obj.getOutput(al);
	}
}


