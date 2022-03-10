//1. Given a string “codeHive”. Write a function that prints out a string composed
//of the fifth, sixth, seventh and eighth  characters of the string (2 points)
//2. Create and invoke a function that given two numbers returns the
//remainder of their division (3 points)
//3. Write a function that takes in two parameters, name and age and returns a
//String with this structure “Hi, my name is p and I am z years old.” Where p
//and  z are your  name and age respectively. (3 points)
//Write a function that takes in a string and returns its length(2 points)
fun main(){
    word("CodeHive")
     statement( "Ahimbisibwe prudence","24")
    count()

}
fun word(text:String){
    val x = text[4].toString() + text[5] + text[6] + text[7]
    println(x)
}
fun statement(name:String,age:String){
    val z = "Hi, my name is $name and I am $age years old."
    println(z)
}
fun count() {
    val t = "prudence"
    println(t.length)
}





