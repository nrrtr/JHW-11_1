package ru.netology;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class FilmManager {
    private Film[] films = new Film[0];
    private int filmLimit = 10;

    public FilmManager(int filmLimit) {
        this.setFilmLimit(filmLimit);
    }

    public void addFilm(Film item) {
        Film[] tmp = new Film[films.length + 1];
        //System.arraycopy(films, 0, tmp, 0, films.length);
        for (int i = 0; i < films.length; i++) {
            tmp[i] = films[i];
        }
        tmp[tmp.length - 1] = item;
        setFilms(tmp);
    }

    public Film[] findAll() {
        return getFilms();
    }

    public Film[] findLast() {
        int arraySize;

        if (films.length >= this.getFilmLimit()) {
            arraySize = this.getFilmLimit();
        } else {
            arraySize = films.length;
        }

        Film[] result = new Film[arraySize];
        for (int i = 0; i < arraySize; i++) {
            result[i] = films[films.length - 1 - i];
        }
        return result;
    }
}
