/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package im.in.mem.web.jms;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.jms.Message;

public class JsonMessage  {
    
    @JsonProperty
    private String type;
    
    @JsonProperty
    private String paypload;
   
    @JsonProperty
    private String role;
    
    public JsonMessage(){}

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPaypload() {
        return paypload;
    }

    public void setPaypload(String paypload) {
        this.paypload = paypload;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "JsonMessage{" + "type=" + type + ", paypload=" + paypload + ", role=" + role + '}';
    }

  

 
    
}
