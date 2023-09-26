package ec.ferchoc.kotlin.random

class Factorial {

    fun calculateRecursive(value: Int): Int {
        if (1 == value) {
            return 1
        }
        return value * calculateRecursive(value - 1)
        
    }
    
}