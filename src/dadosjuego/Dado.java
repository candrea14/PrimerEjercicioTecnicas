/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dadosjuego;

import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Dado {

    private int numero;

    public void lanzar(Random r) {
        // generar número aleatorio entre 1 y 6
        numero = r.nextInt(6) + 1;
    }

    public void mostrar(JLabel lblDado) {
        // obtener el nombre del archivo de la carta
        String nombreArchivo = "/imagenes/" + String.valueOf(numero) + ".jpg";
        //cargar la imagen
        ImageIcon imagen = new ImageIcon(getClass().getResource(nombreArchivo));
        //asignar la imagen al JLabel
        lblDado.setIcon(imagen);
    }

    public int obtenerNumero() {
        System.out.println(numero);
        return numero;
    }

    public int getNumero() {
        return numero;
    }

}
