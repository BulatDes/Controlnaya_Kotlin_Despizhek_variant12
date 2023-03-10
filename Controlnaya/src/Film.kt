package Kinoteatr
abstract class Film(var name:String, var price:Double,var countpos:Int):Kino{

    override fun Sum(){
        println("За сеанс фильм заработал ${price*countpos}")
    }

    override  fun Quality() {
        when(countpos){
            in 0..20->println("Плохой фильм")
            in 21..50->println("Неплохой фильм")
            in 51..100->println("Хороший фильм")
            in 100..200-> println("Отличный фильм")
            else-> println("Самый лучший фильм на свете")
        }
    }

}