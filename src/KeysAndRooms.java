import java.util.*;
public class KeysAndRooms {
    public static boolean canVisitAllRooms(List<List<Integer>> rooms) {
        ArrayList<Integer> keys=new ArrayList<>();
        keys.addAll(rooms.get(0));
        if(keys.isEmpty()){
            return false;
        }
        ArrayList<Integer> visited=new ArrayList<>();
        while(!keys.isEmpty()){
            for(Integer a:rooms.get(keys.get(0))){
                if(!keys.contains(a) && !visited.contains(a)){
                    keys.add(a);
                }
            }
            if(!visited.contains(keys.get(0))){
                visited.add(keys.get(0));
            }

            keys.remove(0);
            if(keys.size()==rooms.size()){
                break;
            }
        }
        for(int i=1;i<rooms.size();i++){
            if(!visited.contains(i)){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        List<List<Integer>> rooms=new ArrayList<>();
        for(int i=0;i<=9;i++){
            rooms.add(new ArrayList<>());
        }
        rooms.get(0).add(4);
        rooms.get(1).add(3);
        rooms.get(3).add(2);
        rooms.get(3).add(5);
        rooms.get(3).add(7);
        rooms.get(4).add(1);
        rooms.get(6).add(8);
        rooms.get(6).add(9);
        rooms.get(9).add(6);
        System.out.println(canVisitAllRooms(rooms));
    }
}