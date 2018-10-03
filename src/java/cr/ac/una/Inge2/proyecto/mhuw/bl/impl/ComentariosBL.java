/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.una.Inge2.proyecto.mhuw.bl.impl;
import cr.ac.una.Inge2.proyecto.mhuw.bl.BaseBL;
import cr.ac.una.Inge2.proyecto.mhuw.bl.IBaseBL;
import cr.ac.una.Inge2.proyecto.mhuw.domain.Comentarios;
import java.util.List;
/**
 *
 * @author patei
 */
public class ComentariosBL extends BaseBL implements IBaseBL<Comentarios, Integer>{
     public ComentariosBL() {
        super();
    }

    
    
    
    @Override
    public void save(Comentarios o) {
        this.getDAO(o.getClass().getName()).save(o);
    }

    @Override
    public Comentarios merge(Comentarios o) {
        return (Comentarios) this.getDAO(o.getClass().getName()).merge(o);
    }

    @Override
    public void delete(Comentarios o) {
        this.getDAO(o.getClass().getName()).delete(o);
    }

    @Override
    public Comentarios findById(Integer o) {
        return (Comentarios) this.getDAO(Comentarios.class.getName()).findById(o);
    }

    @Override
    public List<Comentarios> findAll(String className) {
        return this.getDAO(className).findAll();

    }
    

    @Override
    public List<Comentarios> findByQuery(String query) {
        return this.getDAO(Comentarios.class.getName()).findByQuery(query);
    }

}
