class Solution {
    public int equalPairs(int[][] grid) {
        HashMap<List<Integer>,Integer> map=new HashMap<>();
        int count=0;

        for(int i=0;i<grid.length;i++) {
            List<Integer> row = new ArrayList<>();
            for(int j=0;j<grid[0].length;j++) {
                row.add(grid[i][j]);
            }
              map.put(row,map.getOrDefault(row,0)+1);
        }
        for(int i=0;i<grid[0].length;i++) {
            List<Integer> col = new ArrayList<>();
            for(int j=0;j<grid.length;j++) {
                col.add(grid[j][i]);
            }
            if(map.containsKey(col)) count += map.get(col);
            //   map.put(col,map.getOrDefault(col,0)+1);
        }
        return count;

    }
}
