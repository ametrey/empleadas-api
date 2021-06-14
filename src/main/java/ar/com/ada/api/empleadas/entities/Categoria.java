 package ar.com.ada.api.empleadas.entities;

import java.math.BigDecimal;

public class Categoria {
    
    private Integer categoriaId;
    
    private String nombre;

    private BigDecimal sueldoBase;



    public Integer getCategoriaId() {
        return categoriaId;
    }

    public void setCategoriaId(Integer categoriaId) {
        this.categoriaId = categoriaId;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public BigDecimal getSueldoBase() {
        return sueldoBase;
    }

    public void setSueldoBase(BigDecimal sueldoBase) {
        this.sueldoBase = sueldoBase;
    }

    

}
