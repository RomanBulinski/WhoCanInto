import java.util.Arrays;
import java.util.List;

public class Main {


    public static void main(String[] args) {


        List<Person> whiteList = Arrays.asList(
                new Person( "Rom", "111-222-333", Arrays.asList( "python","C" )  ),
                new Person( "Tom", "111-222-333", Arrays.asList( "Java","C" )  )
        );


        whiteList.stream()
                .filter(person -> person.getName().equals("Rom") )
                .map(person -> person.getName() + " -  " + person.getPhone())
                .forEach(System.out::println);


    }




}
