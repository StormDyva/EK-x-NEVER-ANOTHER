package com.example.neveranother

import com.example.neveranother.viewModel.NAViewmodel
import org.junit.Assert.assertEquals
import org.junit.Test

class NAViewmodelTest {


    //Upper measurement tests
    @Test
    fun `Upper stores input`() {
        val vm = NAViewmodel()
        vm.updateUpperMeasure("85")
        assertEquals("85", vm.upperMeasure.value)
    }

    @Test
    fun `Upper valid number`() {
        val vm = NAViewmodel()
        assertEquals(true, vm.updateUpperMeasure("85"))
    }

    @Test
    fun `Upper minimum valid`() {
        val vm = NAViewmodel()
        assertEquals(true, vm.updateUpperMeasure("77"))
    }

    @Test
    fun `Upper too low`() {
        val vm = NAViewmodel()

        vm.updateUpperMeasure("77")
        assertEquals(true, vm.isUpperMeasure1Valid.value)
    }

    @Test
    fun `Upper rejects text`() {
        val vm = NAViewmodel()
        assertEquals(false, vm.updateUpperMeasure("abc"))
    }

    @Test
    fun `Upper rejects empty`() {
        val vm = NAViewmodel()
        assertEquals(false, vm.updateUpperMeasure(""))
    }

    @Test
    fun `Upper rejects symbols`() {
        val vm = NAViewmodel()

        vm.updateUpperMeasure("@")

        assertEquals(false, vm.updateUpperMeasure(String()))
    }



//Lower measurements

    @Test
    fun `Lower stores input`() {
        val vm = NAViewmodel()

        vm.updateLowerMeasure("80")

        assertEquals("80", vm.lowerMeasure.value)
    }

    @Test
    fun `Lower valid number`() {
        val vm = NAViewmodel()

        vm.updateLowerMeasure("80")

        assertEquals(true, vm.updateLowerMeasure(String()))
    }

    @Test
    fun `Lower minimum valid`() {
        val vm = NAViewmodel()

        vm.updateLowerMeasure("60")

        assertEquals(true, vm.updateLowerMeasure(String()))
    }

    @Test
    fun `Lower maximum valid`() {
        val vm = NAViewmodel()

        vm.updateLowerMeasure("100")

        assertEquals(true, vm.updateLowerMeasure(String()))
    }

    @Test
    fun `Lower too low`() {
        val vm = NAViewmodel()

        vm.updateLowerMeasure("59")

        assertEquals(false, vm.updateLowerMeasure(String()))
    }

    @Test
    fun `Lower too high`() {
        val vm = NAViewmodel()

        vm.updateLowerMeasure("101")

        assertEquals(false, vm.updateLowerMeasure(String()))
    }

    @Test
    fun `Lower rejects text`() {
        val vm = NAViewmodel()

        vm.updateLowerMeasure("abc")

        assertEquals(false, vm.updateLowerMeasure(String()))
    }

    @Test
    fun `Lower rejects empty`() {
        val vm = NAViewmodel()

        vm.updateLowerMeasure("")

        assertEquals(false, vm.updateLowerMeasure(String()))
    }

    @Test
    fun `Lower rejects symbols`() {
        val vm = NAViewmodel()

        vm.updateUpperMeasure("@")

        assertEquals(false, vm.updateUpperMeasure(String()))
    }

}