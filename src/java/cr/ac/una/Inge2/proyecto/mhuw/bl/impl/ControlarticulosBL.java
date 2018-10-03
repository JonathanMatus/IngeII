/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.una.Inge2.proyecto.mhuw.bl.impl;

import cr.ac.una.Inge2.proyecto.mhuw.bl.BaseBL;
import cr.ac.una.Inge2.proyecto.mhuw.bl.IBaseBL;
import cr.ac.una.Inge2.proyecto.mhuw.domain.Controlarticulos;
import java.util.List;

/**
 *
 * @author patei
 */
public class ControlarticulosBL extends BaseBL implements IBaseBL<Controlarticulos, Integer> {
        public ControlarticulosBL() {
        super();
    }

    
    
    
    @Override
    public void save(Controlarticulos o) {
        this.getDAO(o.getClass().getName()).save(o);
    }

    @Override
    public Controlarticulos merge(Controlarticulos o) {
        return (Controlarticulos) this.getDAO(o.getClass().getName()).merge(o);
    }

    @Override
    public void delete(Controlarticulos o) {
        this.getDAO(o.getClass().getName()).delete(o);
    }

    @Override
    public Controlarticulos findById(Integer o) {
        return (Controlarticulos) this.getDAO(Controlarticulos.class.getName()).findById(o);
    }

    @Override
    public List<Controlarticulos> findAll(String className) {
        return this.getDAO(className).findAll();

    }
    

    @Override
    public List<Controlarticulos> findByQuery(String query) {
        return this.getDAO(Controlarticulos.class.getName()).findByQuery(query);
    }

}
