public class CtoFTester{
  public static void main(String[] args){
    System.out.println(CtoFTester(10));
    System.out.println(FtoCTester(68));
  }
  public static double CtoFTester(int temp) {
    return (9.0 / 5) * temp + 32; }
  public static double FtoCTester(int temp) {
    return (temp - 32) * (5.0 / 9); } }
