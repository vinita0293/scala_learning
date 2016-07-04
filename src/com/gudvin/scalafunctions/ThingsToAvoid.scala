package com.gudvin.scalafunctions

/**
  * Created by vinita on 6/27/16.
  */
object ThingsToAvoid {
  def main(args: Array[String]) {

    val data = Seq("A","B","C","D","E","F")
    var a = ""
    data.foreach(x => {
      a = a+x
    })
  }
}
