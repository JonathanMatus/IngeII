/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.una.Inge2.proyecto.mhuw.test;

import cr.ac.una.Inge2.proyecto.mhuw.bl.impl.UsuarioBL;
import cr.ac.una.Inge2.proyecto.mhuw.domain.Usuario;
import java.util.List;

/**
 *
 * @author patei
 */
public class testUsuario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        UsuarioBL ubl = new UsuarioBL();
        List<Usuario> list = ubl.findByQuery("FROM Usuario where UK_EMAIL='pateixo@gmail.com'");
        System.out.print(list.size());
    }

}
