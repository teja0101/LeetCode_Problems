class Solution {
    public String minWindow(String s, String t) {
        int sLen = s.length(), len = Integer.MAX_VALUE;
        int[] ans = new int[2];
        Map<Character, Integer> map = new HashMap<>();
        Map<Character, Integer> wid = new HashMap<>();

        for (int i = 0; i < t.length(); i++) {
            map.put(t.charAt(i), map.getOrDefault(t.charAt(i), 0) + 1);
        }

        int need = map.size(), have = 0, l = 0;

        for (int r = 0; r < sLen; r++) {
            char ele = s.charAt(r);
            wid.put(ele, wid.getOrDefault(ele, 0) + 1);

            if (map.containsKey(ele) && wid.get(ele).intValue() == map.get(ele).intValue()) {
                have++;
            }

            while (have == need) {
                if (r - l + 1 < len) {
                    len = r - l + 1;
                    ans[0] = l;
                    ans[1] = r + 1;
                }

                ele = s.charAt(l);
                wid.put(ele, wid.get(ele) - 1);
                if (wid.get(ele) == 0) {
                    wid.remove(ele);
                }

                if (map.containsKey(ele) && wid.getOrDefault(ele, 0) < map.get(ele)) {
                    have--;
                }

                l++;
            }
        }

        if(len == Integer.MAX_VALUE) return "";
        return s.substring(ans[0], ans[1]);
    }
}
