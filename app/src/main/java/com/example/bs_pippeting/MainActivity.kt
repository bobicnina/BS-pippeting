package com.example.bs_pippeting

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        ustvariNacrt(
            96,
            arrayOf(arrayOf("s1"), arrayOf("s1", "s2", "s3"), arrayOf("s3"), arrayOf("s1")),
            arrayOf(arrayOf("r1", "r2"), arrayOf("r3"), arrayOf("r8", "r5", "r6"), arrayOf("r7", "r8", "r9", "r10", "r11", "r12", "r13")),
            intArrayOf(1, 2, 4, 2),
            1
        );
    }

    private fun ustvariNacrt(
        velikostPlosce: Int,
        imenaVzorcev: Array<Array<String>>,
        imenaReagentov: Array<Array<String>>,
        ponovitve: IntArray,
        najvecPlosc: Int
    ){

        var vrstice: Int = 0;
        var stolpci: Int = 0;

        when (velikostPlosce) {
            384 -> {
                vrstice = 16;
                stolpci = 24;
            }
            96 -> {
                vrstice = 8;
                stolpci = 12;
            }
            else -> throw IllegalArgumentException("Velikost plošče ni pravilna.");
        }

        val numberOfAllExperiments = ponovitve.sum();

        var eksperimenti = arrayOfNulls<Array<Array<String>>>(imenaVzorcev.size);

        for (i in 0..imenaVzorcev.size){
            for (j in 0..imenaVzorcev[i].size){
                for (k in 0..imenaReagentov[j].size) {
                    eksperimenti[i] = arrayOf(arrayOf(imenaVzorcev[i][j], imenaReagentov[i][k]));
                    println(eksperimenti[i].contentDeepToString());
                }
            }
        }
    }
}