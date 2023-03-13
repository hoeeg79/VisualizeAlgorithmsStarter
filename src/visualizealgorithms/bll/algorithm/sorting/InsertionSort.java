package visualizealgorithms.bll.algorithm.sorting;

import visualizealgorithms.bll.algorithm.AlgorithmType;
import visualizealgorithms.bll.algorithm.GenericAlgorithm;

public class InsertionSort extends GenericAlgorithm {
    public InsertionSort() {
        super("Insertion Sort", "Fastest simple sorting algorithm - O(n^2)", AlgorithmType.SORTING);
    }

    @Override
    public void doWork() {
        int[] b = (int[]) super.getData();

        for (int i = 1; i < b.length; i++) {
            int tmp = b[i];
            int holeIndex = i;

            while (holeIndex > 0 && b[holeIndex - 1] > tmp) {
                b[holeIndex] = b[holeIndex - 1];
                holeIndex--;
            }
            b[holeIndex] = tmp;
        }
    }
}
