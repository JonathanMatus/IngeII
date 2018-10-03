/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.una.Inge2.proyecto.mhuw.bl.impl;

import cr.ac.una.Inge2.proyecto.mhuw.bl.BaseBL;
import cr.ac.una.Inge2.proyecto.mhuw.bl.IBaseBL;
import cr.ac.una.Inge2.proyecto.mhuw.domain.Controlchats;
import java.util.List;

/**
 *
 * @author patei
 */
public class ControlchatsBL extends BaseBL implements IBaseBL<Controlchats, Integer> {
        public ControlchatsBL() {
        super();
    }

    
    
    
    @Override
    public void save(Controlchats o) {
        this.getDAO(o.getClass().getName()).save(o);
    }

    @Override
    public Controlchats merge(Controlchats o) {
        return (Controlchats) this.getDAO(o.getClass().getName()).merge(o);
    }

    @Override
    public void delete(Controlchats o) {
        this.getDAO(o.getClass().getName()).delete(o);
    }

    @Override
    public Controlchats findById(Integer o) {
        return (Controlchats) this.getDAO(Controlchats.class.getName()).findById(o);
    }

    @Override
    public List<Controlchats> findAll(String className) {
        return this.getDAO(className).findAll();

    }
    

    @Override
    public List<Controlchats> findByQuery(String query) {
        return this.getDAO(Controlchats.class.getName()).findByQuery(query);
    }

}
