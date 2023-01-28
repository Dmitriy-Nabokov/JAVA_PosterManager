import org.junit.jupiter.api.Test;
import ru.netology.PosterManager;

public class PosterTest {

    @Test
    public void test() {
        PosterManager manager = new PosterManager();

        manager.addPoster("Poster 1");
        manager.addPoster("Poster 2");
        manager.addPoster("Poster 3");
        manager.addPoster("Poster 4");
        manager.addPoster("Poster 5");

        String[] expected = {"Poster 1", "Poster 2", "Poster 3", "Poster 4", "Poster 5"};
        String[] actual = manager.findAll();
    }
}
