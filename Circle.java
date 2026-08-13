public record Circle(double radius) implements GeometricForm {

    private static final double pi = 3.1415926535 ;

    @Override
    public double getArea(){
        return pi*(radius*radius);
    }
}
