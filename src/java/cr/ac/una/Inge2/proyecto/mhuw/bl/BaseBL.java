/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.una.Inge2.proyecto.mhuw.bl;

import cr.ac.una.Inge2.proyecto.mhuw.dao.impl.EstudianteDAO;
import cr.ac.una.Inge2.proyecto.mhuw.dao.impl.ControlarticulosDAO;
import cr.ac.una.Inge2.proyecto.mhuw.dao.impl.UsuarioDAO;
import cr.ac.una.Inge2.proyecto.mhuw.dao.IBaseDAO;
import cr.ac.una.Inge2.proyecto.mhuw.dao.impl.ControlchatsDAO;
import cr.ac.una.Inge2.proyecto.mhuw.dao.impl.DireccionDAO;
import cr.ac.una.Inge2.proyecto.mhuw.dao.impl.FuncionarioDAO;
import cr.ac.una.Inge2.proyecto.mhuw.dao.impl.GrupoDAO;
import cr.ac.una.Inge2.proyecto.mhuw.dao.impl.SaludDAO;
import cr.ac.una.Inge2.proyecto.mhuw.dao.impl.TelefonosDAO;
import java.util.LinkedHashMap;

/**
 *
 * @author patei
 */
public class BaseBL {

    private final LinkedHashMap<String, IBaseDAO> daos;

    public BaseBL() {
        daos = new LinkedHashMap();
        daos.put("cr.ac.una.Inge2.proyecto.mhuw.domain.Estudiante", new EstudianteDAO());
        daos.put("cr.ac.una.Inge2.proyecto.mhuw.domain.Controlarticulos", new ControlarticulosDAO());
        daos.put("cr.ac.una.Inge2.proyecto.mhuw.domain.Usuario", new UsuarioDAO());
        daos.put("cr.ac.una.Inge2.proyecto.mhuw.domain.Controlchats", new ControlchatsDAO());
        daos.put("cr.ac.una.Inge2.proyecto.mhuw.domain.Funcionario", new FuncionarioDAO());
        daos.put("cr.ac.una.Inge2.proyecto.mhuw.domain.Direccion", new DireccionDAO());
        daos.put("cr.ac.una.Inge2.proyecto.mhuw.domain.Grupo", new GrupoDAO());
        daos.put("cr.ac.una.Inge2.proyecto.mhuw.domain.Telefonos", new TelefonosDAO());
        daos.put("cr.ac.una.Inge2.proyecto.mhuw.domain.Salud", new SaludDAO());
    }

    public IBaseDAO getDAO(String className) {
        return daos.get(className);
    }
}
