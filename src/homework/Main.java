package homework;

import java.util.HashMap;
import java.util.Map;

public class Main {
    /*
    Дана Map<String, String> map, написать метод, который вернет Мап, такую,
    что если в исходной map есть ключи ‘a’ и ‘b’, то нужно создать новый ключ ‘ab’
    с суммой значений от ключей a и b. Если нет, ничего не менять.

Примеры:
mapAB({"a": "Hi", "b": "There"}) → {"a": "Hi", "ab": "HiThere", "b": "There"}
mapAB({"a": "Hi"}) → {"a": "Hi"}
mapAB({"b": "There"}) → {"b": "There"}
     */

    public static void main(String[] args) {
        Map<String, String> ourMap = new HashMap<>();
        ourMap.put("a", "Hello");
        ourMap.put("b", "Java");
        System.out.println(changeOurMap(ourMap));

    }
    public static Map<String,String> changeOurMap (Map <String, String> ourMap){

        if (! ourMap.containsKey("a") || ! ourMap.containsKey("b")){
            return ourMap;
        }

        Map <String, String> changeOurMap = new HashMap<>();

        for(Map.Entry<String, String> entry : ourMap.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            if (key.equals("a")) {
                changeOurMap.put("a", value);
            }
            if (key.equals("b")) {
                changeOurMap.put("b", value);
            }

        }

        ourMap.put("ab", changeOurMap.get("a").concat(changeOurMap.get("b")));
        return ourMap;
    }

}
