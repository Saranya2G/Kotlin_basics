fun main(args:Array<String>){
    val engineer = Engineer()
    val doctor = Doctor()

    engineer.name = "Engineer"
    doctor.name = "Doctor"

    engineer.salary = 15000
    doctor.salary = 20000

    engineer.work()
    engineer.study()
    engineer.work()

    doctor.study()
    doctor.study()
    doctor.study()
    doctor.work()
}

open class Job {
    //Exercise
//    A class Job has three variables, name, revenue and salary, and two methods,
//    work - which increases revenue by the amount in salary
//    study - which increases salary
//    Two classes, Engineer and Doctor inherit from the Job class, but have different values for salary.
//    Create objects and call the functions a few times, printing out messages to see the result of the functions.

    var name = "Generic Job"
    var revenue = 0
    var salary = 10000

    fun work(){
        revenue += salary
        println("$name revenu $revenue")
    }
    fun study(){
     salary += 5000
        println("$name salary $salary")
    }

}

class Engineer: Job(){

}

class Doctor: Job(){

}