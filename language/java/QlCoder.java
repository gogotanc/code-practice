public class QlCoder {
  public static void main(String[] args) {
    int count = 0;
    int num = 0;
    while(true) {
      count++;
      if ((count % 2) == 0 || (count % 3) == 0) {
        num++;
        if (num == 2333) {
          System.out.println(count);
          return;
        }
      } 
    }
  }
}
