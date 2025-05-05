/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.mx.uttt.colas;

/**
 *
 * @author vania
 */
public class ColaArray {
 private static final int MAXTAM = 7;
 private int frente;
 private int ultimo;
 private int []cola;
 public ColaArray(){
  frente = 0;
  ultimo = -1;
  cola = new int [MAXTAM];
 }
 public void insertarQ(int elemento)throws Exception{
  if (!ColaLlena())
   cola[++ultimo]= elemento;
  else
   throw new Exception ("Error en la cola: Cola LLena");
  
 }
 
 public int eliminarQ() throws Exception{
  if (!ColaVacia())
   return cola[frente++];
  else
   throw new Exception ("Cola vacia");
 }
 
 public void BorrarQ(){
  frente = 0;
  ultimo = -1;
 }
 
 public int frenteQ()throws Exception{
  if (!ColaVacia())
   return cola[frente];
  else
   throw new Exception ("Cola vacia");
 }
 
 public boolean ColaVacia(){
  return frente > ultimo;
 }
 
 public boolean ColaLlena(){
  return ultimo == MAXTAM - 1;
 }
 
 
}

