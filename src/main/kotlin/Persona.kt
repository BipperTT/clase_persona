package org.example

class Persona {

    var dni: String = ""
    var nom: String = ""
    var cognoms: String = ""
    var edat: Int = 0
    var estatCivil: Boolean = false

    constructor() {

    }

    constructor(nom: String, cognoms: String) {

        this.nom = nom
        this.cognoms = cognoms

    }

    constructor(nom: String, cognoms: String, dni: String, edat: Int, estatCivil: Boolean) {

        this.nom = nom
        this.cognoms = cognoms
        this.dni = dni
        this.edat = edat
        this.estatCivil = estatCivil


    }


    fun aniversari() {

        edat++

    }

    fun casamant() {

        estatCivil = true

    }

    fun divorci() {

        estatCivil = false

    }


    override fun toString():String {
        return "DNI: $dni, Nom: $nom, Edat: $edat, Estat civil: ${if (estatCivil) "casat" else "divorciat/solter"}"
    }




}