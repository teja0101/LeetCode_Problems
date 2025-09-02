class Solution {
    public String minWindow(String s, String t) {
        int p1 = 0, p2 = 0, slen = s.length(), len = Integer.MAX_VALUE;
        int[] ans = new int[2];

        Map<Character, Integer> map = new HashMap<>();
        for (int idx = 0; idx < t.length(); idx++) {
            char ele = t.charAt(idx);
            map.put(ele, map.getOrDefault(ele, 0) + 1);
        }
        Map<Character, Integer> wid = new HashMap<>();
        while (p2 < slen) {
            char ele = s.charAt(p2);
            wid.put(ele, wid.getOrDefault(ele, 0) + 1);

            while (isMap1GreaterOrEqual(wid, map)){
                if (len > (p2 - p1  + 1)) {
                    len = p2 - p1 + 1;
                    ans[0] = p1;
                    ans[1] = p2 + 1;
                }
                ele = s.charAt(p1);
                wid.put(ele,wid.get(ele) - 1);
                if((wid.get(ele)) == 0)
                    wid.remove(ele);
                
                p1++;

            }
         p2++;

        }
        if(len == Integer.MAX_VALUE)return"";
        
        String str = s.substring(ans[0], ans[1]);
        return str;
    }

    static boolean isMap1GreaterOrEqual(Map<Character, Integer> map1, Map<Character, Integer> map2) {
        return map2.entrySet().stream()
                .allMatch(e -> map1.containsKey(e.getKey()) && map1.get(e.getKey()) >= e.getValue());
    }
}
