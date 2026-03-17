public class Practical_7_5 {
    public static void main(String[] args) {
        //GENERATE THREE THREADS
        Thread t1=new Thread();
        Thread t2=new Thread();
        Thread t3=new Thread();

        //SETS PRIORITY TO THREE THREADS
        t1.setPriority(3);
        t2.setPriority(5);
        t3.setPriority(7);

        //PRINTS PRIORITY OF THE THREE THREADS
        System.out.println("Priority of thread 1="+t1.getPriority());
        System.out.println("Priority of thread 2="+t2.getPriority());
        System.out.println("Priority of thread 3="+t3.getPriority());
        System.out.println();
        System.out.println("This Practical is made by 23CS075-Tejas Patel");
        return;
    }
}