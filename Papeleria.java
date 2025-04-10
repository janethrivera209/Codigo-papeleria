import javax.swing.JOptionPane;//Importando paquete
public class Papeleria {
     public static void main (String [] ejercisio1){//metodo principal
         int x=0;
         int e;
         int v[]= new int[4];
         String[] encabezado= {"   HB" ,"HF" ,"PR" ,"OM" ,"Total"};
         for (int a=0; a<5;a++){   
             System.out.print(encabezado[a]+"/   ");
             System.out.print("");
         }
         System.out.println("");
         for (e=0;e<4;e++) {
             v[e]=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa los valores de la compra"));
             x+=v[e];
             
            System.out.print("    " + v[e]);
         }
         
       System.out.print("    " + x );
     }
}