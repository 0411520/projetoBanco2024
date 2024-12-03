/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exemplocreate;

/**
 *
 * @author 0022216
 */
class User {
    int id;
    int quant;
    String username;
    String password;

    public User() {
        this.id = 0;
        this.quant = -1;
        this.username = "";
        this.password = "";
    }
    
    public User(int q) {
        this.id = 0;
        this.quant = q;
        this.username = "";
        this.password = "";
    }

    public User(int id, int quant, String username, String password) {
        this.id = id;
        this.quant = quant;
        this.username = username;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getQuant() {
        return quant;
    }

    public void setQuant(int quant) {
        this.quant = quant;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        String r="";
        r+="Id="+this.getId();
        r+=" Username="+this.getUsername();
        r+=" Password="+this.getPassword();
        r+=" Quant="+this.getQuant();
        return r;
    }
    
    
    
    
    
    
}
