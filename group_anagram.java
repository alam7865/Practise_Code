import java.util.*;
public class group_anagram{
    public static void main(String[] args) {
        // System.out.println("Hello");
        String strs[] = {"eat","tea","tan","ate","nat","bat"};

    //    String output[][]={["bat"],["nat","tan"],["ate","eat","tea"]}

        HashMap<String,List>map=new HashMap<>();

        int count[]=new int[26];

        for(int i=0;i<strs.length;i++)
        {
            String ss=strs[i];

            for(int j=0;j<ss.length();j++)
            {
                char ch=ss.charAt(j);
                count[ch-'a']++;
            }

            StringBuilder sb=new StringBuilder();

            for(int j=0;j<26;j++)
            {
                if(count[j]==0)
                {
                    sb.append('#');
                }
                else{
                    sb.append(count[j]);
                }
            }
            Arrays.fill(count,0);
            String strss=sb.toString();

            if(map.containsKey(strss))
            {
                map.get(strss).add(ss);
            }
            else{
                map.put(strss, new ArrayList<>(Arrays.asList(ss)));
            }
        }

        System.out.println(map.values());
    }
}