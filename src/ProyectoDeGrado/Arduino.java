/*

 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProyectoDeGrado;

import static ProyectoDeGrado.VentanaPrincipal.Puertos;
import gnu.io.SerialPortEvent;
import gnu.io.SerialPortEventListener;
import panamahitek.Arduino.PanamaHitek_Arduino;

/**
 *
 * @author Víctor Cruz
 */
public class Arduino
{
    PanamaHitek_Arduino Arduino = new PanamaHitek_Arduino();
     private SerialPortEventListener evento;
    
    public Arduino()
    {
        this.evento = new SerialPortEventListener() {

            @Override
            public void serialEvent(SerialPortEvent spe) {
                if(Arduino.isMessageAvailable()==true){
                    System.out.println(Arduino.printMessage());
                }
            }
            
        };
        
    }
    
    public void conecArduino() 
    {
        
        try 
        {
           Arduino.arduinoRXTX(Puertos.getSelectedItem().toString(),9600,evento);       
        } catch (Exception ex) 
        {
            
        }
    }                                            

    public void desconArduino() 
    {   
        
        try {
            Arduino.killArduinoConnection();
        } catch (Exception ex) 
        {
            
        }      
    }                                             

    public void arribaRobot() 
    {                                            

        try 
        {
          Arduino.sendData("W");
        } catch (Exception ex) 
        {
            
        }
    }                                           

    public void izquierdaRobot()
    {                                               
        try 
        {
            Arduino.sendData("A");
        } catch (Exception ex) 
        {
            
        }         
    }                                              

    public void derechaRobot()
    {                                             
        try 
        {
            Arduino.sendData("D");
        } catch (Exception ex) 
        {
            
        }        
    }                                            

    public void abajoRobot() 
    {                                           
        try 
        {
            Arduino.sendData("S");
        } catch (Exception ex) 
        {
            
        }        
    }

}
