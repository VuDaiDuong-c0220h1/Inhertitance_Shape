public class Square extends Rectangle {
    public double side = 1;
    public Square(){
    }

    public Square(double side){
        super(side, side);
    }

    public Square(double side, String color, boolean filled){
        super(side, side, color, filled);
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setWidth(double width){
        setSide(width);
    }

    public void setLength(double length){
        setSide(length);
    }

    @Override
    public String toString() {
        return "Square with side = "
                + side
                + ", which is a subclass of "
                + super.toString();
    }
}
