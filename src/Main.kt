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

fun boirePotion(nomCible: String, pv: Int, pvMax: Int, puissancePotion: Int) {
    val exPV = pv
    val nouveauxPV = minOf(pv + puissancePotion, pvMax)
    val pvRecupere = nouveauxPV - exPV
    println("$nomCible boit une potion et récupère $pvRecupere PV.")
}
    fun main(){
    boirePotion("Alex", 8,20,6)
    }
