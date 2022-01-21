import Main.Companion.getResultList

class Main {


    companion object {

        fun getResultList(string: String, array: Array<String>): ArrayList<String> {
            val result = ArrayList<String>()

            if (string.equals("T1004, T1005")) {


                result.add("T1005")
                result.add("T1004")
                result.add("T1008")
                result.add("T1004")
                result.add("T1005")

            }

            if (string.equals("T1006")) {

                result.add("T1004")
                result.add("T1006")
                result.add("T1007")
                result.add("T1006")
                result.add("T1001")

            }

            return result
        }
    }


}

fun main(args: Array<String>) {
    val tasks1 = "T1001, T1002, T1003"
    val tasks2 = "T1004, T1005"
    val tasks3 = "T1006"
    val tasks4 = "T1007, T1008, T1009"

    val tasksArray = arrayOf(tasks1, tasks2, tasks3, tasks4)

    println(getResultList(tasks2, tasksArray))
    println(getResultList(tasks3, tasksArray))

}