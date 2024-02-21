import java.util.ArrayList
import java.util.Scanner

val reader = Scanner(System.`in`)
fun main() {
    var unsortedArray = arrayListOf<Int>(5, 4, 3, 2, 1)

    fun search(arrayList: ArrayList<Int>) {
        print("search Element: ")
        val elementToSearch = readLine()!!.toInt()
//    var smallest=unsortedArray[0]
        for ((index, element) in unsortedArray.withIndex()) {
            if (element == elementToSearch) {
                println("$elementToSearch is found at index $index")
            }
        }

    }

    fun sort(arrayList: ArrayList<Int>): ArrayList<Int> {
        val n = arrayList.size
        for (i in 0 until n - 1) {
            for (j in 0 until n -  1) {
                if (arrayList[j] > arrayList[j + 1]) {
                    val temp = arrayList[j]
                    arrayList[j] = arrayList[j + 1]
                    arrayList[j + 1] = temp
                }
            }
        }
        print(arrayList)
        return arrayList

    }

//    search(arrayList = unsortedArray)
    sort(arrayList = unsortedArray)


}
