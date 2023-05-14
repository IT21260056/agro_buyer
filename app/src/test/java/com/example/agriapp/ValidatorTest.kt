package com.example.agriapp

import com.google.common.truth.Truth.assertThat
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4

@RunWith(JUnit4::class)
class ValidatorTest{

    @Test
    fun whenInputIsValid(){

        val name = "viduth"
        val cropName = "Carrot"
        val location = "malabe"
        val amount = 10

        val result = Validator.validateInput(name,cropName,location, amount)

        assertThat(result).isEqualTo(true)
    }

    @Test
    fun whenInputIsInValidAmount(){

        val name = "viduth"
        val cropName = "Carrot"
        val location = "malabe"
        val amount = -10

        val result = Validator.InvalidateInputAmount(name,cropName,location, amount)

        assertThat(result).isEqualTo(false)
    }

    @Test
    fun whenInputIsInValidName(){

        val name = ""
        val cropName = "Carrot"
        val location = "malabe"
        val amount = 10

        val result = Validator.InvalidateInputName(name,cropName,location, amount)

        assertThat(result).isEqualTo(false)
    }

    @Test
    fun whenInputIsInValidCropName(){

        val name = "viduth"
        val cropName = ""
        val location = "malabe"
        val amount = 10

        val result = Validator.InvalidateInputCropName(name,cropName,location, amount)

        assertThat(result).isEqualTo(false)
    }

    @Test
    fun whenInputIsInValidNameAmount(){

        val name = "viduth"
        val cropName = "carrot"
        val location = "pannala"
        val amount = -10

        val result = Validator.InvalidateInputNameAmount(name,cropName,location, amount)

        assertThat(result).isEqualTo(false)
    }



}

