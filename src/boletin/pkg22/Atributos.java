package boletin.pkg22;

import javax.swing.JOptionPane;

/**
 *
 * @author galle
 */
public class Atributos {
    private String titulo;
    private String autor;
    private float precio;
    private int unidades;

    public Atributos() {
    }

    public Atributos(String titulo, String autor, float precio, int unidades) {
        titulo = introducirPantalla("el titulo del libro");
        autor = introducirPantalla("el autor del libro");
        precio = Float.parseFloat(introducirPantalla("el titulo del libro"));
        unidades = Integer.parseInt(introducirPantalla("el titulo del libro"));
    }
    public String introducirPantalla (String dato){
        return JOptionPane.showInputDialog("Introduce " + dato);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public int getUnidades() {
        return unidades;
    }

    public void setUnidades(int unidades) {
        this.unidades = unidades;
    }

    @Override
    public String toString() {
        return titulo + ", " + autor + ", " + precio + ", " + unidades;
    }
    
}
