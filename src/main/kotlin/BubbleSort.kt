package sort

fun main() {
    val array = arrayOf(7, 8, 3, 1, 2)
    bubbleSort(array)

    // printing array
    for (i in 0..array.size){ print(i) }
}

// Bubble sort algorithm
fun <T : Comparable<T>> bubbleSort(array: Array<T>) {
    val arrayLength = array.size-1
    for (i in 0..arrayLength) {
        for (j in i..0){
            if (array[j] > array[j+1]) {
                val temp = array[j]
                array[j] = array[j+1]
                array[j+1] = temp
            }
        }
    }
}