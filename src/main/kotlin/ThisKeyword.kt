fun main(args:Array<String>){
var note = PostItNote()
    note.printMessage()
    note.updateMessage("Meeting is 5 pm")
    println(note.message)
}

class PostItNote() {
    var message: String = "No message"
    fun updateMessage(message: String) {
        this.message = message
    }
    fun printMessage( ) {
        println(this.message)
    }
}