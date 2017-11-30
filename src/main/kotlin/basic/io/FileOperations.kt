package basic.io

import java.io.File

/**
 * Created by Bogumil Zebek on 2017-11-24.
 */
fun fileReader(fileName:String){

    File("locations.txt").reader().forEachLine {  }
}