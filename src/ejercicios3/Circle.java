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
public class Circle extends GeometricShape {
    double radius;
    
    Circle(double radius){
        
        this.radius = radius;
        
    }
    
     int getArea(){
      double area= Math.PI * Math.pow(radius, 2);
      return (int) area;
  }
  
  
  int getPerimeter(){
      double perimetro = 2 * Math.PI * radius ;
      return (int) perimetro;
  }
    
    
    
}
