import java.io.File
import java.io.Reader
import java.lang.Exception
import java.lang.reflect.Executable

fun main (args: Array<String>)
{
    var finds = false
    var path = ""
    var naming = ""
    var recursive = false
    for (i in args.indices) {
        if (args[i] == "-r")
            recursive = true
    }
    if ((recursive) && (args[1] == "-d")) {
        path = args[2]
        naming = args[3]
        for (i in File(path).walkTopDown()) {
            if (i.name == naming) {
                print(i)
                finds = true
            }
    }
    }
    else if ((!recursive) && (args[0] == "-d")) {
        path = args[1]
        naming = args[2]
        for (i in File(path).list()) {
            if (i == naming) {
                print(i)
                finds = true
            }
        }
    }
    else {
        println("Чтобы программа работала корректно нужно ввести: [-r](опционально) [-d directory] %filename")
        throw IllegalArgumentException()
    }
    if (!finds)
        throw Exception("File not found")
}




