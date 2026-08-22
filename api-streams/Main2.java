import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Main2 {
public static void main(String[] args) {
    List<String> debugValues = new ArrayList<>();
    var names = Stream.of("Mário", "Lucas", "Felipe", "Luana", "Márcia")
    //.peek(System.out::println)
    .peek(debugValues::add)
    .filter(name -> name.endsWith("a"))
    .toList();

    names.forEach(System.out::println);
    System.out.println("=============");
    System.out.println(debugValues);
}
}
