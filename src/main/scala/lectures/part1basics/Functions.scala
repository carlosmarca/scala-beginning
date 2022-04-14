package lectures.part1basics

object Functions extends App {

  def Function(a: String, b: Int): String = {
    a + " " + b
  }
  println(Function("hello", 3)) // hello 3

  def Suma(a: Int, b: Int) = {
    a + b
  }
  println(Suma(2, 3)) // 5

  def ParameterlessFunction(): Int = 10
  println(ParameterlessFunction()) // 10

  // WHEN YOU NEED LOOPS, USE RECURSIVE.
  def RecursiveFunction(string: String, n: Int): String = {
    if (n == 1) string else string + RecursiveFunction(string, n-1)
  }
  println(RecursiveFunction("hello", 3)) // hellohellohello

  def Factorial(n: Int): Int = {
    if (n <= 0) 1
    else n * Factorial(n-1)
  }
  println(Factorial(5)) // 120

  def Fibonacci(n: Int): Int = {
    if (n <= 2) 1
    else Fibonacci(n-1) + Fibonacci(n-2)
  }
  println(Fibonacci(8)) // 21

  def isPrime(n: Int): Boolean = {
    def isPrimeUntil(t: Int): Boolean =
      if (t <= 1) true
      else n % t != 0 && isPrimeUntil(t-1)
    isPrimeUntil(n / 2)
  }
  println(isPrime(2)) // true
  println(isPrime(4)) // false
}
