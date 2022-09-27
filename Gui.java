import java.util.ArrayList;
import java.util.Collections;

public abstract class Gui implements InfoCupon{

    static ArrayList<Categoria> categorias=new ArrayList<Categoria>();
    static ArrayList<Producto> productos=new ArrayList<Producto>();
    static ArrayList<TipoCupon> tiposCupones=new ArrayList<TipoCupon>();
    static ArrayList<Cupon> cupones=new ArrayList<Cupon>();
    
    public static void main(String[] args){
        //DATOS DE RELLENO PARA INICIALIZAR LA IMPLEMENTACIÓN
        String nomCats []={"Grandes electrodomésticos","Pequeños electrodomésticos","Informática y telecomunicaciones","Multimedia","Alumbrado"};
        String descripcion []={"Descripción 1","Descripción 2","Descripción 3","Descripción 4","Descripción 5"};
        String prods []={"Lavadora","Plancha","Ordenador HP","Televisor LG 4K","Lámpara exterior"};
        String descProd []={"Whirlpool","Oster","Con Windows 10","50 pulgadas","Phillips"};
        float precio []={15000,600,16000,50000,8000};
        Categoria cat;
        Producto prod;
        for(int i=0;i<nomCats.length;i++){
            cat=new Categoria();
            prod=new Producto();
            cat.setIdCategoria(i+1);
            cat.setNomCategoria(nomCats[i]);
            cat.setDescripcion(descripcion[i]);
            prod.setIdProducto(i+1);
            prod.setIdCategoria(i+1);
            prod.setNomProducto(prods[i]);
            prod.setDescripcion(descProd[i]);
            prod.setPrecio(precio[i]);
            prod.setExistencias((i+1)*20);
            categorias.add(cat);
            productos.add(prod);
        }
        
        String tipoCupon []={"Buen Fin","Hot Sale","Rebajas de Invierno","Rebajas de Verano"};
        String descCupon []={"Semanas 2° y 3° de noviembre","27-31 de mayo","Diciembre-Enero","Junio-Septiembre"};
        String nomCupon []={"Línea blanca al 50","Artículos en caliente","Estrena en Navidad","Noches iluminadas"};
        int percentage []={50,40,30,20,10};
        String dateS []={"06/11/2022","27/05/2022","16/12/2022","01/06/2022"};
        String dateF []={"21/11/2022","31/05/2022","31/12/2022","24/06/2022"};
        String aplicacion []={"Categoría","Producto","Categoría","Producto","Categoría"};
        TipoCupon tc;
        Cupon c;
        for(int i=0;i<tipoCupon.length;i++){
            tc=new TipoCupon();
            c=new Cupon();
            tc.setIdTipo(i+1);
            tc.setNomTipo(tipoCupon[i]);
            tc.setDescripcion(descCupon[i]);
            c.setIdCupon(i+1);
            c.setNombreCupon(nomCupon[i]);
            c.setIdTipoCupon(i+1);
            c.setPercentDesc(percentage[i]);
            c.setFechaInicio(dateS[i]);
            c.setFechaFin(dateF[i]);
            c.setAplicacion(aplicacion[i]);
            c.setIdProdOrCat(i+1);
            tiposCupones.add(tc);
            cupones.add(c);
        }
        
        mostrarCupones();
    }

    public static void mostrarCupones() {
        System.out.println("\nCATEGORIAS DE PRODUCTOS");
        for(int i=0;i<categorias.size();i++){
            System.out.println(categorias.get(i).toString());
        }
        System.out.println("\nPRODUCTOS DISPONIBLES");
        for(int i=0;i<productos.size();i++){
            System.out.println(productos.get(i).toString());
        }
        System.out.println("\nTEMPORADAS DE CUPONES");
        for(int i=0;i<tiposCupones.size();i++){
            System.out.println(tiposCupones.get(i).toString());
        }
        System.out.println("\nCUPONES DISPONIBLES");
        for(int i=0;i<cupones.size();i++){
            System.out.println(cupones.get(i).toString());
        }
    }

    public void showCupon(ArrayList cup,int i) {
        System.out.println(cup.get(i));
    }

    public void addCupon(ArrayList cup,String nom,int desc,String fs,String ff) {
        Cupon c=new Cupon();
        c.setNombreCupon(nom);
        c.setPercentDesc(desc);
        c.setFechaInicio(fs);
        c.setFechaFin(ff);
        cup.add(c);
    }

    public void delCupon(ArrayList cup,int i) {
        cup.remove(i);
    }

    public void updateCupon(ArrayList cup,Cupon c,String nom,int desc,String fs,String ff) {
        c.setNombreCupon(nom);
        c.setPercentDesc(desc);
        c.setFechaInicio(fs);
        c.setFechaFin(ff);
        cup.add(c);
    }
    
}
