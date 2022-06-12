package sort

fun main() {
    val array = arrayOf(7, 8, 3, 1, 2)
    selectionSort(array)

    // printing array
    for (i in 0..array.size){ print(i) }
}

// Selection sort algorithm
fun <T: Comparable<T>> selectionSort(array: Array<T>) {
    val arrayLength = array.size-1
    for (i in 0..arrayLength) {
        var smallest = i
        var j = i+1
        for (j in 0..arrayLength) {
            if (array[i] > array[j]) {
                smallest = j
            }
        }
        val temp = array[smallest]
        array[smallest] = array[i]
        array[i] = temp
    }
}