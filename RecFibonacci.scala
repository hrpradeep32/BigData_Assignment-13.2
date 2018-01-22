import scala.io.StdIn;
object RecFibaonacci {
  def findFib(getinput: Int): Int = {
    if (getinput == 1 || getinput == 2) {
      return 1;
    } else {
      return findFib(getinput - 1) + findFib(getinput - 2);
    }
  }

  def main(args: Array[String]) {
    print("Enter a number to find the Nth number using recursive fibonacci: ");
    val getinput = StdIn.readInt();

    println("Nth number using 'RECURRSION' is : "
      + findFib(getinput));
  }
}