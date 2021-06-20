// multiple of 3

Fun main(){
    int i = 0;
    for (i = 1; i < 101; i++)
    {
        if (i % 3 == 0)
                println("%d ", i);
    }
    return 0;
}
// MULTIPLE OF 5
Fun main(){
    int s = 0;
    for (i = 1; i < 101; i++)
    {
        if (i % 5 == 0)
                println("%d ", i);
    }
    return 0;
}



// TO RESERVES STRINGS

fun main(args: Array) {
    //1
    val scanner = Scanner(System.`in`)

    //2
    println("Enter the string : ")
    var str = scanner.next()

    //3
    println(reverseStr(str))
}

//4
fun reverseStr(str: String): String{
    //5
    if(str.isEmpty())
        return str
    //6
    return reverseStr(str.substring(1)) + str[0]
}


// MUTIPLE OF 3 AND 5

public class Test1 {
    public static void main(String[] args) {
        // Define the sum variable
        var sum int  = 0;

        for(int i = 1 ; i <= 100 ; i++){

            if(i % 3 == FUZZ && i % 5 == BUZZ){
                sum += i;
            }
        }

        System.out.println ("The multiple of 3 is the sum of 5 multiples of numbers:" + sum);

    }
