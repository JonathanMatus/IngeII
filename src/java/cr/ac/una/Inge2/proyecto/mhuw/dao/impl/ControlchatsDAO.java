/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.una.Inge2.proyecto.mhuw.dao.impl;

import cr.ac.una.Inge2.proyecto.mhuw.dao.IBaseDAO;
import cr.ac.una.Inge2.proyecto.mhuw.domain.Controlchats;
import cr.ac.una.Inge2.proyecto.mhuw.domain.Controlchats;
import cr.ac.una.Inge2.proyecto.mhuw.utils.HibernateUtil;
import java.util.List;
import org.hibernate.HibernateException;

/**
 *
 * @author patei
 */
public class ControlchatsDAO extends HibernateUtil implements IBaseDAO<Controlchats, Integer>{
    public void save(Controlchats o) {

        try {
            iniciaOperacion();
            getSesion().save(o);
            getTransac().commit();
        } catch (HibernateException he) {
            manejaExcepcion(he);
            throw he;
        } finally {
            getSesion().close();
        }
    }

    @Override
    public Controlchats merge(Controlchats o) {
        try {
            iniciaOperacion();
            o = (Controlchats) getSesion().merge(o);
            getTransac().commit();
        } catch(HibernateException he)  {
            manejaExcepcion(he);
            throw he;
        } finally {
            getSesion().close();
        }
        return o;
    }

    @Override
    public void delete(Controlchats o) {
       try {
            iniciaOperacion();
            getSesion().delete(o);
            getTransac().commit();
        } catch(HibernateException he)  {
            manejaExcepcion(he);
            throw he;
        } finally {
            getSesion().close();
        }
       
    }

    @Override
    public Controlchats findById(Integer id) {
        Controlchats servicios = null;
        try {
            iniciaOperacion();
            servicios = (Controlchats) getSesion().get(Controlchats.class, id);

        } finally {
            getSesion().close();
        }
        return servicios;

    }

    @Override
    public List<Controlchats> findAll() {
        List<Controlchats> listaControlchats = null;
        try {
            iniciaOperacion();
            listaControlchats = getSesion().createQuery("from Controlchats").list();
        } finally {
            getSesion().close();
        }
        return listaControlchats;
    }

    @Override
    public List<Controlchats> findByQuery(String query) {
           List<Controlchats> acesso;
        try{
            iniciaOperacion();
            acesso = (List<Controlchats>) getSesion().createQuery(query).list();
        }catch(HibernateException he){
            manejaExcepcion(he);
            throw he;
        }finally{
            getSesion().close();
        }
        return acesso;
    }
}
