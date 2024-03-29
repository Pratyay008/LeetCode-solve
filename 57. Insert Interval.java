class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        
        List<int[]> res = new ArrayList<>();

        for(int[] i : intervals){
            if(newInterval == null || i[1] < newInterval[0]){
                res.add(i);
            }
            else if(i[0] > newInterval[1]){
                res.add(newInterval);
                res.add(i);
                newInterval = null;
            }
            else{
                newInterval[0] = Math.min(newInterval[0], i[0]);
                newInterval[1] = Math.max(newInterval[1], i[1]);
            }
        }

        if(newInterval != null)
            res.add(newInterval);

        return res.toArray(new int[res.size()][]);
        
    }
}



// -------------------------------------------------------------------------------------------



class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        
        List<int[]> res = new ArrayList<>();

        for(int[] slot : intervals){
            if(slot[1] < newInterval[0]){
                res.add(slot);
            }
            else if(slot[0] > newInterval[1]){
                res.add(newInterval);
                newInterval = slot;
            }
            else{
                newInterval[0] = Math.min(newInterval[0], slot[0]);
                newInterval[1] = Math.max(newInterval[1], slot[1]);
            }
        }

        res.add(newInterval);

        return res.toArray(new int[res.size()][]);

    }
}
