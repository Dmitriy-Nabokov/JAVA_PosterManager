package ru.netology;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.PosterManager;

public class PosterTest {

    @Test
    public void ShouldFindPostersDefaultQuantity() {             // Найти фильмы со стандартным лимитом
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
    public void ShouldFindPostersVariableQuantity() {            // Найти фильмы с установленным лимитом
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
    public void ShouldFindLastDefaultQuantity() {                // Найти последние фильмы со стандартным лимитом
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

    @Test
    public void ShouldFindLastVariableQuantity() {                  // Найти последние фильмы с установленным лимитом, равным кол-ву фильмов
        PosterManager manager = new PosterManager(5);

        manager.addPoster("Poster 1");
        manager.addPoster("Poster 2");
        manager.addPoster("Poster 3");
        manager.addPoster("Poster 4");
        manager.addPoster("Poster 5");

        String[] expected = {"Poster 5", "Poster 4", "Poster 3", "Poster 2", "Poster 1"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void ShouldFindLastAboveQuantity() {                  // Найти последние фильмы с лимитом, выше кол-ва фильмов
        PosterManager manager = new PosterManager(7);

        manager.addPoster("Poster 1");
        manager.addPoster("Poster 2");
        manager.addPoster("Poster 3");
        manager.addPoster("Poster 4");
        manager.addPoster("Poster 5");

        String[] expected = {"Poster 5", "Poster 4", "Poster 3", "Poster 2", "Poster 1"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);

    }
        @Test
        public void ShouldFindLastBelowQuantity() {              // Найти последние фильмы с лимитом, ниже кол-ва фильмов
            PosterManager manager = new PosterManager(4);

            manager.addPoster("Poster 1");
            manager.addPoster("Poster 2");
            manager.addPoster("Poster 3");
            manager.addPoster("Poster 4");
            manager.addPoster("Poster 5");

            String[] expected = {"Poster 5", "Poster 4", "Poster 3", "Poster 2"};
            String[] actual = manager.findLast();

            Assertions.assertArrayEquals(expected, actual);

    }
}
