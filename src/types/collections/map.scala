val persons = Map("Australia" -> "Michael", "Spain" -> "Francisco")
println(persons) // Map(Australia -> Michael, Spain -> Francisco, Chinese -> Jin)
println(persons("Australia")) // Michael


// define an immutable map (by default are immutable)
val personAge: Map[String, Int] = Map()
println(personAge) // Map()

//
// append item to an immutable map
//
var personMapUpdated1 = personAge + ("Paco" -> 232)
personMapUpdated1 += ("Manoli" -> 555)
println(personMapUpdated1) // Map(Paco -> 232, Manoli -> 555)
println(personMapUpdated1.getClass)

// update item
var personMapUpdated2 = personAge + ("Paco" -> 111)
println(personMapUpdated2) // Map(Paco -> 111)
personMapUpdated2 += ("Paco" -> 999)
println(personMapUpdated2) // Map(Paco -> 999)

// update item with val (immutable elements)
val persons2 = Map("Australia" -> "Michael", "Spain" -> "Francisco")
var newPersons2 = persons2.updated("Australia", "this is my new value")
println(newPersons2) // Map(Australia -> this is my new value, Spain -> Francisco)

// get
var mymap = Map("city" -> "Madrid")
println(mymap("city")) // Madrid
println(mymap.get("city")) // Some(Madrid)
println(mymap.get("whatever")) // None

// getOrElse
mymap = Map("city" -> "Madrid")
println(mymap.getOrElse("city", "city not found")) // Madrid
println(mymap.getOrElse("wrong", "city not found")) // city not found


// default value
mymap = Map("city" -> "Madrid").withDefaultValue("not found")
println(mymap("wrong")) // not found