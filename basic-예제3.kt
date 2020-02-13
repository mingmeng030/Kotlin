fun main(args : Array<String>){
    val a= arrayOf(1,3,6,7,8,11,18) //a.size=7
    val b= arrayOf(2,5,9,15,17,22) //b.size=6
    var i=0
    var a_now=0
    var b_now=0
    var result =arrayOfNulls<Int>(a.size+b.size)
    while(a_now<a.size-1&&b_now<=b.size-1){
        if(a[i]<b[i]){
            result[i]=a[i]
            a_now++
        }
        else{
            result[i]=b[i]
            b_now++
        }
        i++
    }
    if(a_now==a.size-1) {
        for(j in i..result.size-1){
            result[i]=b[b_now]
            b_now++
        }
    }
    else if(b_now==b.size-1){
        for(j in i..result.size-1){
            result[i]=a[a_now]
            a_now++
        }
    }
    for(k in 0..result.size-1){
        print(result[k])
        print(" ")
    }
}