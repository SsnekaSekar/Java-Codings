public abstract class Shape {

    public abstract int calculateArea();

    public String display() {
        return ("This is a shape");
    }

}

class Circle extends Shape {
    @Override
    public int calculateArea() {
        int r = 10;
        int a = (int) (3.14 * r * r);
        return (a);
    }

}

class Rectangle extends Shape {
    @Override
    public int calculateArea() {
        int l = 10;
        int b = 7;
        int a = l * b;
        return (a);
    }

}


