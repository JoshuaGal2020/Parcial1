package com.example.practicaparcial1

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //ejercicio1()
        //ejercicio2()
        ejercicio3()
    }
    private fun ejercicio1(){
        var color = "Morado"

        if (color == "Amarillo"){
            println("Color Seleccionado es: $color")
        }
        else if (color == "Rojo"){
            println("Color Seleccionado es: $color")
        }
        else if (color == "Anaranjado"){
            println("Color Seleccionado es: $color")
        }
        else if (color == "Plateado"){
            println("Color Seleccionado es: $color")
        }
        else{
            println("El color seleccionado no forma parte de nuestro inventario")
        }

    }
    private fun ejercicio2() {
        val TipodeComida = "Pupusas"

        when (TipodeComida) {
            "Pupusas" -> {
                println("Comida tipica es El Salvador")
            }
            "Tacos" -> {
                println("Comida tipica es de Mexico")
            }
            "baleada" -> {
                println("Comida tipica de Honduras")
            }
            "Jamon" -> {
                println("Comida tipica Española")
            }
            "Suchi" -> {
                println("Comida tipica de Japon")
            }
            "Pasta" -> {
                println("Comida tipica Italiana")
            }
            else ->{
                print("Comida no registrada en nuestra base")
            }
        }
        //Agrupacion en un When
        when(TipodeComida){
            "Pupusas","Elotes locos","Platano frito" ->{
                println("comida tipica Salvadoreña")
            }
        }
    }//final fun 2

    private fun ejercicio3(){
        for (x in 0..10) {
            println(x)
        }
        for(x in 0..20 step 2){
            println(x)
        }
        for(x in 10 downTo 0 step 1){
            println(x)
        }
        for(x in 9 downTo 0 step 3){
            println(x)
        }

    }//fianl fun 3
}