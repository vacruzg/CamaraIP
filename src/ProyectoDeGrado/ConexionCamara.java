/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProyectoDeGrado;


import static ProyectoDeGrado.LoginPassCam.authStringEnc;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import javax.swing.JOptionPane;

/**
 *
 * @author Víctor Cruz
 */
public class ConexionCamara {

    public String urlControl;
    public URLConnection urLConnection;

    public String getUrlControl() {
        return urlControl;
    }

    public URLConnection getUrLConnection() {
        return urLConnection;
    }

    public void setUrlControl(String urlControl) {
        try {
            URL url = new URL(urlControl);
            URLConnection urlConnection = url.openConnection();
            urlConnection.setRequestProperty("Authorization", "Basic " + authStringEnc);
            urlConnection.connect();
            InputStream is = urlConnection.getInputStream();
            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            char[] buffer = new char[1000];
            int leido;
            while ((leido = br.read(buffer)) > 0) {

            }
        } catch (IOException io) {
            JOptionPane.showMessageDialog(null, "No hay conexión con la cámara.");
        }
    }

    public void setUrLConnection(String urLConnection) {
        
        
        URLConnection urlConnection = null;
        try {
            URL url = new URL(urLConnection);
            urlConnection = url.openConnection();
            urlConnection.setRequestProperty("Authorization", "Basic " + authStringEnc);
            urlConnection.connect();
        } catch (IOException io) {
            JOptionPane.showMessageDialog(null, "No hay conexión con la cámara.");
        }

        this.urLConnection = urlConnection;
    }

}
