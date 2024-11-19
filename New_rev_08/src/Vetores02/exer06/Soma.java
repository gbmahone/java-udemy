package Vetores02.exer06;

public class Soma {

    private int a;

    private int b;

    public Soma(){

    }

    public Soma(int a, int b){
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int totalValueVect(){
        return this.a + this.b;
    }
}
