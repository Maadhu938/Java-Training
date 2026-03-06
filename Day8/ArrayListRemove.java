import java.util.ArrayList;
public class ArrayListRemove {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 1; i <= 10; i++) {
            list.add(i);
        }
        for(int i = list.size() - 1; i >= 0; i--) {
            if(list.get(i) > 7) {
                list.remove(i);
            }
        }
        System.out.println(list);
    }
}