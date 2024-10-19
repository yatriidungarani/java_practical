class Degree{
    void getDegree(){
        System.out.println("I got a degree.");
    }
}
class Undergraduate extends Degree{
    void getDegree(){
        System.out.println("I am an Undergraduate.");
    }    
}
class Postgraduate extends Degree{
    void getDegree(){
        System.out.println("I am a Postgraduate.");
    }
}
public class P21 {
    public static void main(String[] args) {
        Degree D=new Degree();
        Undergraduate UG=new Undergraduate();
        Postgraduate PG=new Postgraduate();

        D.getDegree();
        UG.getDegree();
        PG.getDegree();
}
}
