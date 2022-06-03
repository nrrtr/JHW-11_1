package ru.netology;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class FilmManager {
    private FilmRepo repository = new FilmRepo();

    public FilmManager(FilmRepo valueOfRepo) {
        this.setRepository(valueOfRepo);
    }

    public void save(Film filmItem) {
        repository.save(filmItem);
    }

    public Film[] findAll() {
        return repository.findAll();
    }

    public Film findById(int valueOfId) {
        return repository.findById(valueOfId);
    }

    public void removeById(int valueOfId) {
        repository.removeById(valueOfId);
    }

    public void removeAll() {
        repository.removeAll();
    }
}