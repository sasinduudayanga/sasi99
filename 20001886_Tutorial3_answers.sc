//Scala Tutorial – 3

//Question 1----------------------------------------------------------------------
def Area(r:Double):Double= {
  math.Pi * r * r
}
Area(5.0)

//Question 2----------------------------------------------------------------------
def toFahrenheit(x:Double):Double={
  x*1.8000 + 32.0
}
toFahrenheit(35.0)
//Question 3----------------------------------------------------------------------
def volume_sphere(r:Double):Double={
  (4/3)*math.Pi*r*r*r
}
volume_sphere(5.0)

//Question 4-----------------------------------------------------------------------
def copy_price(n:Int):Double= n match { // ne = no of copy
  case x if (50>=x) => 24.95 - 40/100 + 3 // price of first copy
  case _ => (24.95 - 40/100 + .75) // price of additional copy
}
def price_copies(n:Int):Double= n match{
  case x if 50>=x => x*copy_price(x)
  case x => 50*copy_price(50) + (x-50)*copy_price(x)
}
price_copies(60)

//Question 5-----------------------------------------------------------------------
def easy(x:Int):Int= x*8
def tempo(x:Int):Int= x*7

easy(2)+tempo(3)+easy(2)



