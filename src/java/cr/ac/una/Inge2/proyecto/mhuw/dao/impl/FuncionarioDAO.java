/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.una.Inge2.proyecto.mhuw.dao.impl;
import cr.ac.una.Inge2.proyecto.mhuw.dao.IBaseDAO;
import cr.ac.una.Inge2.proyecto.mhuw.domain.Funcionario;
import cr.ac.una.Inge2.proyecto.mhuw.utils.HibernateUtil;
import java.util.List;
import org.hibernate.HibernateException;
/**
 *
 * @author patei
 */
public class FuncionarioDAO extends HibernateUtil implements IBaseDAO<Funcionario, Integer>{
   public void save(Funcionario o) {

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
    public Funcionario merge(Funcionario o) {
        try {
            iniciaOperacion();
            o = (Funcionario) getSesion().merge(o);
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
    public void delete(Funcionario o) {
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
    public Funcionario findById(Integer id) {
        Funcionario servicios = null;
        try {
            iniciaOperacion();
            servicios = (Funcionario) getSesion().get(Funcionario.class, id);

        } finally {
            getSesion().close();
        }
        return servicios;

    }

    @Override
    public List<Funcionario> findAll() {
        List<Funcionario> listaFuncionario = null;
        try {
            iniciaOperacion();
            listaFuncionario = getSesion().createQuery("from Funcionario").list();
        } finally {
            getSesion().close();
        }
        return listaFuncionario;
    }

    @Override
    public List<Funcionario> findByQuery(String query) {
           List<Funcionario> acesso;
        try{
            iniciaOperacion();
            acesso = (List<Funcionario>) getSesion().createQuery(query).list();
        }catch(HibernateException he){
            manejaExcepcion(he);
            throw he;
        }finally{
            getSesion().close();
        }
        return acesso;
    }  
}
