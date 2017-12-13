package algorithm

import org.assertj.core.api.Assertions
import org.junit.Test


class SortByGetTest{

    @Test
    fun `should return sorted list of elements in asc order`(){
        Assertions.assertThat(SortByGet.execute( arrayOf(1,6,3,7,5,10,9,2))).isEqualTo(arrayOf(1,2,3,5,6,7,9,10))
        Assertions.assertThat(SortByGet.execute( arrayOf(-1,-6,-3,-2))).isEqualTo(arrayOf(-6,-3,-2,-1))
    }

    @Test
    fun `should return empty list of elements when imput is empty`(){
        Assertions.assertThat(SortByGet.execute( emptyArray<Int>())).isEqualTo(emptyArray<Int>())
    }
}