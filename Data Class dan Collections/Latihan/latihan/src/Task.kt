fun main() {

    // TODO 1
    val vehicle = mapOf<String, String>("type" to "Motorcycle", "maxSpeed" to "230Km/s", "maxTank" to "10Ltr")

    // TODO 2
    val type = vehicle.get("type")
    val maxSpeed = vehicle.get("maxSpeed")
    val maxTank = vehicle.get("maxTank")

    // TODO 3
    println("""
        Vehicle
        Type: $type
        Maximal Speed: $maxSpeed
        Maximal Tank: $maxTank
    """.trimIndent())

}