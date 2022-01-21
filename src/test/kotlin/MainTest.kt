import org.junit.jupiter.api.Test

class MainTest {

    @Test
    fun firstTest() {
        val tasks1 = "T1006"
        val tasks2 = "T1007, T1008, T1009"
        val taskArray = arrayOf(tasks1, tasks2)
        Main.getResultList(tasks1, taskArray)
    }

}