package com.gudvin.scalafunctions

/**
  * Created by vinita on 6/27/16.
  */
object FoldLeftAndReduceWorking {
  def main(args: Array[String]) {
    val data = Seq("A","B","C","D","E","F")

    // foldLeft
    val foldLeftOut = data.foldLeft("0")(concatMyInput)
    println(foldLeftOut)

     // Reduce
    val reduceOut = data.reduce(concatMyInput)
    //println(reduceOut)

  }

  def concatMyInput(lastOutput: String, input: String): String ={

    val currentOutput = lastOutput+input
    println("-------------")
    println("lastOutput = "+lastOutput)
    println("input = "+input)
    println("currentOutput = "+currentOutput)
    println("-------------\n")
    currentOutput
  }
}
