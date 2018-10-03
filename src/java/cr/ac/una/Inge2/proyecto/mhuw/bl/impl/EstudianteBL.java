/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.una.Inge2.proyecto.mhuw.bl.impl;

import cr.ac.una.Inge2.proyecto.mhuw.bl.BaseBL;
import cr.ac.una.Inge2.proyecto.mhuw.bl.IBaseBL;
import cr.ac.una.Inge2.proyecto.mhuw.domain.Estudiante;
import java.util.List;

/**
 *
 * @author patei
 */
public class EstudianteBL extends BaseBL implements IBaseBL<Estudiante, Integer> {
        public EstudianteBL() {
        super();
    }

    
    
    
    @Override
    public void save(Estudiante o) {
        this.getDAO(o.getClass().getName()).save(o);
    }

    @Override
    public Estudiante merge(Estudiante o) {
        return (Estudiante) this.getDAO(o.getClass().getName()).merge(o);
    }

    @Override
    public void delete(Estudiante o) {
        this.getDAO(o.getClass().getName()).delete(o);
    }

    @Override
    public Estudiante findById(Integer o) {
        return (Estudiante) this.getDAO(Estudiante.class.getName()).findById(o);
    }

    @Override
    public List<Estudiante> findAll(String className) {
        return this.getDAO(className).findAll();

    }
    

    @Override
    public List<Estudiante> findByQuery(String query) {
        return this.getDAO(Estudiante.class.getName()).findByQuery(query);
    }

}
