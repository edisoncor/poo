/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package libreria.dao;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.query.Query;

/**
 *
 * @author edisoncor
 */
public class DAOPadre extends DAOMain{
    
    public List getList(){
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        if (session.getTransaction().isActive()){
            session.getTransaction().commit();
        }
        session.beginTransaction();
//        HQL
        Query query = session.createQuery("from Padre");
        return query.list();      
    }
    
}
