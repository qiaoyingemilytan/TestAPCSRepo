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

public static String arrToString(int[] arr){
  String newString = "{";
  for(int i = 0; i < arr.length - 1; i++){
    newString += arr[i];
    newString += ", ";
  }
  if(arr.length > 0){
    newString += (arr[arr.length-1]);
  }
  newString += "}";
  return newString;
}

public static String arrayDeepToString(int[][] arr){
  String newString = "{";
  for(int i = 0; i < arr.length - 1; i++){
    newString += arrToString(arr[i]);
    newString += ", ";
  }
  if(arr.length > 0){
    newString += arrToString(arr[arr.length-1]);
  }
  newString += "}";
  return newString;
}

public static int[][] create2DArray(int rows, int cols, int maxValue){
  int[][] arr = new int[rows][cols];
  for(int i = 0; i < rows; i++){
    for(int j = 0; j < cols; j++){
      arr[i][j] = (int)(Math.random() * (maxValue));
    }
  }
  return arr;
}

public static int[][] create2DArrayRandomized(int rows, int cols, int maxValues){
  cols = (int)(Math.random() * (cols));
  return create2DArray(rows, cols, maxValues);
}

}
