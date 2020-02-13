import java.util.Scanner
fun main(args:Array<String>){
    val scan : Scanner = Scanner(System.`in`)
    var n : Int
    var flag : Boolean=true
    while(true) {
        flag=true
        println("정수 n을 입력하시오.(0 입력 시 종료)")
        n=scan.nextInt()
        if(n==0){
            println("종료")
            break
        }
        for (i in n - 1 downTo 2) {
            if (n % i == 0) {
                flag = false
                break;
            }
        }
        if (flag == false) println("n은 소수가 아닙니다.")
        else println("n은 소수 입니다.")
    }
}