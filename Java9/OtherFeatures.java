package Java9;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Stream;

public class OtherFeatures {

    // of immutable list method
    List<String> list = List.of("one", "two", "three");
    Set<String> set = Set.of("one", "two", "three");
    Map<String, String> map = Map.of("foo", "one", "bar", "two");

    // takeWhile,dropWhile,iterate methods.
    Stream<String> stream = Stream.iterate("", s -> s + "s")
        .takeWhile(s -> s.length() < 10);



}
