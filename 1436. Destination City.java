class Solution {
    public String destCity(List<List<String>> paths) {
        
        HashSet <String> cities = new HashSet<>();

        for(List<String> path : paths){        
            cities.add(path.get(0));   

        }

        for(List<String> path : paths){        
            String destination = path.get(1);
            if(!cities.contains(destination)){
                return destination;
            }  

        }

        return "";

    }
}
