/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package libreria.dao;

import org.hibernate.Session;

/**
 *
 * @author edisoncor
 */
public class DAOMain {
    
     public void guardar(Object object){
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        session.save(object);
        session.getTransaction().commit();
    }
    
     public void guardarOActualizar(Object object){
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        session.saveOrUpdate(object);
        session.getTransaction().commit();
    }
     
      public void eliminar(Object object){
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        session.delete(object);
        session.getTransaction().commit();
    }
    
     
}
