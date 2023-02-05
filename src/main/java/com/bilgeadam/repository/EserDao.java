package com.bilgeadam.repository;

import com.bilgeadam.entity.Eser;

import com.bilgeadam.util.HibernateUtil;
import org.hibernate.Session;

import java.util.List;

public class EserDao {
    Session session = HibernateUtil.getSessionFactory().openSession();

    public void save(Eser eser){
        try{

            session.beginTransaction();
            session.save(eser);
            session.getTransaction().commit();
            session.close();

        }catch(Exception e){
            System.out.println(e.getMessage());
            e.printStackTrace();
            e.getCause();
        }
    }

    public List<Eser> getAll() {
        List<Eser> list = null;

        try {
            session.beginTransaction();
            list = session.createQuery("select eser from Eser eser").list();
            session.getTransaction().commit();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        return list;
    }
}
