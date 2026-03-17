import java.util.*;

class Summation extends Thread{
    private int n,sum,threads,arr[];
    Summation(int n,int threads,int arr[])
    {
        this.n=n;
        this.threads=threads;
        this.sum=0;
        this.arr=arr;
    }

    public void run()
    {
        for(int i=0;i<threads;i++)
        {
            arr[i]=n/threads;
            System.out.print("The consecutive thread is :");
            System.out.println(arr[i]);
            sum+=arr[i];
        }
        System.out.println("The sum is :"+sum);
    }
}

public class Practical_7_2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the number :");
        int n=sc.nextInt();
        System.out.print("Enter the number of threads :");
        int threads=sc.nextInt();
        
        int arr[]=new int[threads];
        Summation s=new Summation(n, threads, arr);
        s.start();
        sc.close();
        System.out.println();
        System.out.println("This Practical is made by 23CS075-Tejas Patel");
        return ;
    }
}
