object main extends App{
    //Q1
    def isPrimeNum(n: Int, i :Int = 2):Boolean = {
        if (n <= 2) {
            if (n == 2) true else false
        } else if (n % i == 0) {
            false
        } else if (i * i > n) {
            true
        } else {
            isPrimeNum(n, i + 1)
        }
    }
    //Q2
    def primeSeq(n: Int, i: Int = 2): Unit = {
        if (i < n) {
            if (isPrimeNum(i)) {
                print(i + ", ")
            }
            primeSeq(n, i + 1)
        }
    }
    //Q3
    def sum(n: Int): Int = {
        if(n <= 1){
            1
        }else{
            n + sum(n - 1)
        }
    }
    //Q4
    def isEven(n: Int): Boolean = {
        if (n == 0) {
            true
        } else if (n == 1) {
            false
        } else {
            isEven(n - 2)
        }
    }
    //Q5
    def AddEven(n: Int): Int = {
        if(n <= 1){
            1
        }else{
            if(n % 2 == 1){
                n + AddEven(n - 1);
            }else{
                AddEven(n - 1)
            }
        }
    }
    //Q6
    def printFibonacci(n: Int): Unit = {
        for (i <- 0 until n) {
            print(fibonacci(i) + " ")
        }
    }

    def fibonacci(n: Int): Int = {
        if (n <= 1) {
            n
        } else {
            fibonacci(n - 1) + fibonacci(n - 2)
        }
    }

    println(isPrimeNum(6))
    primeSeq(10)
    println("\n"+sum(10))
    println(isEven(9))
    println(AddEven(10))
    printFibonacci(7)
}