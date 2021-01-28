import java.util.*;
import java.lang.*;
public class Circle {
private double radius = 1.0;
String color= "red";
Circle(){};
Circle(double radius){
	radius = this.radius;
	
};
Circle(double radius, String color){
	radius = this.radius;
	color = this.color;
	
};

public double getRadius() {
	return radius;
}
public void setRadius(double radius) {
	this.radius = radius;
}
public String getColor() {
	return color;
}
public void setColor(String color) {
	this.color = color;
}
public double getArea() {
	return Math.PI *(radius *radius);
}
@Override
public String toString() {
	return "Circle [radius=" + radius + ", color=" + color + ", getArea()=" + getArea() + "]";
}


}
