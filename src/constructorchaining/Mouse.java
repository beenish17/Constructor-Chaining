
package constructorchaining;

public class Mouse {
    private int numTeeth;
    private int numWhiskers;
    private int weight;
    
    public Mouse(int weight){
        this(weight,16);
        System.out.println("this 1 is called");
    }
    public Mouse(int weight,int numTeeth){
        this(weight,7,30);
        System.out.println("this two is called");
    }
    public Mouse(int weight,int numTeeth,int numWhiskers){
        this.weight=weight;
        this.numWhiskers=numWhiskers;
        this.numTeeth=numTeeth;
        System.out.println("this third is called");
    }
    public void print(){
        System.out.println(weight + " "+ numTeeth+" "+numWhiskers);
    }
    
}
