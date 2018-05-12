/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios3;

/**
 *
 * @author Alumno
 */
public class Rectangle extends GeometricShape {
    
    double length, width;  
    
    Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }
    
    
    
    int getArea(){
      double area= length * width;
      return (int) area;
  }
  
  
  int getPerimeter(){
      double perimetro = ((length * 2)+(width * 2));
      return (int) perimetro;
  }
    
    
}
