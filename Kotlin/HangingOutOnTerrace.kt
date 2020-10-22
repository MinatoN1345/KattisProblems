fun main(args: Array<String>) {
    var limitAndEvent = readLine()!!.split(" ")

    val limit = limitAndEvent[0].toInt()
    val events = limitAndEvent[1].toInt()
    var currentAmount = 0
    var denials = 0

    for (event in 1..events) {
        var input = readLine()!!.split(" ")

        var action = input[0]
        var peopleAmount = input[1].toInt()

        if(action.equals("enter"))
        {
            if(currentAmount + peopleAmount <= limit)
            {
                currentAmount += peopleAmount
            }
            else
            {
                denials++
            }
        }
        else if(action.equals("leave"))
        {
            if(currentAmount - peopleAmount >= 0 || peopleAmount  < currentAmount)
            {
                currentAmount -= peopleAmount
            }
        }
    }
    println(denials)
}
