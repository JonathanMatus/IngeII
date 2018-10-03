/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.una.Inge2.proyecto.mhuw.bl.impl;
import cr.ac.una.Inge2.proyecto.mhuw.bl.BaseBL;
import cr.ac.una.Inge2.proyecto.mhuw.bl.IBaseBL;
import cr.ac.una.Inge2.proyecto.mhuw.domain.Funcionario;
import java.util.List;
/**
 *
 * @author patei
 */
public class FuncionarioBL extends BaseBL implements IBaseBL<Funcionario, Integer>{
      public FuncionarioBL() {
        super();
    }

    
    
    
    @Override
    public void save(Funcionario o) {
        this.getDAO(o.getClass().getName()).save(o);
    }

    @Override
    public Funcionario merge(Funcionario o) {
        return (Funcionario) this.getDAO(o.getClass().getName()).merge(o);
    }

    @Override
    public void delete(Funcionario o) {
        this.getDAO(o.getClass().getName()).delete(o);
    }

    @Override
    public Funcionario findById(Integer o) {
        return (Funcionario) this.getDAO(Funcionario.class.getName()).findById(o);
    }

    @Override
    public List<Funcionario> findAll(String className) {
        return this.getDAO(className).findAll();

    }
    

    @Override
    public List<Funcionario> findByQuery(String query) {
        return this.getDAO(Funcionario.class.getName()).findByQuery(query);
    }
}
