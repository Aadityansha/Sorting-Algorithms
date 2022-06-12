package sort

fun main() {
    val array = arrayOf(7, 8, 3, 1, 2)
    insertionSort(array)

    // printing array
    for (i in 0..array.size){ print(i) }
}

// Insertion sort algorithm
fun <T: Comparable<T>> insertionSort(array: Array<T>) {
    var arrayLength = array.size
    var i = 1
    for (i in 0..arrayLength) {
        var current = array[i]
        var j = i-1
        while (j >= 0 && current < array[j]) {
            array[j+1] = array[j]
            j--
        }
        array[j+1] = current
    }
}