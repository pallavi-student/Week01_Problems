public class CircleParameters {
    public class Circle{
        private int radius;
        public Circle(int radius){
            this.radius=radius;
        }
        public double areaOfCircle (){
       double area=Math.PI*Math.pow(radius, radius);
       return area;
        }
        public double circumferenceOfCircle(){
            double circumference=Math.PI*Math.pow(radius,radius);
            return circumference;
        }
        public void display(){
            double area=areaOfCircle();
            double circumference=circumferenceOfCircle();
            System.out.println("area of circle whose radius is "+radius+" is "+area+"and circumference is "+circumference);
        }

    }
    public static void main(String[] args) {
        CircleParameters parameter=new CircleParameters();
        Circle c=parameter.new Circle(7);
        c.display();  
    }
}
