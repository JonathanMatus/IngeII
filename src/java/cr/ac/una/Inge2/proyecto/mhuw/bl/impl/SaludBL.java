/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.una.Inge2.proyecto.mhuw.bl.impl;
import cr.ac.una.Inge2.proyecto.mhuw.bl.BaseBL;
import cr.ac.una.Inge2.proyecto.mhuw.bl.IBaseBL;
import cr.ac.una.Inge2.proyecto.mhuw.domain.Salud;
import java.util.List;
/**
 *
 * @author patei
 */
public class SaludBL extends BaseBL implements IBaseBL<Salud, Integer>{
      public SaludBL() {
        super();
    }

    
    
    
    @Override
    public void save(Salud o) {
        this.getDAO(o.getClass().getName()).save(o);
    }

    @Override
    public Salud merge(Salud o) {
        return (Salud) this.getDAO(o.getClass().getName()).merge(o);
    }

    @Override
    public void delete(Salud o) {
        this.getDAO(o.getClass().getName()).delete(o);
    }

    @Override
    public Salud findById(Integer o) {
        return (Salud) this.getDAO(Salud.class.getName()).findById(o);
    }

    @Override
    public List<Salud> findAll(String className) {
        return this.getDAO(className).findAll();

    }
    

    @Override
    public List<Salud> findByQuery(String query) {
        return this.getDAO(Salud.class.getName()).findByQuery(query);
    }

}
