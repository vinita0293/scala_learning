package com.gudvin.scalafunctions

/**
  * Created by vinita on 6/26/16.
  */
object MapWorking {

  def main(args: Array[String]) {
    val sampleDataString: Seq[String] = Seq("Line1", "Line2", "Line3")
    val sampleDataInt: Seq[String] = Seq("1", "2", "3")

    // ------ 1
    val countOfWords = sampleDataString.map(line => {
      line.split("").size
    })

    // ------ 2
    val countOfWordsShorter = sampleDataString.map(_.split("").size)
    countOfWordsShorter.foreach(println)

    // ------ 3
    val countOfWordsFunctional = sampleDataString.map(line => getCountOfWords(line))
    countOfWordsFunctional.foreach(println)

    // ------ 4
    val countOfWordsMoreFunctional = sampleDataString.map(getCountOfWords)


    countOfWordsMoreFunctional.foreach(println)

    println("Count")
    countOfWords.foreach(transformedLine => println(transformedLine))

    println("Converted to Integer")
    sampleDataInt.map(line => {line.toInt}).foreach(line => println(line))
  }
  def getCountOfWords(input: String): Int ={
    input.split("").size
  }
}
