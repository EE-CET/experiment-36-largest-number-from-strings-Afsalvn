  
import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int n = sc.nextInt();
            String[] arr = new String[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.next();
            }
            
            // Custom sort: compare which combination of strings creates a larger number
            Arrays.sort(arr, new Comparator<String>() {
                public int compare(String a, String b) {
                    return (b + a).compareTo(a + b);
                }
            });
            
            StringBuilder result = new StringBuilder();
            for (String s : arr) {
                result.append(s);
            }
            System.out.println(result.toString());
        }
        sc.close();
    }
}
