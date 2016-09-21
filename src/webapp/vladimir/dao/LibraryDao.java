package webapp.vladimir.dao;

import java.util.List;
import webapp.vladimir.model.LibraryModel;

public interface LibraryDao {

    public void AddBooks(LibraryModel librarymodel);
    public void UpdateBooks(LibraryModel librarymodel);
    public void DeleteBook(int id);
    public List<LibraryModel> GetLibrary();
   }