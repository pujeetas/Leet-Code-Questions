public class ReverseString {
    public static void main(String[] args) {
        char[] a = { 'h', 'e', 'l', 'l', 'o' };

        int si = 0;
        int n = a.length;
        int ei = n - 1;

        char temp;

        while (si < ei) {
            temp = a[si];
            a[si] = a[ei];
            a[ei] = temp;
            si++;
            ei--;
        }
        System.out.println(a);

    }
}
