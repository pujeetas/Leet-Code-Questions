public class SingleNumber {
    public static void main(String[] args) {
        int[] a = { 1};
        
        int current = 0;

        for(int n : a){
            current = current ^ n;
        }
        System.out.println(current);
    }
}
