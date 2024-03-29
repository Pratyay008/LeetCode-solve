class Solution {
    public int compareVersion(String version1, String version2) {
        
        String[] v1 = version1.split("\\.");
        String[] v2 = version2.split("\\.");

        int longest;

        if(v1.length > v2.length)
            longest = v1.length;
        else
            longest = v2.length;


        for(int i=0; i<longest; i++){

            int ver1 = i<v1.length ? Integer.parseInt(v1[i]):0;

            int ver2 = i<v2.length ? Integer.parseInt(v2[i]):0;

            if(ver1 > ver2)
                return 1;

            if(ver1 < ver2)
                return -1;    

        }    

        return 0;
    }
}
