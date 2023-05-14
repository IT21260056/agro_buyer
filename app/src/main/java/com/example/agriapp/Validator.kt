package com.example.agriapp

object Validator  {
    fun validateInput ( name:String, cropName:String, location:String, amount:Int): Boolean {

        return !( amount <= 0 || name.isEmpty())
    }

    fun InvalidateInputAmount ( name:String, cropName:String, location:String, amount:Int): Boolean {

        return !( cropName.isEmpty() || location.isEmpty())
    }

    fun InvalidateInputName ( name:String, cropName:String, location:String, amount:Int): Boolean {

        return !( name.isEmpty())
    }

    fun InvalidateInputCropName ( name:String, cropName:String, location:String, amount:Int): Boolean {

        return !( cropName.isEmpty())
    }

    fun InvalidateInputNameAmount ( name:String, cropName:String, location:String, amount:Int): Boolean {

        return !(amount <= 0 || name.isEmpty())
    }
}