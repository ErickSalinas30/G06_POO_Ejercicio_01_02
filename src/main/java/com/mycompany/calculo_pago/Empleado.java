/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculo_pago;

/**
 *
 * @author usuario
 */
public class Empleado {
    String nombre;
    int horasTrabajadas;
    double costoHora;
    int yearIngreso;
    
    
    public int calcularYearTrabajado(int yearActual){
        var retorno= 0;
        retorno=yearActual-this.yearIngreso;
        
      
        return retorno;      
    }
    
    public double calcularIngreso(int yearActual){
        var retorno=0.0d;
        var total=(this.costoHora*this.horasTrabajadas);
        
        
        
        return retorno;               
                
    }
     
    
    public double calcularBonoHoraExtra(){
        var retorno=0.0d;
        if(this.horasTrabajadas>160){
            retorno=(this.costoHora*2);
        }
        
        return retorno;
    }
     
    /*
    limite0: 3200-No paga impuesto
    limite1: >3200 y 3800< -Paga el 5%
    limite2: >3800 y 4400< -Paga el 12%
    limite3: >4400 -Paga el 25%
    */
    
    
    public double calcularImpuesto(){
        var retorno=0.0d;
        var resta=0.0d;
        if(this.calcularIngreso(2022)<=3200 && this.calcularIngreso(2022)>0){
            retorno=this.calcularIngreso(2022);
        }
        if(this.calcularIngreso(2022)>3200 && this.calcularIngreso(2022)<=3800){
            resta=this.calcularIngreso(2022)*0.05;
            retorno=this.calcularIngreso(2022)-resta;
            
        }
        if(this.calcularIngreso(2022)>3800 && this.calcularIngreso(2022)<=4400){
            resta=this.calcularIngreso(2022)*0.12;
            retorno=this.calcularIngreso(2022)-resta;
            
        }
        if(this.calcularIngreso(2022)>4400){
            resta=this.calcularIngreso(2022)*0.25;
            retorno=this.calcularIngreso(2022)-resta;
            
        }
        
        return retorno;
        
        
    }
    
    public double calcularTotal(){
        var retorno= 0.0d;
        
        
        return retorno;
                
    }
    
    
}
