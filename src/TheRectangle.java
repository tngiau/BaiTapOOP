public class TheRectangle {
    float lenght;
    float width;
    TheRectangle(){
        lenght = 1.0f;
        width = 1.0f;
    }
    TheRectangle(float l, float w ){
        lenght = l;
        width = w;
    }
    float getLength(){
        return lenght;
    }
    float getWidth(){
        return width;
    }
    void setLength(float lenght){
        this.lenght = lenght;
    }
    void setWidth(float width){
        this.width = width;
    }
    double getArea(){
        return lenght * width;
    }
    double getPerimeter(){
        return (lenght + width) *2;
    }

}
