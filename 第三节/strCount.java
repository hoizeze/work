package come.java.demo;

import java.util.HashMap;
import java.util.Set;

public class strCount {
    static HashMap map = new HashMap<String,Integer>();
    static int count = 0;
    public static void mapInsert(String string){
        if (map.containsKey(string))
        {
            count = (Integer)map.get(string);
            map.put(string,++count);
            return;
        }
        map.put(string,1);
    }
    public static void main(String[] args) {
        mapInsert("111");
        mapInsert("111");
        mapInsert("111");
        mapInsert("222");
        mapInsert("222");
        mapInsert("333");
        mapInsert("111");
        mapInsert("222");
        mapInsert("666");
        Set<String> KeySet = map.keySet();
        for (String Key:KeySet) {
            System.out.println(Key+"出现了"+map.get(Key)+"次");
        }
    }
}
