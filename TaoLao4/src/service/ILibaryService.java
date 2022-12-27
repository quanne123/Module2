package service;

import model.Book;
import model.Libary;
import model.Magazine;
import model.Newspaper;

import java.util.Map;

public interface ILibaryService {
   void addBook(Book book);

   void addMagazine(Magazine magazine);

   void addNewspaper(Newspaper newspaper);

   void deleteLibary(int id);

   Map<Libary,Integer> getLibary();


   }

