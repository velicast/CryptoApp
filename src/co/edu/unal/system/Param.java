/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unal.system;

import java.util.Objects;

/**
 *
 * @author eduarc
 */
public class Param {
    
    private final String name;
    private final String value;
    
    public Param(String name, String value) {
        
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public String getValue() {
        return value;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 89 * hash + Objects.hashCode(this.name);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Param other = (Param) obj;
        return Objects.equals(this.name, other.name);
    }

    @Override
    public String toString() {
        return "Param{" + "name=" + name + ", value=" + value + '}';
    }
}
