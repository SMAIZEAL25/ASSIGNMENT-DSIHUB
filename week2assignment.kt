fun main(args: Array<String>) {
    // TO PRINT NUMBER FROM 1 - 100
    for (i in 1..100) {
        println(i)
    }
    // print 1 to 10
    for (i in 1..10) {
        if (i == 3)
            continue
        println(i)

    }

    // IF STATEMENT WITH WHEN KEYWORD
    var X = 44
    var z = 60
    var k = 20
    var l = 25
    var m = 30
    if (X < 12) {
        println("Child")
        when (X) {
            44 -> println("X is equal to 44")
            60 -> println("Z is equal to 60")
            20 -> println("k is eaual to 20")
            25 -> println("l is equal to 25")
            30 -> println("m is equal to 30")
            else -> println("Invalid")
        }

    }
}