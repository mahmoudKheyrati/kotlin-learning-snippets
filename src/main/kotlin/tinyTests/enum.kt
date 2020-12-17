package tinyTests

fun main() {
    println(ColorEnum.Blue.colorToString())

    val color = ColorEnum.Blue
    when (color) {
        ColorEnum.Red -> TODO()
        ColorEnum.Blue -> TODO()
        ColorEnum.Green -> TODO()
    }



}

enum class ColorEnum {
    Red {
        override val rgb: Int
            get() = 0xff0000
    },
    Green {
        override val rgb: Int
            get() = 0x00ff00
    },
    Blue {
        override val rgb: Int
            get() = 0x0000ff
    },
    ;
    abstract val rgb:Int
    fun colorToString(): String {
        return rgb.toString()
    }
}