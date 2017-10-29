/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProyectoDeGrado;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

/**
 *
 * @author victor
 */
public final class ArchivoPropiedades {
   Properties p = new Properties();
   
   private String ip;
   private String ip_video;
   private String arriba;
   private String abajo;
   private String izquierda;
   private String derecha;
   private String estado_inicial;
   
 
   public  ArchivoPropiedades()
   {
       try
       {
           p.load(new FileReader("datoscamara.properties")); 
           setIp(p.getProperty("IP"));
           setIp_video(p.getProperty("IP_VIDEO"));
           setArriba(p.getProperty("ARRIBA"));
           setAbajo(p.getProperty("ABAJO"));
           setIzquierda(p.getProperty("IZQUIERDA"));
           setDerecha(p.getProperty("DERECHA"));
           setEstado_inicial(p.getProperty("ESTADO_INICIAL"));
           
       }
       catch(FileNotFoundException e)
       {
           
       }
       catch(IOException e)
       {
           
       }
   }

    
    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getIp_video() {
        return ip+ip_video;
    }

    public void setIp_video(String ip_cam) {
        this.ip_video = ip_cam;
    }

    public String getArriba() {
        return ip+arriba;
    }

    public void setArriba(String arriba) {
        this.arriba = arriba;
    }

    public String getAbajo() {
        return ip+abajo;
    }

    public void setAbajo(String abajo) {
        this.abajo = abajo;
    }

    public String getIzquierda() {
        return ip+izquierda;
    }

    public void setIzquierda(String izquierda) {
        this.izquierda = izquierda;
    }

    public String getDerecha() {
        return ip+derecha;
    }

    public void setDerecha(String derecha) {
        this.derecha = derecha;
    }

    public String getEstado_inicial() {
        return ip+estado_inicial;
    }

    public void setEstado_inicial(String estado_inicial) {
        this.estado_inicial = estado_inicial;
    }
    
   
    
    
}
