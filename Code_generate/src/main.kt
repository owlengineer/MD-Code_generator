import com.example.Server
import java.io.File

//import com.example.Generator
//import com.example.ProgramParameters
//import java.lang.Integer.parseInt
//
//val ERROR_TEXT = "Ошибка ввода. Попробуйте снова.\n\n"

fun main(args: Array<String>) {
    val server = Server()

//    val args_: MutableList<String> = mutableListOf()
//    args_.addAll(args[0].split(' '))
//    if (!args_.isEmpty()) {
//        if ((parseInt(args_[0]) == 1 && args_.size >= 8) || (parseInt(args_[0]) == 3 && args_.size == 7)
//            || ((parseInt(args_[0]) == 2 || parseInt(args_[0]) == 4 || parseInt(args_[0]) == 5 || parseInt(args_[0]) == 6) && args_.size == 6)
//            || (parseInt(args_[0]) == 7 && args_.size == 11)) {
//            val parameters = ProgramParameters(args_)
//            val generator = Generator(parameters)
//
//            generator.programGenerate()
//            generator.runtime()
//        }
//        else println(ERROR_TEXT)
//    }
//    else println(ERROR_TEXT)
}

fun readFile(fileName: String) = File(fileName).inputStream().readBytes().toString(Charsets.UTF_8)
