package ru.netology;

public class PosterManager {
    private String[] posters = new String[0];
    private int limit;

    public PosterManager() {
        this.limit = 10;
    }
    public PosterManager(int limit) {

        this.limit = limit;
    }

    // добавление нового постера
    public void addPoster(String poster) {
        String[] tmp = new String[posters.length + 1];
        for (int i = 0; i < posters.length; i++) {
            tmp[i] = posters[i];
        }
        tmp[tmp.length - 1] = poster;
        posters = tmp;
    }


    // Возвращает все фильмы (поиск)
    public String[] findAll() {

        return posters;
    }

    // Получение фильмов (поиск)
    public String[] findLast() {

        int resultLenght;                          // Условная переменная кол-ва фильмов
        if (posters.length < 10) {
            resultLenght = posters.length;
        } else {
            resultLenght = 10;
        }

        String[] tmp = new String[resultLenght];
        for (int i = 0; i < tmp.length; i++) {
            tmp[i] = posters[posters.length - 1 - i];
        }
        return tmp;
    }
}
