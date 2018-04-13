package code.WhoEatWho;

import java.util.*;

public class Eat {
    public static void main(String[] args) {
        new Eat().getSolution();
    }

    private Map<String, HashSet<String>> getMap(String [] data){
        Map<String, HashSet<String>> map = new HashMap<>();
        String [] strs;
        for (String s : data) {
            strs = s.split(" ");
            if(map.containsKey(strs[0])) {
                HashSet <String> set = map.get(strs[0]);
                set.add(strs[2]);
                map.put(strs[0], set);
            }
            else {
                HashSet <String> set = new HashSet<>();
                set.add(strs[2]);
                map.put(strs[0], set);
            }
        }
        return map;
    }

    private void getSolution() {
        System.out.println(
                Arrays.toString(solution("fox,bug,chicken,grass,sheep"))
        );
    }

    private String [] solution(String input) {
        Map<String, HashSet<String>> map = getMap(new String[]{
                "antelope eats grass",
                "big-fish eats little-fish",
                "bug eats leaves",
                "bear eats big-fish",
                "bear eats bug",
                "bear eats chicken",
                "bear eats cow",
                "bear eats leaves",
                "bear eats sheep",
                "chicken eats bug",
                "cow eats grass",
                "fox eats chicken",
                "fox eats sheep",
                "giraffe eats leaves",
                "lion eats antelope",
                "lion eats cow",
                "panda eats leaves",
                "sheep eats grass"
        });
        ArrayList<String> list = new ArrayList<>();
        String [] query = input.split(",");
        for (int i = 0; i < query.length; i++) {
            if(i < query.length -1 && map.get(query[i]).contains(query[i+1])){
                map.get(query[i]).remove(query[i+1]);
                list.add(map.get(query[i]).toString());
                i = 0;
            }
            else if(i > 0 && map.get(query[i]).contains(query[i-1])){
                map.get(query[i]).remove(query[i-1]);
                list.add(map.get(query[i]).toString());
                i = 0;
            }
            else list.add(map.get(query[i]).toString());
        }
        return (String[]) list.toArray();
    }
}
