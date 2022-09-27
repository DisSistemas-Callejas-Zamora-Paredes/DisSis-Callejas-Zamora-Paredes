public class Producto {
    private int idProducto;
    private int idCategoria;
    private String nomProducto;
    private String descripcion;
    private float precio;
    private int existencias;

    public Producto() {
    }

    public Producto(int idProducto, int idCategoria, String nomProducto, String descripcion, float precio, int existencias) {
        this.idProducto = idProducto;
        this.idCategoria = idCategoria;
        this.nomProducto = nomProducto;
        this.descripcion = descripcion;
        this.precio = precio;
        this.existencias = existencias;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public int getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }

    public String getNomProducto() {
        return nomProducto;
    }

    public void setNomProducto(String nomProducto) {
        this.nomProducto = nomProducto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public int getExistencias() {
        return existencias;
    }

    public void setExistencias(int existencias) {
        this.existencias = existencias;
    }
    
    public String toString(){
        return this.idProducto+"\t"+this.idCategoria+"\t"+this.nomProducto+"\t"+this.descripcion+"\t"+this.descripcion+"\t"+this.precio+"\t"+this.existencias;
    }
}
