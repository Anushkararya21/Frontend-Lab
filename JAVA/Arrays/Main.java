import java.util.*;
public class Main {
    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 1, 4, 1};
        int z = arr.length;

        int[] nancy = helper(arr, 0, z - 1);
        System.out.print(Arrays.toString(nancy));
    }

    static int[] helper(int[] arr, int l, int r) {
      if (l >= r) {
    return new int[]{arr[l]};
        }

        int mid = l + (r - l) / 2;

        int[] a = helper(arr, l, mid);
        int[] b = helper(arr, mid + 1, r);

        return mergesort(a, b);
    }

    static int[] mergesort(int[] a, int[] b) {
        int n = a.length;
        int m = b.length;

        int i = 0, j = 0, k = 0;
        int[] c = new int[n + m];

        while (i < n && j < m) {
            if (a[i] < b[j]) {
                c[k++] = a[i++];
            } else {
                c[k++] = b[j++];
            }
        }

        while (i < n) {
            c[k++] = a[i++];

		}

        while (j < m) {
            c[k++] = b[j++];
        }

        return c;
    }
}
