public class GFG_Swapping_pairs_make_sum_equal {

    public static int suma(int a[]) {
        int sumA = 0;
        for (int i : a) {
            sumA += i;
        }
        return sumA;
    }

    public static int sumb(int b[]) {
        int sumB = 0;
        for (int i : b) {
            sumB += i;
        }
        return sumB;
    }

    public static int findSwapValues(int a[], int n, int b[], int m) {
        // Your code goes here
        // int sumA = suma(a);
        // int sumB = sumb(b);

        
            for (int i=0;i<n;i++) {
                for (int j=0;j<m;j++) {
                    int temp = a[i];
                    a[i] = b[j];
                    b[j] = temp;
                    int sumA1=suma(a);
                    int sumB1=sumb(b);
                    if (sumA1 == sumB1) {
                        System.out.println("a[i]="+b[j]+ " " + "b[i]="+a[j]);
                        return 1;
                    }
                }
            }
    
        

        return -1;
    }

    public static void main(String args[]) {
        int a[] = { 4, 1, 2, 1, 1, 2 };
        int b[] = { 3, 6, 3, 3 };
       
        int n = a.length;
        int m = b.length;
        System.out.println(findSwapValues(a, n, b, m));


        int a1[]= {5, 7, 4, 6};
        int b1[]={1, 2, 3, 8};
        int n1 = a.length;
        int m1 = b.length;
        System.out.println(findSwapValues(a1, n1, b1, m1));


    }
}
