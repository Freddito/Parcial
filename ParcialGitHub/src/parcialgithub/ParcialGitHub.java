
package parcialgithub;

import javax.swing.JOptionPane;

public class ParcialGitHub {

    public static void main(String[] args) {
        POO obj = new POO();
        int i=1;
        while(i==1){
        try{
        int opc = Integer.parseInt(JOptionPane.showInputDialog(null,"PARCIAL\n"+
                                           "1. QUE ES UN COMMIT?\n"+
                                           "2. QUE ES UN PUSH?\n"+
                                           "3. QUE ES UN PULL?\n"+
                                           "4. QUE ES UNA CLASE?\n"+
                                           "5. QUE ES UN OBJETO?\n"+
                                           "6. NOMBRE\n"+
                                           "7. FECHA?\n"+
                                           "8. SALIR"));
        
        switch(opc){
            case 1:
                JOptionPane.showMessageDialog(null,"Ingrese un valor numerico");
                break;
                
            case 2:
                break;
                
            case 3:
                break;
                
            case 4:
                break;
                
            case 5:
                break;
                
            case 6:
                break;
                
            case 7:
                break;
                
            case 8:
                i=0;
                break;
                
            default:
                JOptionPane.showMessageDialog(null, "ingrese un valor valido");
        }
        
    }catch(Exception ex){
                JOptionPane.showMessageDialog(null,"Ingrese un valor numerico");
            }
    }
    }
}
