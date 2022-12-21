import java.util.Scanner;
public class work{ 
    
    public static void main(String[] args){
        int [] arr= new int[5]; int max;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the array element");
        for(int i=0;i<5;i++)
        {
            arr[i]=sc.nextInt();
        }
         max=arr[0];
         for(int i=1;i<5;i++)
         {
             if(arr[i]>max)
             {
                 max=arr[i];
             }
         }
          System.out.println("Maximum Element"+max);
        }
    } 