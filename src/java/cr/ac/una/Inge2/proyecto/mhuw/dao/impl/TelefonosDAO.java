/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.una.Inge2.proyecto.mhuw.dao.impl;

import cr.ac.una.Inge2.proyecto.mhuw.dao.IBaseDAO;
import cr.ac.una.Inge2.proyecto.mhuw.domain.Telefonos;
import cr.ac.una.Inge2.proyecto.mhuw.utils.HibernateUtil;
import java.util.List;
import org.hibernate.HibernateException;
/**
 *
 * @author patei
 */
public class TelefonosDAO extends HibernateUtil implements IBaseDAO<Telefonos, Integer>{
     public void save(Telefonos o) {

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
    public Telefonos merge(Telefonos o) {
        try {
            iniciaOperacion();
            o = (Telefonos) getSesion().merge(o);
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
    public void delete(Telefonos o) {
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
    public Telefonos findById(Integer id) {
        Telefonos servicios = null;
        try {
            iniciaOperacion();
            servicios = (Telefonos) getSesion().get(Telefonos.class, id);

        } finally {
            getSesion().close();
        }
        return servicios;

    }

    @Override
    public List<Telefonos> findAll() {
        List<Telefonos> listaTelefonos = null;
        try {
            iniciaOperacion();
            listaTelefonos = getSesion().createQuery("from Telefonos").list();
        } finally {
            getSesion().close();
        }
        return listaTelefonos;
    }

    @Override
    public List<Telefonos> findByQuery(String query) {
           List<Telefonos> acesso;
        try{
            iniciaOperacion();
            acesso = (List<Telefonos>) getSesion().createQuery(query).list();
        }catch(HibernateException he){
            manejaExcepcion(he);
            throw he;
        }finally{
            getSesion().close();
        }
        return acesso;
    }
}
