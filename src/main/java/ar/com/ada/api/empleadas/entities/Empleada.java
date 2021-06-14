package ar.com.ada.api.empleadas.entities;

import java.math.BigDecimal;
import java.sql.Date;

public class Empleada {

    private Integer empleadaId;
    private String nombre;
    private Integer edad;
    private Categoria categoria;
    private BigDecimal sueldo;
    private int estado;
    private Date fechaAlta;
    private Date fechaBaja;

    
     public Integer getEmpleadaId() {
        return empleadaId;
    }

    public void setEmpleadaId(Integer empleadaId) {
        this.empleadaId = empleadaId;
    }


    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public Integer getEdad() {
        return edad;
    }


    public void setEdad(Integer edad) {
        this.edad = edad;
    }


    public Categoria getCategoria() {
        return categoria;
    }


    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }


    public BigDecimal getSueldo() {
        return sueldo;
    }


    public void setSueldo(BigDecimal sueldo) {
        this.sueldo = sueldo;
    }


    public EstadoEmpleadaEnum getEstado(){

        return EstadoEmpleadaEnum.parse(this.estado);
    }

    public void setEstado(EstadoEmpleadaEnum estado) {
        this.estado = estado.getValue();
    }


    public Date getFechaAlta() {
        return fechaAlta;
    }


    public void setFechaAlta(Date fechaAlta) {
        this.fechaAlta = fechaAlta;
    }


    public Date getFechaBaja() {
        return fechaBaja;
    }


    public void setFechaBaja(Date fechaBaja) {
        this.fechaBaja = fechaBaja;
    }




    public enum EstadoEmpleadaEnum{

        ACTIVO(1),
        INACTIVO(2);
        

        private final int value;

        private EstadoEmpleadaEnum(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }

        public static EstadoEmpleadaEnum parse(int id) {
            EstadoEmpleadaEnum status = null; // Default
            for (EstadoEmpleadaEnum item : EstadoEmpleadaEnum.values()) {
                if (item.getValue() == id) {
                    status = item;
                    break;
                }
            }
            return status;
        }
    

    }



    
}
