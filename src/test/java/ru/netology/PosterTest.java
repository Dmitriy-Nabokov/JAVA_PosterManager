package ru.netology;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.PosterManager;

public class PosterTest {

    @Test
    public void PostersDefaultQuantity() {                 // Тестирование addPoster и findAll
        PosterManager manager = new PosterManager();

        manager.addPoster("Poster 1");
        manager.addPoster("Poster 2");
        manager.addPoster("Poster 3");
        manager.addPoster("Poster 4");
        manager.addPoster("Poster 5");

        String[] expected = { "Poster 1", "Poster 2", "Poster 3", "Poster 4", "Poster 5" };
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void PostersVariableQuantity() {
        PosterManager manager = new PosterManager(6);

        manager.addPoster("Poster 1");
        manager.addPoster("Poster 2");
        manager.addPoster("Poster 3");
        manager.addPoster("Poster 4");
        manager.addPoster("Poster 5");
        manager.addPoster("Poster 6");

        String[] expected = {"Poster 1", "Poster 2", "Poster 3", "Poster 4", "Poster 5", "Poster 6"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void PosterFindLast() {
        PosterManager manager = new PosterManager();

        manager.addPoster("Poster 1");
        manager.addPoster("Poster 2");
        manager.addPoster("Poster 3");
        manager.addPoster("Poster 4");
        manager.addPoster("Poster 5");

        String[] expected = {"Poster 5", "Poster 4", "Poster 3", "Poster 2", "Poster 1"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);

    }
}
