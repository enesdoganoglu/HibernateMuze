package com.bilgeadam.repository;

import com.bilgeadam.entity.Sanatci;
import com.bilgeadam.util.HibernateUtil;
import org.hibernate.Session;

import java.util.List;

public class SanatcıDao {

    Session session = HibernateUtil.getSessionFactory().openSession();

    public void save(Sanatci sanatci){
        try{

            session.beginTransaction();
            session.save(sanatci);
            session.getTransaction().commit();
            session.close();

        }catch(Exception e){
            System.out.println(e.getMessage());
            e.printStackTrace();
            e.getCause();
        }
    }

    public List<Sanatci> getAll() {
        List<Sanatci> list = null;

        try {
            session.beginTransaction();
            list = session.createQuery("select sanatci from Sanatci sanatci").list();
            session.getTransaction().commit();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        return list;
    }
}
