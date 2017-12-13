package algorithm

object SortByGet {

    fun execute(values: Array<Int>): Array<Int> = sort(values).toTypedArray()


    private fun sort(values: Array<Int>): List<Int> {

        var sorted = arrayListOf<Int>()
        var elements = mutableListOf<Int>(*values)

        val minElement: Int? = values.min()
        if (minElement != null) {
            sorted.add(minElement)
            elements.remove(minElement)
            sorted.addAll(sort(elements.toTypedArray()))
        }

        return sorted
    }
}