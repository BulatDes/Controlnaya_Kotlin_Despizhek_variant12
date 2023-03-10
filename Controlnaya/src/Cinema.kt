package Kinoteatr
class Cinema(name:String,price:Double,countpos:Int,var zal:Int):Film( name, price, countpos) {
     fun Info(){
         println("Фильм: ${this.name} \nЗал:$zal")
     }

    override fun Quality() {
        super.Quality()
    }

    public fun Input(){
        try {
            println("Введите название фильма")
            name = readln()
            println("Введите стоимость билета")
            price = readln().toDouble()
            println("Введите кол-во посетителей")
            countpos = readln().toInt()
            println("Введите номер зала кинотеатра")
            zal = readln().toInt()
            if (price < 0 || countpos < 0 || zal <= 0) {
                throw Exception("Error")
            }
        }catch (ex:Exception){
            println(ex.message)
        }
    }

}