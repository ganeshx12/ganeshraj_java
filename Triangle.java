class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {

        for (int i = triangle.size() - 2; i >= 0; i--) {

            for (int j = 0; j < triangle.get(i).size(); j++) {

                int a = triangle.get(i + 1).get(j);
                int b = triangle.get(i + 1).get(j + 1);

                int min = Math.min(a, b);

                triangle.get(i).set(j,
                    triangle.get(i).get(j) + min);
            }
        }

        return triangle.get(0).get(0);
    }
} 
