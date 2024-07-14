/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.java.zrock;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ALICIA TAU
 */
public class StringToInt {
    //converting a string to a list of integers
    public List<Integer> stringToInt(String data){
        
        List<Integer> list = new ArrayList<>();
        
        String[] strings = data.split(";");
        
        for(String str : strings){
            str = str.trim();
            
            if (!str.isEmpty()) {
                
                try {
                    int number = Integer.parseInt(str);
                    list.add(number);
                    
                } catch (NumberFormatException e) {
                    System.out.println("Invalid number format: " + str);
                }
            }
        }
        
        return list;
    }
    
}
