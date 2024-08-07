# Kotlin-jetpackcompose
a journey from beginer level to mastery level in native developement with kotline
dayOne
#compose is an android toolkit for building native ui and it simplifies and accellerates developement
Tutors followed and mentors:
-Murat Yener
-Meghan Mehta
-Daniel Galpin
-Kat kuan
-Sagar Begale
-Angie Sasmita
-Raka Chowdhury
-Anuj Garg`

dayTwo
#started studying initial composition, and recompositions.
#using the remember keyword allow you to change the value of an item in your recomposible function
# and also helps you to retain saved instance parameters
#composible functions can exercute in any order,in parrallel,recomposition skips as many lamdas and functions as posible

#states: this is any value that changes over time. we have statefull and stateless composibles. it is advisable to always kkep your composibles stateless e.g

colum(){
name:String,
onChange:(String)->unit{
TextField(value=$name,
onValueChallange= onchange,
label={Text("Name")})
}
}
