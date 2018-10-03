/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.una.Inge2.proyecto.mhuw.dao.impl;
import cr.ac.una.Inge2.proyecto.mhuw.dao.IBaseDAO;
import cr.ac.una.Inge2.proyecto.mhuw.domain.Comentarios;
import cr.ac.una.Inge2.proyecto.mhuw.utils.HibernateUtil;
import java.util.List;
import org.hibernate.HibernateException;
/**
 *
 * @author patei
 */
public class ComentariosDAO extends HibernateUtil implements IBaseDAO<Comentarios, Integer>{
     public void save(Comentarios o) {

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
    public Comentarios merge(Comentarios o) {
        try {
            iniciaOperacion();
            o = (Comentarios) getSesion().merge(o);
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
    public void delete(Comentarios o) {
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
    public Comentarios findById(Integer id) {
        Comentarios servicios = null;
        try {
            iniciaOperacion();
            servicios = (Comentarios) getSesion().get(Comentarios.class, id);

        } finally {
            getSesion().close();
        }
        return servicios;

    }

    @Override
    public List<Comentarios> findAll() {
        List<Comentarios> listaComentarios = null;
        try {
            iniciaOperacion();
            listaComentarios = getSesion().createQuery("from Comentarios").list();
        } finally {
            getSesion().close();
        }
        return listaComentarios;
    }

    @Override
    public List<Comentarios> findByQuery(String query) {
           List<Comentarios> acesso;
        try{
            iniciaOperacion();
            acesso = (List<Comentarios>) getSesion().createQuery(query).list();
        }catch(HibernateException he){
            manejaExcepcion(he);
            throw he;
        }finally{
            getSesion().close();
        }
        return acesso;
    }
}
