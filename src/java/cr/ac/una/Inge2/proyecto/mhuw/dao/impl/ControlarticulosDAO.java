/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.una.Inge2.proyecto.mhuw.dao.impl;

import cr.ac.una.Inge2.proyecto.mhuw.dao.IBaseDAO;
import cr.ac.una.Inge2.proyecto.mhuw.domain.Controlarticulos;
import cr.ac.una.Inge2.proyecto.mhuw.domain.Controlarticulos;
import cr.ac.una.Inge2.proyecto.mhuw.utils.HibernateUtil;
import java.util.List;
import org.hibernate.HibernateException;

/**
 *
 * @author patei
 */
public class ControlarticulosDAO extends HibernateUtil implements IBaseDAO<Controlarticulos, Integer>{
    public void save(Controlarticulos o) {

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
    public Controlarticulos merge(Controlarticulos o) {
        try {
            iniciaOperacion();
            o = (Controlarticulos) getSesion().merge(o);
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
    public void delete(Controlarticulos o) {
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
    public Controlarticulos findById(Integer id) {
        Controlarticulos servicios = null;
        try {
            iniciaOperacion();
            servicios = (Controlarticulos) getSesion().get(Controlarticulos.class, id);

        } finally {
            getSesion().close();
        }
        return servicios;

    }

    @Override
    public List<Controlarticulos> findAll() {
        List<Controlarticulos> listaControlarticulos = null;
        try {
            iniciaOperacion();
            listaControlarticulos = getSesion().createQuery("from Controlarticulos").list();
        } finally {
            getSesion().close();
        }
        return listaControlarticulos;
    }

    @Override
    public List<Controlarticulos> findByQuery(String query) {
           List<Controlarticulos> acesso;
        try{
            iniciaOperacion();
            acesso = (List<Controlarticulos>) getSesion().createQuery(query);
        }catch(HibernateException he){
            manejaExcepcion(he);
            throw he;
        }finally{
            getSesion().close();
        }
        return acesso;
    }
}
