import java.util.Comparator;

public class ArtistCompare implements Comparator<SongV3> {
    @Override
    public int compare(SongV3 one, SongV3 two) {
        return one.getArtist().compareTo(two.getArtist());
    }
}
