/* * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_aleatoriofinal;

/**
 *
 * @author Rafael Corredor
 */
public class opesimula {

    private String productos[] = {"camisa", "  blusa_mujer", "camisatipo_polo ", "  medias", " Gorras", "pantalon", " Pantalon_corto", "Bragas", "Zapatos", "Jeans"};
    private int cantidad[] = new int[10];
    private float precio[] = new float[10];
    private float impuesto=0 ;
    

    
    public opesimula (){
     
        
        
    }
    
    
    public float getImpuesto() {
        return impuesto;
    }

    public void setImpuesto(float impuesto) {
        this.impuesto = impuesto;
    }

    public int variable_ale() {

        int numero = (int) (Math.random() * 10 + 1);
        return numero;

    }

    public void cantidad() {

        for (int i = 0; i < cantidad.length; i++) {

            cantidad[i] = variable_ale();

        }

      
    }

    public float valor() {

        float numero = (float) (Math.random() * 50.000 + 5.000);
        return numero;

    }

    public void llenar() {
        for (int i = 0; i < 10; i++) {

            precio[i] = (float) valor();

        }

        

    }

    public float  total() {
        float almancenar = 0;

        for (int i = 0; i < 10; i++) {
            almancenar = (precio[i] )* (cantidad[i]);

        }
         
        
        return almancenar;

    }  public float  porcentaje(int por, float tol) {

        float porc ;


        float resultado = por * tol;
porc = resultado/100;
            
        return porc;

    }

    public float impu() {

        impuesto = 0;

        if (total() < 1.000) {
            impuesto = porcentaje(40, total());
            
        } else if (total() == 1.000) {
            impuesto = porcentaje(30, total());
        } else if (total() > 1.000 || total() >= 1.500) {
            impuesto = porcentaje(25, total());
        } else if (total() > 2.000) {
            impuesto = porcentaje(20, total());
        }

        return impuesto;

    }

   public float totalcon_impuesto(){
         float totalreal ;
         
      totalreal =   (total()+impu());
        
      
      
      return totalreal;
         
        
    } public void mostrar (){
        impu();
            System.out.println("los productos  "+"  "+ "cantidad"+"   "+ "   "  +" precio"  );
        
            
                   for (int i = 0; i < 10; i++) {
                System.out.println(productos[i]+"   "+ cantidad[i]+"  "+  precio[i ]);
            }
            
            System.out.println("------------------------------------------------------------");
    
            
            System.out.println("subtotal "+"   "+ total());
            
            System.out.println("el impuesto es "+" "+impuesto);
            
            System.out.println("el total es"+" "+(total()+impuesto ));
}}
