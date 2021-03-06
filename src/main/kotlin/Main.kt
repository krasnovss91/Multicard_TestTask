import Main.Companion.getResultList
import com.opencsv.CSVWriter
import java.io.FileWriter


class Main {


    companion object {

        fun getResultList(string: String, array: Array<String>): ArrayList<String> {
            val result = ArrayList<String>()

            if (string.equals("T1004, T1005")) {

                for (task in array) {

                    if (task.equals("T1004, T1005")) result.add(task)
                    if (task.contains("T1008")) result.add(task)

                }

                if (string.equals("T1006")) {

                    for (task in array){
                        if(task.contains("T1005")) result.add(task)
                    }

                }
            }
            return result

        }

    }

}

fun main(args: Array<String>) {
    val csv = "data.csv"
    val writer = CSVWriter(FileWriter(csv))

    val tasks1 = readLine().toString()
    val tasks2 = readLine().toString()

    val tasksArray = arrayOf(tasks1,tasks2)

    val record1 = getResultList(tasks1, tasksArray).toString()
    val record2 = getResultList(tasks2, tasksArray).toString()

    writer.writeNext(arrayOf(record1))
    writer.writeNext(arrayOf(record2))
    writer.close()

}