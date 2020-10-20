public class Demo{
  public static void main(String[] args){
    int x = 5;
    if(args.length != 0){
      x = Integer.parseInt(args[0]);
    }
    System.out.print(printLoop(x));
  }

public static String printLoop(int n){
  String numbers = "";
  for(int i = 1; i <= n; i++){
    for(int j = 0; j <= n - i; j++ ){
      numbers += i;
    }
    numbers += "\n";
  }
  return numbers;
}
}
