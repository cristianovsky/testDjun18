package org.example.entity;

public class Client{
  private int id;
  private String nombre;
  
  public Client(int id, String nombre){
    this.id = id;
    this.nombre = nombre;
  }

  // Getters
  public int getId() {
    return id; 
  }

  public String getNombre() {
    return nombre;
  }

}

