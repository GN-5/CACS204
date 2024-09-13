public class TimeTaken {
    public static void main(String[] args){
    long start, end, time;
    start = System.currentTimeMillis();

    for(long i = 0; i<1000000000; i++);

    end = System.currentTimeMillis();

    time = end - start;

    System.out.println("Time taken is : "+ time);
    }
}
