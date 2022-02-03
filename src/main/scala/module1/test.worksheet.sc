import scala.util.matching.Regex
val isCyrillic = "['\\p{IsCyrillic}]*".r

isCyrillic.matches("Hello")

case class Car(mark: String, model: String, year: Int)
case class Garage(garageName: String)

val cars = List(Car("BMW","x5",2000), Car("Audi","g5",2004), Car("Audi","TT",2019))
val garages = List(Garage("BMW"), Garage("Audi"),Garage("VW"))
val produceCity = Map("BMW" -> "Munich", "Audi" -> "Berlin","VW" -> "Kaluga")
val ownerOpt: Option[(String,String)] = Option("BMW","Nick")
cars.filter(car => car.year > 2003).map(car => (car.mark,car.model))

for{
  car <- cars
  if car.year > 2003
} yield (car.mark, car.model)

 garages.flatMap(garage =>
  cars.filter(car => car.mark == garage.garageName)
    .map(car=> (car.mark,car.model)))

for {
  car<-cars
  garage<-garages
  if car.mark == garage.garageName
} yield(car.mark, car.model)

//по марке узнать город
(for{
  car<-cars
  (mark, city) <-produceCity
  if car.mark == mark
} yield  city).distinct


for {
  car <- cars
  owner <-ownerOpt
  if owner._1 == car.mark
} yield (car.mark, car.model)