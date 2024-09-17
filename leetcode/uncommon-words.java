class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        HashMap<String,Integer> map = new HashMap<>();
        String[] s1arr = s1.split(" ");
        String[] s2arr = s2.split(" ");
        for(int i = 0; i<s1arr.length;i++){
            if(!map.containsKey(s1arr[i])){
                map.put(s1arr[i],1);

            }else{
                map.replace(s1arr[i],map.get(s1arr[i])+1);
            }
        }
        for(int i = 0; i<s2arr.length;i++){
            if(!map.containsKey(s2arr[i])){
                map.put(s2arr[i],1);

            }else{
                map.replace(s2arr[i],map.get(s2arr[i])+1);

            }
        }
        List<String> list = new ArrayList<>();
        for(Map.Entry<String,Integer> entry: map.entrySet()){
            if(entry.getValue()==1) {
                list.add(entry.getKey());
            }
        }
        return list.stream().toArray(String[]::new);

    }
}
