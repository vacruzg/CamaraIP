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
public interface  LoginPassCam 
{
 
    final String USER = "admin";
    final String PASSWORD = "admin";
    final String authString = USER + ":" + PASSWORD;
    final byte[] authEncBytes = Base64.encodeBase64(authString.getBytes());
    public String authStringEnc = new String(authEncBytes);
            
 }
  