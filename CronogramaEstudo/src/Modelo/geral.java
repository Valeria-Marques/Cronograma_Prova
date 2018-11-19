package Modelo;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import javax.swing.JOptionPane;

public class geral {
 private int data;
 private String conteudo;
 private int hora;
 private String f;

    public int getData() {
        return data;
    }

    public void setData(int dia) {
        this.data = data;
    }
    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public String getF() {
        return f;
    }

    public void setF(String f) {
        this.f = f;
    }
    public static void main(String args[]){
    }
 
}
