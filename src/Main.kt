import java.awt.MenuItem
import kotlin.random.Random

/*fun total(defense:Int, type:Int, qualité:Int):Int{
    val score = defense+type+qualité
    return score
}

fun main(){
    println(total(3,2,1))
    assert( total(3,2,1)==6){
        "erreur de la valeur est de ${total(3,2,1)}"
    }
} */

/*fun lanceDes(nombreDes: Int, nombreFaces: Int): Int {
    var total = 0
    for (i in 1..nombreDes) {
        total += Random.nextInt(1, nombreFaces + 1)
    }
    return total
}

fun main(){
    println(lanceDes(1,6))
    println(lanceDes(2,5))
    println(lanceDes(4,20))
}*/

/*fun lanceDes(nombreDes: Int, nombreFaces: Int): Int {
    var total = 0
    for (i in 1..nombreDes) {
        total += Random.nextInt(1, nombreFaces + 1)
    }
    return total
}

fun calculerDegats(
    nombreDes: Int,
    nombreFaces: Int,
    bonusQualite: Int,
    seuilCritique: Int,
    multiplicateurCritique: Int
): Int {

    var degats = lanceDes(nombreDes, nombreFaces)

    if (degats >= seuilCritique) {
        degats *= multiplicateurCritique
    }

    degats += bonusQualite

    return if (degats < 0) 0 else degats
}

fun main() {
    println(calculerDegats(1, 6, 2, 6, 2))
    println(calculerDegats(1, 8,3, 5, 3))
}*/

/*fun attaque(pvCible: Int, defenseCible: Int, degatsArme: Int, nomAttaquant: String, nomCible: String) {
    val degats = maxOf(0, degatsArme - defenseCible)
    val nouveauxPv = maxOf(0, pvCible - degats)
    println("$nomAttaquant attaque $nomCible pour $degats point de dégâts. Il reste $nouveauxPv points de vie à $nomCible.")
}

fun main(){
    attaque(15,3,4, "Alex", "Killian")
    attaque(5, 2, 9, "Alex","Matthis")
}*/

/*fun boirePotion(nomCible: String, pv: Int, pvMax: Int, puissancePotion: Int) {
    val exPV = pv
    val nouveauxPV = minOf(pv + puissancePotion, pvMax)
    val pvRecupere = nouveauxPV - exPV
    println("$nomCible boit une potion et récupère $pvRecupere PV.")
}
    fun main(){
    boirePotion("Alex", 8,20,6)
    }
*/

/*fun bouleDeFeu(nomCaster: String, nomCible: String, scoreAttaque: Int, scoreDefense: Int, pvCible: Int) {
    val nbMissiles = scoreAttaque / 2
    val nombreFaces = 6
    var pvFinalCible=pvCible
    var degatsTotal = 0
    for (i in 0..nbMissiles) {
        degatsTotal += Random.nextInt(1, nombreFaces)
        val degatsApresDefense = degatsTotal - scoreDefense
        val degatsFinaux = if (degatsApresDefense > 0) degatsApresDefense else 0
        pvFinalCible = if (pvFinalCible - degatsFinaux > 0) pvFinalCible - degatsFinaux else 0
        println("$nomCaster lance une boule de feu et inflige ${pvCible-pvFinalCible} points de dégâts à $nomCible. Il reste $pvFinalCible PV à $nomCible.")

    }

}

fun main(){
    println(bouleDeFeu("alex","Matthis",8,4,10))

}
*/

/*fun invocationArme(nomCaster: String, typeArme: String) {
    val score = Random.nextInt(1, 20)  // Tire un nombre entre 1 et 20 inclus
    val qualite = when {
        score < 5 -> "commune"
        score < 10 -> "rare"
        score < 15 -> "épique"
        else -> "légendaire"
    }

        println("$nomCaster invoque un(e) $typeArme $qualite")
}

    fun main() {
        invocationArme("Arthas", "épée")
    }
*/

/*fun soins(nomCaster: String, attaque: Int, pvCible: Int, pvMaxCible: Int, estMortVivant: Boolean) {
    val scoreSoins = attaque / 2
    var nouveauPv = pvCible

    if (estMortVivant) {
        nouveauPv -= scoreSoins
        if (nouveauPv < 0) nouveauPv = 0
        println("$nomCaster inflige $scoreSoins points de dégâts à la cible mort-vivante. PV restants: $nouveauPv")
    } else {
        nouveauPv += scoreSoins
        if (nouveauPv > pvMaxCible) nouveauPv = pvMaxCible
        println("$nomCaster soigne la cible pour $scoreSoins points de vie. PV actuels: $nouveauPv")
    }
}

fun main() {
    soins("Alex", 40, 50, 100, false)  // Soigne une cible vivante
    soins("Alex", 40, 30, 100, true)   // Inflige des dégâts à un mort-vivant
}
*/

/*fun afficheInventaire(nomPerso: String, inventaire: MutableList<String>) {
    println("Inventaire de $nomPerso")
    inventaire.forEachIndexed { index, item -> println("$index => $item") }
}

fun main(){
    println(afficheInventaire("Alex", mutableListOf("Potion","Lance")))
}
*/

/*fun choisirItem(nomPerso: String, inventaire: MutableList<String>) {
    var choix: Int?
    do {
        println("Choisissez un item (0-${inventaire.size - 1}) :")
        choix = readLine()?.toIntOrNull()
    } while (choix == null || choix !in 0 until inventaire.size)

    println("$nomPerso utilise ${inventaire[choix]}")
}

fun main(){
    println(choisirItem("Alex", mutableListOf("bote","lance")))
}
*/

fun tourJoueur() {
    var choix: String?
    do {
        println("Choisissez une action :")
        println("1. Attaquer")
        println("2. Boule de feu")
        println("3. Missile magique")
        println("4. Soins")
        println("5. Utiliser un item")

        choix = readLine()
        when (choix) {
            "1" -> println("Vous attaquez l'ennemi !")
            "2" -> println("Vous lancez une boule de feu !")
            "3" -> println("Vous tirez un missile magique !")
            "4" -> println("Vous vous soignez !")
            "5" -> println("Vous utilisez un item !") // Appel à la fonction utiliser item ici
            else -> println("Choix non valide, veuillez réessayer.")
        }
    } while (choix !in listOf("1", "2", "3", "4", "5"))
}

fun main(){
    println(tourJoueur())
}

fun tourOrdinateur() {
    val tirage = Random.nextInt(1, 31) // Tire un nombre entre 1 et 30

    when (tirage) {
        in 1..15 -> println("L'ordinateur attaque !") // Appel à la fonction attaque ici
        in 16..20 -> println("L'ordinateur lance une boule de feu !")
        in 21..25 -> println("L'ordinateur tire un missile magique !")
        in 26..30 -> println("L'ordinateur se soigne !")
    }
}
fun main(){
    println()
}

fun tourCombat() {
    println("Début du tour")
    tourJoueur()
    tourOrdinateur()
    println("Fin du tour")
}
fun main(){

}