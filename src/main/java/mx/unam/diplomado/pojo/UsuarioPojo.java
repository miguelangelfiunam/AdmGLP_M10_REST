package mx.unam.diplomado.pojo;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import java.util.Date;

/**
 * Clase Usuario
 *
 * @author Miguel Angel Martinez Rivera
 * @version 1.0.1
 * @since 07/10/2021 - 20/11/2021
 *
 */
@XmlRootElement(name = "usuario")
@XmlAccessorType(XmlAccessType.FIELD)
public class UsuarioPojo {

    @XmlElement(required = true)
    private Integer idusuario; // Identificador de usuario
    
    @XmlElement(required = true)
    private String apodo; // Seudonimo del usuario en la aplicacion
    
    @XmlElement(required = true)
    private String correo1; // Correo electronico
    
    @XmlElement(required = true)
    private String correo2; // Correo electronico
    
    @XmlElement(required = true)
    private String nombre; // Nombre de la persona 100
    
    @XmlElement(required = true)
    private String apellido1; // Primer apellido 100
    
    @XmlElement(required = true)
    private String apellido2; // Segundo apellido 100
    
    @XmlElement(required = true)
    private Integer edad;// Edad de la persona
    
    @XmlElement(required = true)
    private Date fnac; // Fecha de nacimiento
    
    @XmlElement(required = true)
    private String telefono1; // Telefono del usuario
    
    @XmlElement(required = true)
    private String telefono2; // Segundo telefono de contacto
    
    @XmlElement(required = true)
    private Date fecreg; // Fecha de Inicio de acceso a la aplicacion
    
    @XmlElement(required = true)
    private Date fecact; // Fecha de fin de acceso a la aplicacion
    
    @XmlElement(required = true)
    private Integer estatus; // Estado del usuario

    public UsuarioPojo() {
    }

    public UsuarioPojo(Integer idusuario, String apodo, String correo1, String correo2, String nombre, String apellido1, String apellido2, Integer edad, Date fnac, String telefono1, String telefono2, Date fecreg, Date fecact, Integer estatus) {
        this.idusuario = idusuario;
        this.apodo = apodo;
        this.correo1 = correo1;
        this.correo2 = correo2;
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.edad = edad;
        this.fnac = fnac;
        this.telefono1 = telefono1;
        this.telefono2 = telefono2;
        this.fecreg = fecreg;
        this.fecact = fecact;
        this.estatus = estatus;
    }

    public Integer getIdusuario() {
        return idusuario;
    }

    public String getApodo() {
        return apodo;
    }

    public String getCorreo1() {
        return correo1;
    }

    public String getCorreo2() {
        return correo2;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public Integer getEdad() {
        return edad;
    }

    public Date getFnac() {
        return fnac;
    }

    public String getTelefono1() {
        return telefono1;
    }

    public String getTelefono2() {
        return telefono2;
    }

    public Date getFecreg() {
        return fecreg;
    }

    public Date getFecact() {
        return fecact;
    }

    public Integer getEstatus() {
        return estatus;
    }

    public void setIdusuario(Integer idusuario) {
        this.idusuario = idusuario;
    }

    public void setApodo(String apodo) {
        this.apodo = apodo;
    }

    public void setCorreo1(String correo1) {
        this.correo1 = correo1;
    }

    public void setCorreo2(String correo2) {
        this.correo2 = correo2;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public void setFnac(Date fnac) {
        this.fnac = fnac;
    }

    public void setTelefono1(String telefono1) {
        this.telefono1 = telefono1;
    }

    public void setTelefono2(String telefono2) {
        this.telefono2 = telefono2;
    }

    public void setFecreg(Date fecreg) {
        this.fecreg = fecreg;
    }

    public void setFecact(Date fecact) {
        this.fecact = fecact;
    }

    public void setEstatus(Integer estatus) {
        this.estatus = estatus;
    }

}
