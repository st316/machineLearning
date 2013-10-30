package ml.perceptron;

/**
 * Created with IntelliJ IDEA.
 * User: st316
 * Date: 13-10-30
 * Time: 下午4:46
 */
public class PerceptronTest {
    public static void main(String[] args) {
        TrainingSet ts = new TrainingSet();
        ts.setFromStdIN();
        double[] m = {0, 0};
        Perceptron perceptron = new Perceptron(ts, m, 0, 1);
        System.out.println(perceptron);
    }
}
