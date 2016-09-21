package webapp.vladimir.dao;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import webapp.vladimir.model.LibraryModel;

@Repository
public class LibraryDaoImpl implements LibraryDao {

    
    @Autowired
    private SessionFactory sessionFactory;
    
	@SuppressWarnings("unused")
	private Session getCurrentSession() 
    {
        return sessionFactory.getCurrentSession();
    }
    
    @Override
    public void AddBooks(LibraryModel librarymodel) {
        sessionFactory.getCurrentSession().save(librarymodel);
    }
    
    @Override
    public void UpdateBooks(LibraryModel librarymodel) {
        sessionFactory.getCurrentSession().update(librarymodel);
        
    }
    
    @Override
    public void DeleteBook(int id) {
        
        LibraryModel model=new LibraryModel();
        model.setId(id);
        sessionFactory.getCurrentSession().delete(model);
    }
    
    @Override
    public List<LibraryModel> GetLibrary() 
    {
        @SuppressWarnings("unchecked")
        List<LibraryModel> lib = (List<LibraryModel>) sessionFactory.getCurrentSession().createCriteria(LibraryModel.class).list();
        return lib;
    }

    }
