package chap07.coffeeMaker

class MyDripCoffeeModule : CoffeeModule{
    companion object{
        val electricHeater: ElectricHeater by lazy{
            ElectricHeater()
        }
    }
    private val _thermosiphon: Thermosiohon by lazy{
        Thermosiohon(electricHeater)
    }

    override fun getThermosiphon(): Thermosiohon = _thermosiphon

}