class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        
        Arrays.sort(nums);
        Set<List<Integer>> s = new HashSet<>();
        List<List<Integer>> output = new ArrayList<>();

        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                int k=j+1;
                int l=nums.length-1;
                while(k < l){
                    long sum = nums[i];
                    sum += nums[j];                                 
                    sum += nums[k];                       
                    sum += nums[l];                         

                    if(sum == target){
                        s.add(Arrays.asList(nums[i], nums[j], nums[k], nums[l]));
                        k++;
                        l--;
                    }
                    else if(sum < target){
                        k++;
                    }
                    else{
                        l--;
                    }

                }
            }
        }

        output.addAll(s);
        return output;


    }
}




// ---------------------------------------------------------------------------------------------------------------------------------------------




class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        
        Set<List<Integer>> hs = new HashSet<>();


        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                for(int k=j+1; k<nums.length; k++){
                    for(int l=k+1; l<nums.length; l++){
                        if((nums[i] + nums[j] + nums[k] + nums[l]) == target){
                           List<Integer> temp = new ArrayList<>();
 
                            temp.add(nums[i]);
                            temp.add(nums[j]);
                            temp.add(nums[k]);
                            temp.add(nums[l]);
                            Collections.sort(temp);
                            hs.add(temp);    
                        }
                    }
                }
            }
        }

        List<List<Integer>> res = new ArrayList<>(hs);
        return res;

    }
}


