/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.una.Inge2.proyecto.mhuw.bl.impl;
import cr.ac.una.Inge2.proyecto.mhuw.bl.BaseBL;
import cr.ac.una.Inge2.proyecto.mhuw.bl.IBaseBL;
import cr.ac.una.Inge2.proyecto.mhuw.domain.Grupo;
import java.util.List;
/**
 *
 * @author patei
 */
public class GrupoBL extends BaseBL implements IBaseBL<Grupo, Integer>{
       public GrupoBL() {
        super();
    }

    
    
    
    @Override
    public void save(Grupo o) {
        this.getDAO(o.getClass().getName()).save(o);
    }

    @Override
    public Grupo merge(Grupo o) {
        return (Grupo) this.getDAO(o.getClass().getName()).merge(o);
    }

    @Override
    public void delete(Grupo o) {
        this.getDAO(o.getClass().getName()).delete(o);
    }

    @Override
    public Grupo findById(Integer o) {
        return (Grupo) this.getDAO(Grupo.class.getName()).findById(o);
    }

    @Override
    public List<Grupo> findAll(String className) {
        return this.getDAO(className).findAll();

    }
    

    @Override
    public List<Grupo> findByQuery(String query) {
        return this.getDAO(Grupo.class.getName()).findByQuery(query);
    }

}
