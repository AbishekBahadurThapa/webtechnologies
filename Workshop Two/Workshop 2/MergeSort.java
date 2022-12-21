import java.utiil.*;
public class MergeSort {
	                        
	ArrayList getInput(ArrayList<Integer> list) {
		list.add(38);
		list.add(43);
		list.add(3);
		list.add(9);
		list.add(82);
		list.add(10);
		for(int i = 0; i< size; i++){
		}
		System.out.println(list);
		System.out.println("Unsorted array: ");
		return list;
	}

	 
	void getOutput(ArrayList<Integer>list){
    System.out.println("Sorted Array:");
	System.out.print("[");
	for(i=0;i<=list.size(); i++) {
		if(i == list.size() - 1){
			System.out.print(list.get(i));
		} else{
			System.out.print(list.get(i) + ", ");
		}
	}
	System.out.print("]");
}

	void merge(ArrayList<Integer>list, int beg, int mid, int end){
         int beginning = begin;
		 int middleIndex = middle + 1;
         int ending = end;

		 while(beginning <=middleIndex && middleIndex <=ending) {
			if(list.get(beginning) > (list.get(middleIndex))){
				list.add(beginning, list.remove(middleIndex));
				beginning++;
				middleIndex++;
			} else if (Objects.equals(list.get(beginning), list.get(middleIndex))) {
				list.add(beginning , list.remove(middleIndex));
				beginning++;
				middleIndex++;
			} else {
				beginning++;
			}
		}
	}
	void sort(ArrayList<Integer> list, int beg, int end){
        if(begin<end){
			int middle = (begin + end) / 2;
			sort(list, begin, middle);
			sort(list,middle+1, end);
			merge(list, begin, middle, end);
		}
 }
	 
	public static void main(String[] args) {
	MergeSort object = new MergeSort(); // Object of Merge Sort java
	object.getInput(list)
	object.sort(list, 0, list.size()-1);
	object.getOutput(list);
	}
}


