package edu.iust.algorithms.divideandconquer;

import org.junit.Assert;
import org.junit.Test;

public class DivideAndConquerTest {

    @Test
    public void testFindMinMax() throws Exception {
        MinMax minMax = DivideAndConquer.findMinMax(new int[]{4, 7, 2, 5, 9, 1, 3});
        Assert.assertEquals(1, minMax.getMin());
        Assert.assertEquals(9, minMax.getMax());
    }

    @Test
    public void testFindMinMaxForEmptyList() throws Exception {
        Assert.assertNull(DivideAndConquer.findMinMax(new int[]{}));
    }
}