package pl.kurs.lekcja2.service;

import org.junit.Before;
import org.junit.Test;
import pl.kurs.lekcja2.model.Author;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class AuthorServiceTest {

    private AuthorService authorService;
    private Author author1;
    private Author author2;
    private Author author3;
    private Author author4;
    private List<Author> authors;
    private List<Author> olderThan30;

    @Before
    public void init(){
        authorService = new AuthorService();
        author1 = new Author("XXX", "XXXXX", 34);
        author2 = new Author("YYY", "YYYYY", 12);
        author3 = new Author("ZZZ", "ZZZZZ", 23);
        author4 = new Author("OOO", "OOOOO", 31);
        authors = new ArrayList<>(List.of(author1, author2, author3, author4));
        olderThan30 = new ArrayList<>(List.of(author1, author4));

    }


    @Test
    public void shouldReturnAuthor1AsOldestAuthor(){
        Author oldest = authorService.theOldestAuthor(authors);
        assertEquals(author1, oldest);
    }


}