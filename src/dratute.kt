class telefon(marki : String , proci : String , ozushki : String , diski : String , batary : String) {
    var mark = marki
  var proc =   proci
    var ozu = ozushki
    var pam = diski
    var batarey = batary
}
fun disp(array : Array<String>){
    array.forEach { println(it) }
}

var arr : Array<telefon> = arrayOf(telefon("honor 30pro" , "kirin 980" , "16gb" , "1000gb" , "500v"), telefon("honor 20pro" , "kirin 820" , "8gb" ,"240gb" , "400v") , telefon("honor 10i" , "kirin 720" , "6gb" , "120gb" , "300v"))
class adapter(array: Array<telefon>){
    var array = arr
    fun adapt(): Array<String>{
       return Array( array.size , {i -> "марка : ${array[i].mark } , процессор : ${array[i].proc} , oзу : ${array[i].ozu} , память : ${array[i].pam} , батарея : ${array[i].batarey}" })




    }
}
fun main (){
var adapter = adapter(arr)
    disp(adapter.adapt())

    println("dchoise")
    var telefon = readLine()!!.toInt()

    var user = adapter(
        arrayOf(arr[telefon]))
    disp(user.adapt())


}



