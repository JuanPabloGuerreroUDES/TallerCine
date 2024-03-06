/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PAQUETE;

/**
 *
 * @author juang
 */
public class Silla {
    private String tipoSilla;
    private String posicion;
    private String material;

    public Silla(String tipoSilla, String posicion, String material) {
        this.tipoSilla = tipoSilla;
        this.posicion = posicion;
        this.material = material;
    }

    // Getters y setters de silla
    public String getTipoSilla() {
        return tipoSilla;
    }

    public void setTipoSilla(String tipoSilla) {
        this.tipoSilla = tipoSilla;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
    
}
