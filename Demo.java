public class Demo{
  public static void main(String[] args){
    int x = 5;
    if(args.length != 0){
      x = Integer.parseInt(args[0]);
    }
    System.out.print(printLoop.printLoop(x));
  }
}
