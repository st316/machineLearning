package ml.perceptron;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;

/**
 * Created with IntelliJ IDEA.
 * User: st316
 * Date: 13-10-30
 * Time: 下午2:59
 */
public class Perceptron {
    private TrainingSet ts;
    private double[] w;
    private double b;
    private double LR;

    public Perceptron() {
    }

    public Perceptron(TrainingSet ts) {
        this.ts = ts;
        this.w = new double[ts.getPointDim()];
        this.b = 0;
    }

    public Perceptron(TrainingSet ts, double[] initialW, double initialB) {
        this.ts = ts;
        this.w = initialW;
        this.b = initialB;
    }

    public Perceptron(TrainingSet ts, double[] initialW, double initialB, double LR) {
        this.ts = ts;
        this.w = initialW;
        this.b = initialB;
        this.LR = LR;
    }

    public void train() {
        LinkedHashMap<Point, Boolean> tsMap = ts.getTs();
        boolean flag;
        do {
            flag = true;
            for (Iterator it = tsMap.keySet().iterator(); it.hasNext(); ) {
                Point p = (Point) it.next();
                double sum = 0;
                for (int i = 0; i < w.length; i++) {
                    sum += w[i] * p.getValue()[i];
                }
                if ((sum + b <= 0 && tsMap.get(p))) {//该点为误分类点
                    for (int i = 0; i < w.length; i++) {
                        w[i] += this.LR * p.getValue()[i];
                        b += this.LR;
                    }
                    flag = false;
                    break;
                }
                if (sum + b > 0 && !tsMap.get(p)) {//该点为误分类点
                    for (int i = 0; i < w.length; i++) {
                        w[i] -= this.LR * p.getValue()[i];
                        b -= this.LR;
                    }
                    flag = false;
                    break;
                }
            }
        } while (!flag);
    }

    @Override
    public String toString() {
        return "Perceptron{" +
                "w=" + Arrays.toString(w) +
                ", b=" + b +
                '}';
    }
}
