public class Cupon extends TipoCupon{
    private int idCupon;
    private String nombreCupon;
    private int idTipoCupon;
    private int percentDesc;
    private String fechaInicio;
    private String fechaFin;
    private String aplicacion;
    private int idProdOrCat;

    public Cupon() {
    }

    public Cupon(int idCupon, String nombreCupon, int idTipoCupon, int percentDesc, String fechaInicio, String fechaFin, String aplicacion, int idProdOrCat, int idTipo, String nomTipo, String descripcion) {
        super(idTipo, nomTipo, descripcion);
        this.idCupon = idCupon;
        this.nombreCupon = nombreCupon;
        this.idTipoCupon = idTipoCupon;
        this.percentDesc = percentDesc;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.aplicacion = aplicacion;
        this.idProdOrCat = idProdOrCat;
    }

    public int getIdCupon() {
        return idCupon;
    }

    public void setIdCupon(int idCupon) {
        this.idCupon = idCupon;
    }

    public String getNombreCupon() {
        return nombreCupon;
    }

    public void setNombreCupon(String nombreCupon) {
        this.nombreCupon = nombreCupon;
    }

    public int getIdTipoCupon() {
        return idTipoCupon;
    }

    public void setIdTipoCupon(int idTipoCupon) {
        this.idTipoCupon = idTipoCupon;
    }

    public int getPercentDesc() {
        return percentDesc;
    }

    public void setPercentDesc(int percentDesc) {
        this.percentDesc = percentDesc;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(String fechaFin) {
        this.fechaFin = fechaFin;
    }

    public String getAplicacion() {
        return aplicacion;
    }

    public void setAplicacion(String aplicacion) {
        this.aplicacion = aplicacion;
    }

    public int getIdProdOrCat() {
        return idProdOrCat;
    }

    public void setIdProdOrCat(int idProdOrCat) {
        this.idProdOrCat = idProdOrCat;
    }
    
    public String toString(){
        return this.idCupon+"\t"+this.nombreCupon+"\t"+this.idTipoCupon+"\t"+this.percentDesc+"\t"+this.fechaInicio+"\t"+this.fechaFin+"\t"+this.aplicacion+"\t"+this.idProdOrCat;
    }
    
}
