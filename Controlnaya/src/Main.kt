import Kinoteatr.*
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

suspend fun main()= coroutineScope {
    try {
        var name: String=""
        var price: Double=0.0
        var countpos: Int=0
        var zal: Int=0
        println("Введите кол-во повторений")
        var num: Int = readln().toInt()
        val film = Cinema(name, price, countpos, zal)
        for (i in 0..num) {
        launch {
            film.Input()
            }
            runBlocking { delay(15000L) }
            film.Info()
            film.Quality()
            film.Sum()
        }
    }catch (ex:Exception){
        println(ex.message)
    }



}
