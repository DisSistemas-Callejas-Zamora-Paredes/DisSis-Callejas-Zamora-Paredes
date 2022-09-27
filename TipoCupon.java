public class TipoCupon {
    private int idTipo;
    private String nomTipo;
    private String descripcion;

    public TipoCupon() {
    }

    public TipoCupon(int idTipo, String nomTipo, String descripcion) {
        this.idTipo = idTipo;
        this.nomTipo = nomTipo;
        this.descripcion = descripcion;
    }

    public int getIdTipo() {
        return idTipo;
    }

    public void setIdTipo(int idTipo) {
        this.idTipo = idTipo;
    }

    public String getNomTipo() {
        return nomTipo;
    }

    public void setNomTipo(String nomTipo) {
        this.nomTipo = nomTipo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    public String toString(){
        return this.idTipo+"\t"+this.nomTipo+"\t"+this.descripcion;
    }
}
