/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProyectoDeGrado;

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
public class ControlCamara implements LoginPassCam
{
    PanelCamara panelVideo = new PanelCamara();
    ConexionCamara conexionCamara = new ConexionCamara();
    
    public ControlCamara()
    {
        panelVideo.repaint();
    }
    
    public void conectar()
    {
        
    }
    
  
    public void arriba()
    {
      conexionCamara.setUrlControl(ARRIBA);
        
    }
    
    public void abajo()
    {
         conexionCamara.setUrlControl(ABAJO);
        
    }
        
    public void derecha()
    {
        conexionCamara.setUrlControl(DERECHA);
        
    }
   
    public void izquierda()
    {
        conexionCamara.setUrlControl(IZQUIERDA);

//         try
//        {
//            URL url = new URL(IZQUIERDA); 
//            URLConnection urlConnection = url.openConnection();
//           // urlConnection.setRequestProperty("Authorization", "Basic " + authStringEnc);
//            urlConnection.connect(); 
//            urlConnection.getInputStream();
//        }
//        catch (IOException io)
//        {
//            JOptionPane.showMessageDialog(null, "No hay conexión con la cámara.");          
//        }
        
    }
    
    public void estadoInicial() 
    {
        try
        {
            URL url = new URL(ESTADO_INICIAL); 
            URLConnection urlConnection = url.openConnection();
           
            urlConnection.connect(); 
           InputStream is = urlConnection.getInputStream();
         BufferedReader br = new BufferedReader(new InputStreamReader(is));
         char[] buffer = new char[1000];
         int leido;
         while ((leido = br.read(buffer)) > 0) 
         {
             
         }
        }
        catch (IOException io)
        {
            JOptionPane.showMessageDialog(null, "No hay conexión con la cámara.");          
        }
    }
    
   
}

