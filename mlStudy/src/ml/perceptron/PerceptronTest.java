package ml.perceptron;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: st316
 * Date: 13-10-30
 * Time: 下午4:46
 */
public class PerceptronTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TrainingSet ts = new TrainingSet();
        ts.setFromStdIN(sc);
        double[] m = {0, 0};
        Perceptron perceptron = new Perceptron(ts, m, 0, 1);
        perceptron.train();
        System.out.println(perceptron);
        Point p = new Point();
        p.setFromStdIn(sc);
        System.out.println(perceptron.compute(p));
    }
}
