public class Main {
    public static void main(String[] args) {


        System.out.println(div(20,2));
    }
    private static int div(int nominator , int denominator){
        int count=0;
        while (nominator>=denominator){
            nominator-=denominator;
            count ++;
        }
        return count;
    }
}