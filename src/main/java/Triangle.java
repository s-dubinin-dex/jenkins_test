public class Triangle {
    private int side1;
    private int side2;
    private int side3;

    public Triangle(int side1, int side2, int side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public int getMaxSide(){
        int max = side1;
        for (int side: new int[] {side2, side3}){
            if (side > max) {
                max = side;
            }
        }
        return max;
    }

    public double getSquare(){
        double halfPerimeter = (double) getPerimeter() / 2;

        return Math.round(Math.sqrt(halfPerimeter *
                (halfPerimeter - side1) *
                (halfPerimeter - side2) *
                (halfPerimeter - side3)
                ));
    }

    public int getPerimeter(){
        return side1 + side2 + side3;
    }

}
