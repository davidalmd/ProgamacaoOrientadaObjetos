import java.util.ArrayList;
import java.util.List;

public class MockSongs {
    public static List<String> getSongStrings() {
        List<String> songs = new ArrayList<>();
        songs.add("somersault");
        songs.add("cassidy");
        songs.add("$10");
        songs.add("havana");
        songs.add("Cassidy");
        songs.add("50 Ways");
        return songs;
    }

    public static List<SongV2> getSongV2() {
        List<SongV2> songs =  new ArrayList<>();
        songs.add(new SongV2("somersault", "zero 7", 120));
        songs.add(new SongV2("cassidy", "grategul dead", 158));
        songs.add(new SongV2("$10", "hitchhiker", 140));
        songs.add(new SongV2("havana", "cabello", 105));
        songs.add(new SongV2("Cassidy", "grateful dead", 158));
        songs.add(new SongV2("50 Ways", "simon", 102));
        return songs;
    }
}
