package ml.perceptron;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: st316
 * Date: 13-10-30
 * Time: 下午3:11
 */
public class Point {
    private int dimension;
    private int[] value;

    public Point() {
    }

    public Point(int[] value) {

        this.dimension = value.length;
        this.value = Arrays.copyOf(value, value.length);

    }

    public void setFromStdIn() {
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();
        int[] v = new int[d];
        for (int i = 0; i < d; i++)
            v[i] = sc.nextInt();
        sc.close();
        this.setValue(v);
    }

    public int getDimension() {
        return dimension;
    }

    public int[] getValue() {
        return value;
    }

    public void setValue(int[] value) {
        this.value = value;
        this.dimension = value.length;
    }

    @Override
    public String toString() {
        return "Point{" +
                "dimension=" + dimension +
                ", value=" + Arrays.toString(value) +
                '}';
    }
}
