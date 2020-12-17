package book

import javax.swing.text.html.HTML.Tag.U

sealed class Apartments
class CSEApartment : Apartments()
class UniversityApartment : Apartments()
class MainApatment : Apartments()


fun displayApartment(apartments: Apartments) {
    when (apartments) {
        is CSEApartment -> {
            println("cse")
        }
        is UniversityApartment -> {
            println("university")
        }
        is MainApatment -> {
            println("function.main")
        }
    }

}

fun main() {
    displayApartment(CSEApartment())
    displayApartment(UniversityApartment())
    displayApartment(MainApatment())
}

