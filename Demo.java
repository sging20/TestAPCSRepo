 public class Demo {

        public static void main(String[]args) {
        int a = 5;
        if(args.length > 0)
        {
        a = Integer.parseInt(args[0]);
      }
    //    printLoop(a);
        int rows = Integer.parseInt(args[0]);
        int cols = Integer.parseInt(args[1]);
        int maxValue = Integer.parseInt(args[2]);
        System.out.println( arrayDeepToString( create2DArray(rows, cols, maxValue) ) );
     System.out.println( arrayDeepToString( create2DArrayRandomized(rows, cols, maxValue) ) );
      }

        public static void printLoop(int n)
        {
          for(int i=1; i<=n; i++)
          {
            for(int j =0; j< n+ 1 - i; j++)
            {
              System.out.print(i);
            }
            System.out.println();
          }
        }
public static String arrToString(int[]arr) {
  String ans = "{";
  if(arr.length == 0)
  {
    return "{}";
  }
  for(int i=0; i<arr.length- 1; i++)
  {
    ans+= arr[i] + ", ";
  }
  return ans + arr[arr.length -1] + "}";
}

public static String arrayDeepToString(int[][]arr) {
  String ans = "{";
  if(arr.length == 0)
  {
    return "{}";
  }
  for(int i=0; i<arr.length -1; i++)
  {
    ans+= arrToString(arr[i]) + ", ";
  }
  return ans + arrToString(arr[arr.length -1]) + '}';
}


public static int[][] create2DArray(int rows, int cols, int maxValue){
int[][]output = new int[rows][cols];
for(int i=0; i < output.length; i++)
  {
    for(int j=0; j<cols; j++)
    {
    output[i][j] = (int)(Math.random() * (maxValue + 1));
    }
  }
    return output;
}

public static int[][] create2DArrayRandomized(int rows, int cols, int maxValue){
int[][]output = new int[rows][];
for(int i =0; i< output.length; i++)
  {
    output[i]= new int[(int) (Math.random() * cols)];
    for(int j=0; j< output[i].length; j++)
    {
      output[i][j] = (int) (Math.random() * (maxValue+1));
    }
  }
    return output;
// System.out.println();
   //
   // int[] a = new int[5];
   // System.out.println(arrToString(a));
   // System.out.println();
   //
   // int[][] b = new int[3][4];
   // //System.out.println(arrayDeepToString(b));
   // System.out.println(arrayDeepToString(b).replace("}, ", "},\n"));
   // System.out.println();
   //
   // System.out.println(arrayDeepToString(create2DArray(5,4,4)).replace("}, ", "},\n"));
   // System.out.println();
   // System.out.println(arrayDeepToString(create2DArray(6,2,3)).replace("}, ", "},\n"));
   // System.out.println();
   //
   // System.out.println(arrayDeepToString(create2DArrayRandomized(6,4,4)).replace("}, ", "},\n"));
   // System.out.println();
   // System.out.println(arrayDeepToString(create2DArrayRandomized(4,10,100)).replace("}, ", "},\n"));
 }
}








//}
