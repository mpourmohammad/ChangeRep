import Streams.Movie;
import Streams.StreamsDemo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class MainStreams {
    public static void main(String[] args) {
        //StreamsDemo.Show();
        List<Movie> movies = List.of(new Movie("Film1", 8), new Movie("Film2", 10), new Movie("Film3", 10));

        int count = 0;
        Stream<Movie> movieStream = movies.stream().filter(a -> a.getLikes() > 10);
        System.out.println(movieStream.count());
    }
}


