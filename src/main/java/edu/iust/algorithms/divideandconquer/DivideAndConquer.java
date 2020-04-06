package edu.iust.algorithms.divideandconquer;

public class DivideAndConquer {

    public static MinMax findMinMax(int values[]){
        if (values.length == 0)
            return null;

        return findMinMax(values, 0, values.length - 1);
    }

    private static MinMax findMinMax(int values[], int start, int end){
        if (start == end){
            return new MinMax(values[start], values[start]);
        } else if (start == end - 1){
            if (values[start] < values[end]){
                return new MinMax(values[start], values[end]);
            } else {
                return new MinMax(values[end], values[start]);
            }
        } else {
            int mid = (start + end) / 2;
            MinMax lower = findMinMax(values, start, mid);
            MinMax upper = findMinMax(values, mid + 1, end);
            return new MinMax(
                    lower.getMin() < upper.getMin() ? lower.getMin() : upper.getMin(),
                    lower.getMax() < upper.getMax() ? upper.getMax() : lower.getMax()
            );
        }
    }
}
