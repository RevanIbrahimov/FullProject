/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package az.javaapplication;

/**
 *
 * @author ipi
 */
public class Item {
     
    private Long id;
    private String value;
    
    
 public Item(Long id,String value) {
        this.id=id;
        this.value=value; 
    }

    /**
     * @return the id
     */
    public Long getId() {
        return id;
    }



    /**
     * @return the value
     */
    public String getValue() {
        return value;
    }    
   

  
    
    @Override
    
    public String toString(){
        return value;
        
    }
}
