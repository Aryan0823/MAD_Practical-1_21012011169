fun main()
{
    print("Enter a month number = ")
    val monthnum = Integer.valueOf(readLine())
    val result = when (monthnum)
    {
        1 -> "January"
        2 -> "Febuary"
        3 -> "March"
        4 -> "April"
        5 -> "May"
        6 -> "June"
        7 -> "July"
        8 -> "August"
        9 -> "September"
        10 -> "October"
        11 -> "November"
        12 -> "December"
        else -> "Enter A Valid Month"
    }
    println(result)
}