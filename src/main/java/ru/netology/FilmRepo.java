package ru.netology;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class FilmRepo {
    private Film[] films = new Film[0];
    //private int filmLimit = 10;

    public Film[] findAll() {
        return getFilms();
    }

    public void save(Film item) {
        Film[] tmp = new Film[films.length + 1];
        //System.arraycopy(films, 0, tmp, 0, films.length);
        for (int i = 0; i < films.length; i++) {
            tmp[i] = films[i];
        }
        tmp[tmp.length - 1] = item;
        setFilms(tmp);
    }

    public Film findById(int value) {
        Film res = null;

        if (films.length != 0) {
            for (int i = 0; i < films.length; i++) {
                if (films[i].getId() == value) {
                    res = films[i];
                }
            }
        }
        return res;
    }

    public void removeById(int valueOfId) {
        if (films.length != 0) {
            Film[] tmp = new Film[films.length - 1];
            int tmpIndex = 0;
            for (int i = 0; i < films.length; i++) {
                if (films[i].getId() != valueOfId) {
                    tmp[tmpIndex] = films[i];
                    tmpIndex++;
                }
            }
            films = tmp;
        }
    }

    public void removeAll() {
        if (films.length != 0) {
            Film[] tmp = new Film[0];
            films = tmp;
        }
    }
}
