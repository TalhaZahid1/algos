import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Generics {


    public void doGenerics(){
        Integer[] firstInt = { 100, 22, 58, 41, 6, 50 };
        Integer[] secondInt = { 10, 22, 5, 41, 60, 50 };
        List<Integer> genericList =  getMatchingElements(firstInt, secondInt);
        genericList.forEach(a->System.out.println("MAtching Integers --- "+a));
        String[] firstString = { "Hello","world" };
        String[] secondString = { "Hello","Talha" };
        List<String> genericList2 =  getMatchingElements(firstString, secondString);
        genericList2.forEach(a->System.out.println("MAtching Strings --- "+a));
    }


    private <T> List<T> getMatchingElements(T[] first, T[] second){
        List<T> array  = Arrays.stream(first).filter(a-> Arrays.stream(second).anyMatch(b->a == b))
                .collect(Collectors.toList());

        return array;
    }
}
