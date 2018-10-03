/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.una.Inge2.proyecto.mhuw.bl.impl;

import cr.ac.una.Inge2.proyecto.mhuw.bl.BaseBL;
import cr.ac.una.Inge2.proyecto.mhuw.bl.IBaseBL;
import cr.ac.una.Inge2.proyecto.mhuw.domain.Telefonos;
import java.util.List;
/**
 *
 * @author patei
 */
public class TelefonosBL extends BaseBL implements IBaseBL<Telefonos, Integer>{
        public TelefonosBL() {
        super();
    }

    
    
    
    @Override
    public void save(Telefonos o) {
        this.getDAO(o.getClass().getName()).save(o);
    }

    @Override
    public Telefonos merge(Telefonos o) {
        return (Telefonos) this.getDAO(o.getClass().getName()).merge(o);
    }

    @Override
    public void delete(Telefonos o) {
        this.getDAO(o.getClass().getName()).delete(o);
    }

    @Override
    public Telefonos findById(Integer o) {
        return (Telefonos) this.getDAO(Telefonos.class.getName()).findById(o);
    }

    @Override
    public List<Telefonos> findAll(String className) {
        return this.getDAO(className).findAll();

    }
    

    @Override
    public List<Telefonos> findByQuery(String query) {
        return this.getDAO(Telefonos.class.getName()).findByQuery(query);
    }

}
