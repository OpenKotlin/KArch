package com.openkotlin.karch

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }

    // StringBuild/StringBuffer 默认大小是16kb. 当发生扩容的时候,将会创建2倍.

    // ArraryList/Vector 默认大小是10个List. 当发生扩容的时候,将会创建1.5倍的大小,并且会调用ArraryList.copy()拷贝整个list

    // HashMap/HashTable 默认是16大小,负载因子是:0.75. 扩容出发为:当前定义的大小*负载因子 > 实际大小


    //LinkedList基于链表实现的. ArraryList是基于数组数显的. 由于数组是连续空间,所以当插入操作在第一个的时候,ArraryList性能最差.
}
