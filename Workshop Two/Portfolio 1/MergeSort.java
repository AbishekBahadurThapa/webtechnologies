import java.util.*;

public class MergeSort {
    public void getInput(ArrayList<Integer> al) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter element: ");
        int n = sc.nextInt();
        System.out.println("Enter the number:");
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            al.add(a);
        }
        System.out.println("entered arraylist: ");
        System.out.println(al);
    }

    public void getOutput(ArrayList<Integer> al) {
        System.out.println("arranged list: ");
        System.out.println(al);
    }

    public void merge(ArrayList<Integer> al, int beg, int mid, int end) {
        ArrayList<Integer> temp = new ArrayList<Integer>();

        int index1 = beg;
        int index2 = mid + 1;

        while (index1 <= mid && index2 <= end) {
            if (al.get(index1) <= al.get(index2)) {
                temp.add(al.get(index1));
                index1++;
            } else {
                temp.add(al.get(index2));
                index2++;
            }
        }
        while (index1 <= mid) {
            temp.add(al.get(index1));
            index1++;
        }
        while (index2 <= end) {
            temp.add(al.get(index2));
            index2++;
        }

        for (int i = 0; i < temp.size(); beg++) {
            al.set(beg, temp.get(i++));
        }

    }

    public void sort(ArrayList<Integer> al, int beg, int end) {
        if (beg >= end) {
            return;
        }

        int mid = beg + (end - beg) / 2;
        sort(al, beg, mid);
        sort(al, mid + 1, end);
        merge(al, beg, mid, end);
    }

    public static void main(String[] args) {
        MergeSort ms = new MergeSort();
        ArrayList<Integer> al = new ArrayList<Integer>();
        ms.getInput(al);
        ms.sort(al, 0, al.size() - 1);
        ms.getOutput(al);
    }

}
