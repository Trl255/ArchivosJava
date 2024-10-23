/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.hospital;

import java.time.LocalDate;

/**
•	Paciente: número de historia clínica, sexo, grupo sanguíneo, lista de medicamentos a los que es alérgico.
 */
public class Paciente extends Persona {
    int numHistoriaClinica;
    char sexo;
    String grupoSanguineo;
    String []alergias;
    
    Paciente(int numHistoriaClinica,char sexo,String grupo,String[]alergias,String dni, String nombre, String apellidos,
        LocalDate fechaNacimiento,String direccion,String procedencia){
            
        super(dni,nombre,apellidos,fechaNacimiento,direccion,procedencia);
        this.numHistoriaClinica=numHistoriaClinica;
        this.sexo=sexo;
        this.grupoSanguineo=grupo;
        this.alergias=new String[alergias.length];
        for(int i=1;i<alergias.length;i++)
            this.alergias[i]=alergias[i];
        
    }
    public String toString(){
        String medicamentos="";
         for(int i=1;i<alergias.length;i++)
            medicamentos +=this.alergias[i];
        return super.toString()+"Historia Clínica: "+this.numHistoriaClinica+" sexo: "+sexo+ "Grupo sanguíneo: "+
                this.grupoSanguineo+" Tiene alergia a: "+medicamentos;
    }
}
