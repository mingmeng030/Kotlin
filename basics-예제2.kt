import java.util.Scanner
fun main(args:Array<String>) {
    val scan: Scanner = Scanner(System.`in`)
    var n: Int
    var start : Int
    var space : Int
    println("자연수 n을 입력하시오")
    n=scan.nextInt()
    if(n%2==0) {
        start=2
        space=(n/2)-1
    }
    else {
        start=1
        space=(n/2)
    }
    for (i in start..n step 2){
        for(j in 0..space-1){
            print(" ")
        }
        space--
        for(k in 0..i-1){
            print("*")
        }
        println()
    }
}