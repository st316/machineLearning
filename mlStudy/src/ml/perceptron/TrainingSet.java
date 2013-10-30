package ml.perceptron;

import java.util.LinkedHashMap;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: st316
 * Date: 13-10-30
 * Time: 下午3:07
 */
public class TrainingSet {
    private LinkedHashMap<Point, Boolean> ts;
    private int count;
    private int pointDim;

    public TrainingSet() {
        this.ts = new LinkedHashMap<Point, Boolean>();
    }

    public TrainingSet(LinkedHashMap<Point, Boolean> ts, int pointDim) {
        this.ts = ts;
        this.count = ts.size();
        this.pointDim = pointDim;
    }

    public void setFromStdIN(Scanner sc) {
        int c = sc.nextInt();
        Point p = null;
        for (int i = 0; i < c; i++) {
            p = new Point();
            p.setFromStdIn(sc);
            this.ts.put(p, sc.nextBoolean());
        }
        this.count = this.ts.size();
        this.pointDim = p.getDimension();
    }

    public void setTs(LinkedHashMap<Point, Boolean> ts) {
        this.ts = ts;
        this.count = ts.size();
    }

    public int getPointDim() {
        return pointDim;
    }

    public int getCount() {

        return count;

    }

    public LinkedHashMap<Point, Boolean> getTs() {

        return ts;
    }

    @Override
    public String toString() {
        return "TrainingSet{" +
                "ts=" + ts +
                ", count=" + count +
                '}';
    }
}
