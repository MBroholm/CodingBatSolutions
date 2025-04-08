import java.util.HashMap;
import java.util.Map;

public class Map2 {
    public Map<String, Integer> word0(String[] strings) {
        Map<String, Integer> map = new HashMap<>();
        for(String str : strings) map.put(str,0);
        return map;
    }

    public Map<String, Integer> wordLen(String[] strings) {
        Map<String, Integer> map = new HashMap<>();
        for(String str : strings) map.put(str, str.length());
        return map;
    }

    public Map<String, String> pairs(String[] strings) {
        Map<String, String> map = new HashMap<>();
        for(String str: strings) map.put(str.substring(0,1), str.substring(str.length()-1));
        return map;
    }

    public Map<String, Integer> wordCount(String[] strings) {
        Map<String, Integer> map = new HashMap<>();

        //for(String str : strings){
        //  if(!map.containsKey(str)){
        //    map.put(str, 1);
        //  }else{
        //    map.put(str, map.get(str)+1);
        //  }
        //}

        for(String str: strings) map.put(str, map.getOrDefault(str, 0) + 1);
        return map;
    }

    public Map<String, String> firstChar(String[] strings) {
        Map<String, String> map = new HashMap<>();
        for(String str: strings){
            String key = str.substring(0,1);
            map.put(key, map.getOrDefault(key, "") + str);
        }
        return map;
    }

    public String wordAppend(String[] strings) {
        Map<String, Integer> map = new HashMap<>();

        StringBuilder sb = new StringBuilder();

        for(String str : strings){
            map.put(str, map.getOrDefault(str,0)+1);
            if(map.get(str)%2==0) sb.append(str);
        }

        return sb.toString();
    }

    public Map<String, Boolean> wordMultiple(String[] strings) {
        Map<String, Boolean> map = new HashMap<>();

        for(String str : strings){
            if(map.containsKey(str)){
                map.put(str, true);
            }else{
                map.put(str, false);
            }
        }

        return map;
    }

    public String[] allSwap(String[] strings) {
        Map<Character, Integer> map = new HashMap<>();

        int i = 0;
        for(String str : strings){
            if(!str.isEmpty()){
                char key = str.charAt(0);
                if(!map.containsKey(key)){
                    map.put(key,i);
                }else{
                    String temp = strings[map.get(key)];
                    strings[map.get(key)] = strings[i];
                    strings[i] = temp;
                    map.remove(key);
                }
            }
            i++;
        }
        return strings;
    }

    public String[] firstSwap(String[] strings) {
        Map<Character, Integer> map = new HashMap<>();

        for(int i = 0; i<strings.length; i++){
            char key = strings[i].charAt(0);

            if(!map.containsKey(key)){
                map.put(key,i);
            }else if(map.get(key)<0){
                continue;
            }else {
                String temp = strings[map.get(key)];
                strings[map.get(key)] = strings[i];
                strings[i] = temp;
                map.put(key,-1);
            }
        }

        return strings;
    }

}
