package cr.ac.una.Inge2.proyecto.mhuw.domain;
// Generated 01-oct-2018 22:04:13 by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * Comentarios generated by hbm2java
 */
public class Comentarios  implements java.io.Serializable {


     private Integer idComentarios;
     private Estudiante estudiante;
     private Usuario usuario;
     private String descripcion;
     private Integer ultimoUsuario;
     private Date fechaModificacion;

    public Comentarios() {
    }

	
    public Comentarios(Estudiante estudiante, Usuario usuario, String descripcion) {
        this.estudiante = estudiante;
        this.usuario = usuario;
        this.descripcion = descripcion;
    }
    public Comentarios(Estudiante estudiante, Usuario usuario, String descripcion, Integer ultimoUsuario, Date fechaModificacion) {
       this.estudiante = estudiante;
       this.usuario = usuario;
       this.descripcion = descripcion;
       this.ultimoUsuario = ultimoUsuario;
       this.fechaModificacion = fechaModificacion;
    }
   
    public Integer getIdComentarios() {
        return this.idComentarios;
    }
    
    public void setIdComentarios(Integer idComentarios) {
        this.idComentarios = idComentarios;
    }
    public Estudiante getEstudiante() {
        return this.estudiante;
    }
    
    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }
    public Usuario getUsuario() {
        return this.usuario;
    }
    
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public Integer getUltimoUsuario() {
        return this.ultimoUsuario;
    }
    
    public void setUltimoUsuario(Integer ultimoUsuario) {
        this.ultimoUsuario = ultimoUsuario;
    }
    public Date getFechaModificacion() {
        return this.fechaModificacion;
    }
    
    public void setFechaModificacion(Date fechaModificacion) {
        this.fechaModificacion = fechaModificacion;
    }




}


