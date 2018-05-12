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
public class Square extends GeometricShape {
    double side;
    Square (double side ){
        this.side = side;
    }
    
    
    int getArea(){
      double area= side * 2;
      return (int) area;
  }
    
    int getPerimeter(){
      double Perimetro = (side*4);
      return (int) Perimetro;
  }
    
}
