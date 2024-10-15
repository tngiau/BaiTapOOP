public class bai1 {
    double radius ;
    String color ;


    //methodname
    bai1(){
        radius = 1.0;
        color = "red";
    }
    bai1( double r){
        radius = r;
    }
    bai1( String c) {
        color = c;
    }
     Double getRadius(){
        return radius;
     }
     Double getArea(){
        return radius * radius * Math.PI;
     }
     void setRadius(double r){
        this.radius = r;
     }
     void setColor( String c){
        this.color = c;
     }





}
