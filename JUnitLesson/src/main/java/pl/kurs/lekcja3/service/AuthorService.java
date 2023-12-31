package pl.kurs.lekcja3.service;

import pl.kurs.lekcja3.model.Author;

import java.util.*;

public class AuthorService {

    public Author theOldestAuthor(List<Author> list) {
        return Optional.ofNullable(list)
                .orElse(Collections.emptyList())
                .stream()
                .filter(Objects::nonNull)
                .max(Comparator.comparingInt(Author::getAge))
                .orElseThrow(); // todo dodac wyjatek NoOldestException
    }


}
