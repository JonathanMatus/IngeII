/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.una.Inge2.proyecto.mhuw.dao.impl;

import cr.ac.una.Inge2.proyecto.mhuw.dao.IBaseDAO;
import cr.ac.una.Inge2.proyecto.mhuw.domain.Estudiante;
import cr.ac.una.Inge2.proyecto.mhuw.utils.HibernateUtil;
import java.util.List;
import org.hibernate.HibernateException;

/**
 *
 * @author patei
 */
public class EstudianteDAO extends HibernateUtil implements IBaseDAO<Estudiante, Integer>{
    public void save(Estudiante o) {

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
    public Estudiante merge(Estudiante o) {
        try {
            iniciaOperacion();
            o = (Estudiante) getSesion().merge(o);
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
    public void delete(Estudiante o) {
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
    public Estudiante findById(Integer id) {
        Estudiante servicios = null;
        try {
            iniciaOperacion();
            servicios = (Estudiante) getSesion().get(Estudiante.class, id);

        } finally {
            getSesion().close();
        }
        return servicios;

    }

    @Override
    public List<Estudiante> findAll() {
        List<Estudiante> listaEstudiante = null;
        try {
            iniciaOperacion();
            listaEstudiante = getSesion().createQuery("from Estudiante").list();
        } finally {
            getSesion().close();
        }
        return listaEstudiante;
    }

    @Override
    public List<Estudiante> findByQuery(String query) {
           List<Estudiante> acesso;
        try{
            iniciaOperacion();
            acesso = (List<Estudiante>) getSesion().createQuery(query).list();
        }catch(HibernateException he){
            manejaExcepcion(he);
            throw he;
        }finally{
            getSesion().close();
        }
        return acesso;
    }
}
