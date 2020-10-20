<<<<<<< HEAD
public class Demo {

        public static void main(String[]args) {
        int a = 5;
        if(args.length > 0)
        {
        a = Integer.parseInt(args[0]);
      }
        printLoop(a);
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
}
=======
public class Demo {

        public static void main(String[]args) {
        int a = 5;
        if(args.length > 0)
        {
        a = Integer.parseInt(args[0]);
      }
        printLoop(a);
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
}
>>>>>>> 7280c52ea130f9e2c344acfe8e25c5fa020186db
