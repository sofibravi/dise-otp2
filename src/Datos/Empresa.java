package Datos;
public class Empresa {

    private int id;
    private String nombreEmpresa;
    private boolean vigente;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public boolean isVigente() {
        return vigente;
    }

    public void setVigente(boolean vigente) {
        this.vigente = vigente;
    }

    public Empresa() {
    }

    public Empresa(int id, String nombreEmpresa, boolean vigente) {
        this.id = id;
        this.nombreEmpresa = nombreEmpresa;
        this.vigente = vigente;
    }
    
    
    
}
