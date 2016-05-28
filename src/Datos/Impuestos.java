package Datos;
public class Impuestos {

    private int idImpuestos;
    private String nombreImpuesto;
    private boolean vigente;

    public int getIdImpuestos() {
        return idImpuestos;
    }

    public void setIdImpuestos(int idImpuestos) {
        this.idImpuestos = idImpuestos;
    }

    public String getNombreImpuesto() {
        return nombreImpuesto;
    }

    public void setNombreImpuesto(String nombreImpuesto) {
        this.nombreImpuesto = nombreImpuesto;
    }

    public boolean isVigente() {
        return vigente;
    }

    public void setVigente(boolean vigente) {
        this.vigente = vigente;
    }

    public Impuestos(int idImpuestos, String nombreImpuesto, boolean vigente) {
        this.idImpuestos = idImpuestos;
        this.nombreImpuesto = nombreImpuesto;
        this.vigente = vigente;
    }

    public Impuestos() {
    }
    
    
}
