public class Categoria {
    private int idCategoria;
    private String nomCategoria;
    private String descripcion;

    public Categoria() {
    }

    public Categoria(int idCategoria, String nomCategoria, String descripcion) {
        this.idCategoria = idCategoria;
        this.nomCategoria = nomCategoria;
        this.descripcion = descripcion;
    }

    public int getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }

    public String getNomCategoria() {
        return nomCategoria;
    }

    public void setNomCategoria(String nomCategoria) {
        this.nomCategoria = nomCategoria;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    public String toString(){
        return this.idCategoria+"\t"+this.nomCategoria+"\t"+this.descripcion;
    }
}
