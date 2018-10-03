/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.una.Inge2.proyecto.mhuw.dao.impl;
import cr.ac.una.Inge2.proyecto.mhuw.dao.IBaseDAO;
import cr.ac.una.Inge2.proyecto.mhuw.domain.Direccion;
import cr.ac.una.Inge2.proyecto.mhuw.utils.HibernateUtil;
import java.util.List;
import org.hibernate.HibernateException;
/**
 *
 * @author patei
 */
public class DireccionDAO extends HibernateUtil implements IBaseDAO<Direccion, Integer>{
     public void save(Direccion o) {

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
    public Direccion merge(Direccion o) {
        try {
            iniciaOperacion();
            o = (Direccion) getSesion().merge(o);
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
    public void delete(Direccion o) {
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
    public Direccion findById(Integer id) {
        Direccion servicios = null;
        try {
            iniciaOperacion();
            servicios = (Direccion) getSesion().get(Direccion.class, id);

        } finally {
            getSesion().close();
        }
        return servicios;

    }

    @Override
    public List<Direccion> findAll() {
        List<Direccion> listaDireccion = null;
        try {
            iniciaOperacion();
            listaDireccion = getSesion().createQuery("from Direccion").list();
        } finally {
            getSesion().close();
        }
        return listaDireccion;
    }

    @Override
    public List<Direccion> findByQuery(String query) {
           List<Direccion> acesso;
        try{
            iniciaOperacion();
            acesso = (List<Direccion>) getSesion().createQuery(query).list();
        }catch(HibernateException he){
            manejaExcepcion(he);
            throw he;
        }finally{
            getSesion().close();
        }
        return acesso;
    }
}
