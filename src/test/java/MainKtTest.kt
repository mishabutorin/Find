import org.junit.Assert.assertThrows
import org.junit.jupiter.api.Test
import java.lang.Exception

class MainKtTest {
@Test

fun main() {

        assertThrows(Exception::class.java) {main(arrayOf("-d testfolder 1name.txt"))}

}
}