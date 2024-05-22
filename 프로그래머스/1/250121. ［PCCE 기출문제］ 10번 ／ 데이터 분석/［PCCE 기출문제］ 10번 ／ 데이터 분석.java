import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Solution {
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        List<int[]> filteredData = new ArrayList<>();

        for (int[] item : data) {
            int value = getValue(item, ext);
            if (value < val_ext) {
                filteredData.add(item);
            }
        }

        Collections.sort(filteredData, new Comparator<int[]>() {
            @Override
            public int compare(int[] arr1, int[] arr2) {
                int value1 = getValue(arr1, sort_by);
                int value2 = getValue(arr2, sort_by);
                return Integer.compare(value1, value2);
            }
        });

        int[][] result = new int[filteredData.size()][4];
        for (int i = 0; i < filteredData.size(); i++) {
            result[i] = filteredData.get(i);
        }

        return result;
    }

    private int getValue(int[] item, String key) {
        switch (key) {
            case "code":
                return item[0];
            case "date":
                return item[1];
            case "maximum":
                return item[2];
            case "remain":
                return item[3];
            default:
                return 0;
        }
    }
}