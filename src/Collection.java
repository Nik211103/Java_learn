import java.util.ArrayList;
import java.util.LinkedList;

public class Collection {
    public static void main(String[] args) {
//        ArrayList<Integer> numbers = new ArrayList<>();
//        numbers.add(5);
//        numbers.add(10);
//        numbers.add(1, 2);//не замена, а добавление со сдвигом
//        //System.out.println(numbers.size());
//        System.out.println(numbers.get(1));
//        numbers.remove(1);//удаление
//        //numbers.clear();//удаление всех элементов
//
//
//        for(Integer el: numbers) {
//            System.out.println(el);
//        }
        LinkedList<Float> numbers = new LinkedList<>();
        numbers.add(5.45f);
        numbers.add(5.3f);

        for (Float el: numbers) {
            System.out.println(el);
        }
    }

}
