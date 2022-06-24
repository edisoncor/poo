/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package model;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author edisoncor
 */
public enum EstadoCivil {
    SOLTERO, CASADO, DIVORCIADO, UNION_LIBRE;
    
    public List<EstadoCivil> toList(){
        return new LinkedList<>();
    }
}
