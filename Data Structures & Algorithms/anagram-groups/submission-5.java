class Solution {
    
    public int[] mapAnagram(String s){
        int[] count = new int[26];
        for (int i = 0; i < s.length(); i++){
            count[s.charAt(i) - 'a']++;
        }
        return count;
    }

    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, ArrayList<String>> anagrams = new HashMap();
        for (String s : strs){
            String id = Arrays.toString(mapAnagram(s));

            if(!anagrams.containsKey(id)){
                ArrayList<String> list = new ArrayList();
                list.add(s);
                anagrams.put(id, list);
                continue;
            }

            anagrams.get(id).add(s);

        }
        return new ArrayList<>(anagrams.values());

    }
}
