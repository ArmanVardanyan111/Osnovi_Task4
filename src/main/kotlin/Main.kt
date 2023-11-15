fun main(args: Array<String>) {
    println("Введите два числа через пробел и мат. оерацию")
    var str = readln()

    var num1:Double = 0.235165746846748476445673
    var num2:Double = 0.235165746846748476445673
    var oper:Char = '`'

    var strNum = ""
    for (i in 0 until  str.length)
    {
        if (str[i] != ' ')
        {
            strNum += str[i]
        }
        else
        {
            if (num1 == 0.235165746846748476445673)
            {
                num1 = strNum.toDouble()
                strNum = ""
            }
            else
            {
                if (num2 == 0.235165746846748476445673)
                {
                    num2 = strNum.toDouble()
                    strNum = ""
                }
            }
        }
        oper = str[str.length-1]
    }

    print("" + num1 + " " + oper + " " + num2 + " = ")

    if (oper == '+')
        println(num1+num2)
    else if (oper == '-')
        println(num1-num2)
    else if (oper == '*')
        println(num1-num2)
    else if (oper == '/')
        println(num1-num2)
    else println("ERROR")
}