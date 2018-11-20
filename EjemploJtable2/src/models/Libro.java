/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author cetecom
 */
public class Libro {
    private String codigo,nombre,categoria,autor;
    private char formato;
    private boolean nuevo;
    private int pagina;

    public Libro() {
    }

    public Libro(String codigo, String nombre, String categoria, String autor, char formato, boolean nuevo, int pagina) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.categoria = categoria;
        this.autor = autor;
        this.formato = formato;
        this.nuevo = nuevo;
        this.pagina = pagina;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public char getFormato() {
        return formato;
    }

    public void setFormato(char formato) {
        this.formato = formato;
    }

    public boolean isNuevo() {
        return nuevo;
    }

    public void setNuevo(boolean nuevo) {
        this.nuevo = nuevo;
    }

    public int getPagina() {
        return pagina;
    }

    public void setPagina(int pagina) {
        this.pagina = pagina;
    }
    
    
}
