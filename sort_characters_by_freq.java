class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer> m=new HashMap<Character,Integer>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(!m.containsKey(c))
                m.put(c,1);
            else
                m.put(c,m.get(c)+1);
        }
      PriorityQueue<Character> p=new PriorityQueue<>((a,b)->m.get(b)-m.get(a));
        p.addAll(m.keySet());
        StringBuilder res=new StringBuilder();
        while(!p.isEmpty()){
            char ch=p.remove();
            for(int i=0;i<m.get(ch);i++)
                res.append(ch);
        }
        return res.toString();
    }
}
