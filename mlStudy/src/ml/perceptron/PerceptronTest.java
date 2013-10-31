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
        //原始形式
        Perceptron perceptron = new Perceptron(ts, m, 0, 1);
        perceptron.train();
        System.out.println(perceptron);
        Point p = new Point();
        p.setFromStdIn(sc);
        System.out.println(perceptron.compute(p));
        //对偶形式
        Perceptron perceptron1 = new Perceptron(ts);
        perceptron1.dualTrain();
        System.out.println(perceptron1);
        System.out.println(perceptron1.compute(p));
        sc.close();
    }
}
