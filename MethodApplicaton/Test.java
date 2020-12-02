
import java.util.*;

public class Test {

    public static void main(String[] args) {
        MethodApplication x = new MethodApplication();
//        int d[] = {12, 6, 7, 4, 8, 34, 59, 28};
//        x.shuffle(d);
//        System.out.println(Arrays.toString(d));
//        int d[] = {12, 6, 7, 4, 8, 34, 59, 28};
//         x.remove(d,3 );
//        System.out.println(Arrays.toString(d));
//           int d[] = {34, 12, 59, 4, 8, 34, 59, 28};
//           x.insert(d, 4, 79);
//           System.out.println(Arrays.toString(d));
//            double [][]i = {{1,0,0},{4,2,0},{8,7,4}};
//            double [][]j = {{1,0,0,0},{1,4,0,0},{2,1,2,1},{7,5,5,3}};
//            System.out.println(x.isLowerTriangular(i));
//            System.out.println(x.isLowerTriangular(j));
//                int d[] = {34, 12, 59, 4, 8, 34, 59, 28};
//                System.out.println(Arrays.toString(x.maxmin(d)));
//        int d[][] = {{2, 5, 6, 8}, {5, 4, 7, 1}, {11, 12, 1, 0}, {7, 11, 21, 3}};
//        System.out.println(x.sumOfColumn(d, 2));
           int d[][] = {{2,5,6,8},{5,4,7,1},{11,12,1,0},{7,11,21,3}};
           System.out.println(x.rowOfMax(d));
    }
}
