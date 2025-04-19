package model.utils;
import java.time.Year;

import model.entities.Book;
import model.exceptions.EntityException;
import model.exceptions.NamesOfEntitiesExceptions;

public class BookListUtil implements EntityListUtil<Book> {
    @Override
    public void isEntityCorrect(Book book) throws EntityException {
        if (book.getID() < 0) 
            throw new EntityException(NamesOfEntitiesExceptions.ID_EXCEPTION.getName());
        
        for (int i = 0; i < book.getAuthor().length(); ++i) {
            if (Character.isDigit(book.getAuthor().charAt(i)))
                throw new EntityException(NamesOfEntitiesExceptions.NAME_EXCEPTION.getName());
        }

        // TODO: возможно добавить проверку на наличие цифр в книге

        if (book.getWritingYear() < 0 || book.getWritingYear() > Year.now().getValue())
            throw new EntityException(NamesOfEntitiesExceptions.YEAR_EXCEPTION.getName());

        if (book.getQuanitity() < 0)
            throw new EntityException(NamesOfEntitiesExceptions.QUANTITY_EXCEPTION.getName());
    }

    @Override
    public boolean updateEntity(Book book) throws EntityException {
        isEntityCorrect(book);
        // id должен существовать в BookList
        return true;
    }
}