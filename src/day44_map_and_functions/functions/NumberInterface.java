package day44_map_and_functions.functions;


@FunctionalInterface
public interface NumberInterface {
    public abstract void apply(int n);
    // can only have 1 abstract method
}


// this below is to explain the difference of interface and functional interface
//------------------------------------------------------------------
interface NumInt{
    void apply(int n);
}

class A implements NumInt{
    @Override
    public void apply(int n) {
        if(n % 2 == 0){
            System.out.println(n +" is even");
        }else {
            System.out.println(n + " is odd");
        }
    }
}
