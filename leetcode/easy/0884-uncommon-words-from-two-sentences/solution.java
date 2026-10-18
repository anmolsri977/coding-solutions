class Solution {
    public String[] uncommonFromSentences(String a, String b) {
        String s1[]=a.split(" ");
        String s2[]=b.split(" ");
        Map<String,Integer> map=new HashMap<>();
        List<String> list=new ArrayList<>();
        for(int i=0;i<s1.length;i++){
            map.put(s1[i],map.getOrDefault(s1[i],0)+1);
        }
        for(int i=0;i<s2.length;i++){
            map.put(s2[i],map.getOrDefault(s2[i],0)+1);
        }
        for(String word:map.keySet()){
            if(map.get(word)==1){
                list.add(word);
            }
        }
        return list.toArray(new String[0]);
    }
}