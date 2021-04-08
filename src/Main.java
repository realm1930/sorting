import java.util.Arrays;

/**
 * @author Arne Van Eycken
 * @version 1.0
 */

public class Main {


    public static void main(String[] args) {

        int[] array = {5,6,9,6,9,1,20,36,45,89,32,12,14,15,6,9,8,75,4,12,3,65,41,2,32};

        Sorting.quickSort(array, 0, array.length-1);

        System.out.println(Arrays.toString(array));

    }
}
