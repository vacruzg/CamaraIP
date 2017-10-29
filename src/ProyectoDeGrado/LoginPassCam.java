/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProyectoDeGrado;

import org.apache.commons.codec.binary.Base64;







/**
 *
 * @author Víctor Cruz
 */
public interface LoginPassCam 
{
    
    final String IP = "http://192.168.1.126";
    final String IP_CAM = IP+"/tmpfs/auto.jpg"; 
    final String ARRIBA = IP+"/ytup.cgi";
    final String ABAJO = IP+"/ytdown.cgi";
    final String IZQUIERDA = IP+"/ytleft.cgi";
    final String DERECHA = IP+"/ytright.cgi";
    public String ESTADO_INICIAL = IP+"/cgi-bin/camctrl.cgi?move=home";
    final String USER = "admin";
    final String PASSWORD = "admin";
    final String authString = USER + ":" + PASSWORD;
    final byte[] authEncBytes = Base64.encodeBase64(authString.getBytes());
    public String authStringEnc = new String(authEncBytes);
            
 }
  