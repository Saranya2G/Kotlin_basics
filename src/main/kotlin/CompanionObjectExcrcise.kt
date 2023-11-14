fun main(args:Array<String>){
val myBook = Book(Book.getEditor())
    println(myBook.editor.editorName)
}

//A book class will provide information about the editor without the need to be instantiated.
//It will also require this information - in the form of an editor object type - in the constructor.
//Implement this in a program.

class Book(var editor: Editor){
    companion object{
    fun getEditor() = Editor("O'Reilly")
    }
}
class Editor(val editorName:String){

}