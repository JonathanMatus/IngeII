/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.una.Inge2.proyecto.mhuw.dao.impl;
import cr.ac.una.Inge2.proyecto.mhuw.dao.IBaseDAO;
import cr.ac.una.Inge2.proyecto.mhuw.domain.Grupo;
import cr.ac.una.Inge2.proyecto.mhuw.utils.HibernateUtil;
import java.util.List;
import org.hibernate.HibernateException;
/**
 *
 * @author patei
 */
public class GrupoDAO extends HibernateUtil implements IBaseDAO<Grupo, Integer>{
    public void save(Grupo o) {

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
    public Grupo merge(Grupo o) {
        try {
            iniciaOperacion();
            o = (Grupo) getSesion().merge(o);
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
    public void delete(Grupo o) {
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
    public Grupo findById(Integer id) {
        Grupo servicios = null;
        try {
            iniciaOperacion();
            servicios = (Grupo) getSesion().get(Grupo.class, id);

        } finally {
            getSesion().close();
        }
        return servicios;

    }

    @Override
    public List<Grupo> findAll() {
        List<Grupo> listaGrupo = null;
        try {
            iniciaOperacion();
            listaGrupo = getSesion().createQuery("from Grupo").list();
        } finally {
            getSesion().close();
        }
        return listaGrupo;
    }

    @Override
    public List<Grupo> findByQuery(String query) {
           List<Grupo> acesso;
        try{
            iniciaOperacion();
            acesso = (List<Grupo>) getSesion().createQuery(query).list();
        }catch(HibernateException he){
            manejaExcepcion(he);
            throw he;
        }finally{
            getSesion().close();
        }
        return acesso;
    } 
}
