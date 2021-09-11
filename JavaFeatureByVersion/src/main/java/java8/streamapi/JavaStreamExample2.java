package java8.streamapi;

import java.util.stream.Stream;

/**
 * @author Sadman
 */
public class JavaStreamExample2 {
    public static void main(String[] args){
        Stream.iterate(1, element->element+1)
                .filter(element->element%5==0)
                .limit(5)
                .forEach(System.out::println);
    }
}
