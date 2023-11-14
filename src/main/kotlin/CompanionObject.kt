import kotlin.random.Random

fun main(args:Array<String>){
    //we can access the fun without creating object of the class

    println(Car4.getDrivingInstructions())

    var course = KotliCourse()
    course.korlincoursInfo()

    println(KotliCourse.getCourseInfo())

    val correctkey = Lock.creatKey()
    val myLock = Lock(correctkey)
    myLock.unlock(correctkey)

    val randomKey = Lock.creatKey()
    myLock.unlock(randomKey)
}

class Car4 {
    companion object {
        fun getDrivingInstructions( ): String {
            return "Drive safe"
        }
    }
}

//practice
//A class KotlinCourse will provide Kotlin information.
//It will also provide some general information about the course without needing an object to be created.
//Implement this functionality in a program and display the generalinformation.

class KotliCourse{
    fun korlincoursInfo(){
        println("Kotlin is java based language")
    }

    companion object{
        fun getCourseInfo(){
            println("Kotlin is easy to learn")
        }
    }
}

//practice
//A lock needs a key. The lock class will provide the ability to create key classes without the need
//for an object. To create the lock, a key must be provided in the constructor.
//It thensets a secret code variable in both the lock and the key, binding themtogether.
//To open the lock, a key with the same secret code value must beprovided.
//Implement this functionality in a program.

class Lock(key: Key){
    var secretCode: String
    init {
        secretCode = generateSecret()
        key.secretCode = secretCode
    }
    companion object{
        fun creatKey() = Key()
    }
    fun generateSecret(): String{
        return Random(System.currentTimeMillis()).nextInt().toString()
    }
    fun unlock(key: Key){
        if(key.secretCode == secretCode)
            println("Lock is open")
        else
            println("Key is not correct")
    }
}

class Key{

    var secretCode: String = ""
        set(value) {
            if(field == ""){
                field = value
            }
        }
}









