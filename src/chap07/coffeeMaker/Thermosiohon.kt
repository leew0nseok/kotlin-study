package chap07.coffeeMaker

class Thermosiohon(heater: Heater): Pump, Heater by heater {
    override fun pump() {
        if(isHot()){
            println("[Thermosiphon] pumping...")
        }
    }
}