package com.tutum.cursos.dto;

public class ResponseDto {

    private Integer estatus;
    private String mensaje;
    private Object object; 
    
    public ResponseDto(Integer estatus, String mensaje) {
        this(estatus, mensaje, null);
    }
    
    public ResponseDto(Integer estatus, String mensaje, Object object) {
        this.estatus = estatus;
        this.mensaje = mensaje;
        this.object = object;
    }

    public Integer getEstatus() {
        return estatus;
    }
    
    public void setEstatus(Integer estatus) {
        this.estatus = estatus;
    }
    
    public String getMensaje() {
        return mensaje;
    }
    
    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }
    
}
