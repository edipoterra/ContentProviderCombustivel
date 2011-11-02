package com.example.CombustivelProviderActivity;

/**
 * class Combustivel
 * @author Me
 */

import java.util.Date;

public class Combustivel {
  protected int _id;
  protected String data;
  protected float odometro;
  protected float litros;
  protected int combustivel;


  /**
    * Constructor for Combustivel
    */
  public Combustivel(String data, float odometro, float litros, int combustivel){
      this.data = data;
      this.odometro = odometro;
      this.litros = litros;
      this.combustivel = combustivel;
  }

  public int get_id (){
      return _id;
  }

  public void set_id (int _id){
      this._id = _id;
  }

  public String getData(){
      return data;
  }

  public void setData(String data){
      this.data = data;
  }

  public float getOdometro(){
      return odometro;
  }

  public void setOdometro(float odometro){
      this.odometro = odometro;
  }

  public float getLitros(){
      return litros;
  }

  public void setLitros(float litros){
      this.litros = litros;
  }

  public int getCombustivel(){
      return combustivel;
  }

  public void setCombustivel(int combustivel){
      this.combustivel = combustivel;
  }

}
