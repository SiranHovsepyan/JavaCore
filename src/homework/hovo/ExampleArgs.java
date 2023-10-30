package homework.hovo;

public class ExampleArgs {
      static void test(int...v){
        System.out.print("length is : " + v.length + " " + "numbers is: ");
          for(int x:v){
              System.out.print(x + " ");
          }
          System.out.println();

    }

    public static void main(String[] args) {
        test(7,797,970,7,88);
        test();

        }
      }
