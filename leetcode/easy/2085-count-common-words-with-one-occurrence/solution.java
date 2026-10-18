class Solution {
    public int countWords(String[] s1, String[] s2) {
        Map<String, Integer> m1 = new HashMap<>();
        Map<String, Integer> m2 = new HashMap<>();

        for (String w : s1)
            m1.put(w, m1.getOrDefault(w, 0) + 1);

        for (String w : s2)
            m2.put(w, m2.getOrDefault(w, 0) + 1);

        int count = 0;

        for (String w : m1.keySet()) {
            if (m1.get(w) == 1 && m2.getOrDefault(w, 0) == 1) {
                count++;
            }
        }

        return count;
    }
}