import java.util.Random;

class rnd{
  public static void main(String[] arr){
    num n=new num();
    n.start();
  }
}

class square extends Thread{
  int x;
  public void square(int n){
    x=n;
  }
  public void run(){
    System.out.println(x*x);
  }
}
import java.util.*;

class Exceptionex{
  public static void main(String[] args){
    try{
      int[] a=new int[-2];
    }
    catch(NegativeArraySizeException n){
      System.out.println(n);
    }
    System.out.println("after try block");
  }
}
}
