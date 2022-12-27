package service.Impl;

import model.Book;
import model.Libary;
import model.Magazine;
import model.Newspaper;
import service.ILibaryService;

import java.util.HashMap;
import java.util.Map;

public class LibaryServiceImpl implements ILibaryService {
    private final Map<Book,Integer> bookListMap = new HashMap<>();
    private final Map<Magazine,Integer> magazineListMap = new HashMap<>();

    @Override
    public void addBook(Book book) {


    }

    @Override
    public void addMagazine(Magazine magazine) {

    }

    @Override
    public void addNewspaper(Newspaper newspaper) {

    }

    @Override
    public void deleteLibary(int id) {

    }


    @Override
    public Map<Libary, Integer> getLibary() {
        return null;
    }
}
