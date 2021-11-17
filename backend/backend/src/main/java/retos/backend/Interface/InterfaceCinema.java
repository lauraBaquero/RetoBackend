/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package retos.backend.Interface;

import org.springframework.data.repository.CrudRepository;
import retos.backend.modelo.Cinema;

/**
 *
 * @author ragno
 */
public interface InterfaceCinema  extends CrudRepository <Cinema,Integer>{
    
}
