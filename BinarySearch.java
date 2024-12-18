public class BinarySearch {
    public static void main(String[] args) {
        int[] a = { -1, 0, 3, 5, 9, 12 };
        int target = 9;
        int si=0;
        int ei=a.length-1;
        int result = search(a, target, si, ei);
        System.out.println(result);

    }

    public static int search(int[] a, int target, int low, int high) {
        if (low > high) {
            return -1;
        }
        int mid = low + (high - low) / 2;
        if (a[mid] == target) {
            return mid;
        } else if (a[mid] < target) {
            return search(a, target, mid + 1, high);
        }
        return search(a, target, low, mid - 1);

    }
}
