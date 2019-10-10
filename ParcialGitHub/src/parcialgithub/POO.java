
package parcialgithub;

import javax.swing.JOptionPane;

public class POO {
    private int id;
    private String fecha;
    private String nombre;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void commit(){
        JOptionPane.showMessageDialog(null, "Un Commit identifica los cambios hechos en dicho ambiente de trabajo.");
    }
    
    public void push(){
        JOptionPane.showMessageDialog(null, "Un git push sube los cambios al repositorio central, comúnmente llamado origin, para que otros desarrolladores puedan bajarse tus cambios");
    }
    
    public void pull(){
        JOptionPane.showMessageDialog(null, "Un git pull baja los cambios de la rama determinada y la actualiza contra tu repositorio local.");
    }
    
    public void clase(){
        JOptionPane.showMessageDialog(null, "Son plantillas para la creación de objetos, en lo que se conoce como programación orientada a objetos");
    }
    
    public void objeto(){
        JOptionPane.showMessageDialog(null, " objeto es una instancia de una clase");
    }
}
