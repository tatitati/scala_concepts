//
// Basic class
//
class User(named: String, var surname: String, val weight: Int){
    println("this was created!") // is executed everytime an object is created
    val age: Int = 34
    def greet() {
        println(s"Hi ${named}")
    }
}
var user = new User("manolo", "Gutierrez", 80) // this was created!

//
// default, var, val accessibility
//
// about getters:
// println(user.named) // with no var/avl. Error: Not generated getters/setters
println(user.surname) // with var, getters are generated by default
println(user.weight) // we val, getters are generaged by default

// about setters:
// user.named = "asdasdf" // with no var/val then no setters/getters
user.surname = "a new surname" // with var, setters are generated by default
// user.weight = 230 // with val, setters are not generated by default


println(user.age) // 34
//
// function invokation
//
user.greet // hi manolo
user.greet() // hi manolo



//
// Extending a class with args in constructor
//
class BasicUser(named: String, surname: String, weight: Int) extends User(named, surname, weight) {
    override def greet() {
        println(s"good bye ${named}")
    }
}
var basicUser = new BasicUser(named = "Ricardo", "Ruiz", 34) // this was created!
println(basicUser.greet) // good bye Ricardo


//
// We can have more control by using var/val and override
//
//class Animal(val countryOrigin: String, var amountLegs: Int) {
//
//}
