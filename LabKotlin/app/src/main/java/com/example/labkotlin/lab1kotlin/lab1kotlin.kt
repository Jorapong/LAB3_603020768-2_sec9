package com.example.labkotlin.lab1kotlin

fun main(){
    var subjectscore = arrayOf(57,77,89,61,75)
    println("there are "+subjectscore.size+" subject in array.")
    CalGrade(subjectscore)
}
fun CalGrade(subjectArr : Array<Int>){
    var i : Int = 1
    var grade : String
    var g:Int
    for(value in subjectArr){
        when{
            value < 50 -> {grade="F";g=1}
            value < 55 -> grade="D"
            value < 60 -> grade="D+"
            value < 65 -> grade="C"
            value < 70 -> grade="C+"
            value < 75 -> grade="B"
            value < 80 -> grade="B+"
            else -> grade="A"
        }
        println("Grade of Subject Number $i = $grade")
        i++
    }
}