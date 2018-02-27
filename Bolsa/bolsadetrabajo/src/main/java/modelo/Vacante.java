package modelo;
// Generated Feb 20, 2018 2:08:15 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Vacante generated by hbm2java
 */
public class Vacante  implements java.io.Serializable {


     private int idvacante;
     private Empresa empresa;
     private String descripcion;
     private String actividades;
     private String lugar;
     private double salario;
     private String horario;
     private Set postulars = new HashSet(0);

    public Vacante() {
    }

	
    public Vacante(int idvacante, Empresa empresa, String descripcion, String actividades, String lugar, double salario, String horario) {
        this.idvacante = idvacante;
        this.empresa = empresa;
        this.descripcion = descripcion;
        this.actividades = actividades;
        this.lugar = lugar;
        this.salario = salario;
        this.horario = horario;
    }
    public Vacante(int idvacante, Empresa empresa, String descripcion, String actividades, String lugar, double salario, String horario, Set postulars) {
       this.idvacante = idvacante;
       this.empresa = empresa;
       this.descripcion = descripcion;
       this.actividades = actividades;
       this.lugar = lugar;
       this.salario = salario;
       this.horario = horario;
       this.postulars = postulars;
    }
   
    public int getIdvacante() {
        return this.idvacante;
    }
    
    public void setIdvacante(int idvacante) {
        this.idvacante = idvacante;
    }
    public Empresa getEmpresa() {
        return this.empresa;
    }
    
    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }
    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public String getActividades() {
        return this.actividades;
    }
    
    public void setActividades(String actividades) {
        this.actividades = actividades;
    }
    public String getLugar() {
        return this.lugar;
    }
    
    public void setLugar(String lugar) {
        this.lugar = lugar;
    }
    public double getSalario() {
        return this.salario;
    }
    
    public void setSalario(double salario) {
        this.salario = salario;
    }
    public String getHorario() {
        return this.horario;
    }
    
    public void setHorario(String horario) {
        this.horario = horario;
    }
    public Set getPostulars() {
        return this.postulars;
    }
    
    public void setPostulars(Set postulars) {
        this.postulars = postulars;
    }




}


