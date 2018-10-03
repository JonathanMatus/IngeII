/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.una.Inge2.proyecto.mhuw.bl.impl;
import cr.ac.una.Inge2.proyecto.mhuw.bl.BaseBL;
import cr.ac.una.Inge2.proyecto.mhuw.bl.IBaseBL;
import cr.ac.una.Inge2.proyecto.mhuw.domain.Direccion;
import java.util.List;
/**
 *
 * @author patei
 */
public class DireccionBL extends BaseBL implements IBaseBL<Direccion, Integer>{
        public DireccionBL() {
        super();
    }

    
    
    
    @Override
    public void save(Direccion o) {
        this.getDAO(o.getClass().getName()).save(o);
    }

    @Override
    public Direccion merge(Direccion o) {
        return (Direccion) this.getDAO(o.getClass().getName()).merge(o);
    }

    @Override
    public void delete(Direccion o) {
        this.getDAO(o.getClass().getName()).delete(o);
    }

    @Override
    public Direccion findById(Integer o) {
        return (Direccion) this.getDAO(Direccion.class.getName()).findById(o);
    }

    @Override
    public List<Direccion> findAll(String className) {
        return this.getDAO(className).findAll();

    }
    

    @Override
    public List<Direccion> findByQuery(String query) {
        return this.getDAO(Direccion.class.getName()).findByQuery(query);
    }
}
