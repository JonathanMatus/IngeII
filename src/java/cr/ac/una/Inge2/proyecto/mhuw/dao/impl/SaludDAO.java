/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.una.Inge2.proyecto.mhuw.dao.impl;
import cr.ac.una.Inge2.proyecto.mhuw.dao.IBaseDAO;
import cr.ac.una.Inge2.proyecto.mhuw.domain.Salud;
import cr.ac.una.Inge2.proyecto.mhuw.utils.HibernateUtil;
import java.util.List;
import org.hibernate.HibernateException;
/**
 *
 * @author patei
 */
public class SaludDAO extends HibernateUtil implements IBaseDAO<Salud, Integer>{
  public void save(Salud o) {

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
    public Salud merge(Salud o) {
        try {
            iniciaOperacion();
            o = (Salud) getSesion().merge(o);
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
    public void delete(Salud o) {
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
    public Salud findById(Integer id) {
        Salud servicios = null;
        try {
            iniciaOperacion();
            servicios = (Salud) getSesion().get(Salud.class, id);

        } finally {
            getSesion().close();
        }
        return servicios;

    }

    @Override
    public List<Salud> findAll() {
        List<Salud> listaSalud = null;
        try {
            iniciaOperacion();
            listaSalud = getSesion().createQuery("from Salud").list();
        } finally {
            getSesion().close();
        }
        return listaSalud;
    }

    @Override
    public List<Salud> findByQuery(String query) {
           List<Salud> acesso;
        try{
            iniciaOperacion();
            acesso = (List<Salud>) getSesion().createQuery(query).list();
        }catch(HibernateException he){
            manejaExcepcion(he);
            throw he;
        }finally{
            getSesion().close();
        }
        return acesso;
    }   
}
