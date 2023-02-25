package task;

public class Triangle {
    private double A,B,C;
    public Triangle(double A, double B, double C){
        this.A = A;
        this.B = B;
        this.C = C;
    }
    public double getA(){
        return this.A;
    }
    public double getB(){
        return this.B;
    }
    public double getC(){
        return  this.C;
    }
    public boolean isValid(){
        if(this.getA()<=0){
            return false;
        }
        if(this.getB()<=0) {
            return false;
        }
        if(this.getC()<=0) {
            return false;
        }
        if((this.getA()+this.getB()<this.getC()) &&( this.getB()+this.getC()<this.getA()) &&(this.getC()+this.getA()<this.getB())){
            return true;
        }
        return false;
    }
    public double perimeter(){
        double p;
        if(this.isValid()){
            p = this.getA()+this.getB()+this.getC();
            return p;
        }
        return -1;
    }
    public double square(){
        double s,p;
        if(this.isValid()){
            p = this.perimeter()/2;
            s = Math.sqrt(p*(p-this.getA())*(p-this.getB())*(p-this.getC()));
            return s;
        }
        return -1;
    }
}
