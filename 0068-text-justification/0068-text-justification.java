class Solution {
    public List<String> fullJustify(String[] words, int maxWidth) {
        int idx = 0, n = words.length;
        List<String> ans = new ArrayList<>();
        while(n > idx){
            int wrdlen = words[idx].length(), wc = 0, st = idx;
            idx++;
            while(maxWidth >= wrdlen + wc){
                if(idx >= n)break;
                if((wrdlen + words[idx].length() + wc + 1<= maxWidth)){
                    wrdlen += words[idx].length();
                    idx++;
                    wc++;
                }
                else break;
            }
            String ele = "";
            ele += words[st];

            if(wc > 0 ){
                if(n == idx){
                    int cn = 0;
                    while(wc-- > 0){
                        ele += " ";
                        cn++;
                        st++;
                        ele += words[st];
                    }
                     for(int i = 0; i < (maxWidth - (wrdlen + cn) ); i++){
                        ele += " ";
                    }
                }
                else{
                    int ex  = (maxWidth - wrdlen) % wc;
                    int sp = (maxWidth - wrdlen) / wc;
                     while(wc-- > 0){
                        for(int i = 0;i < sp ;i++){
                            ele += " ";
                        }
                        if (ex > 0)ele += " ";
                        ex--;
                        st++;
                        ele += words[st];
                    }
                }
            }
            else{
                for(int i = 0; i < (maxWidth - wrdlen); i++){
                ele += " ";
                }
            }
            
            ans.add(ele);
        }
        return new ArrayList<String>(ans);
    }
}
