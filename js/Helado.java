/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PracticaFinal;



/**
 *
 * @author Salazar
 */
public class Helado implements Comparable<Helado>{
    private int id;
    private String sabor;
    private String color;
   
    
    
    public Helado(){
    id = 0;
    sabor = "xxx";
    color = "xxx";
    }

    public Helado(int id, String sabor, String color) {
        this.id = id;
        this.sabor = sabor;
        this.color = color;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Helado{" + "id=" + id + ", sabor=" + sabor + ", color=" + color + '}';
    }

    @Override
    public int compareTo(Helado o) {
        return this.id - o.getId();
    }

    

   
    
}
