//    package dsl
//
//
//    class Words {
//        private val list = mutableListOf<String>()
//
//        fun String.record(){
//            list.add(this)
//
//        }
//        operator fun String.unaryPlus() {
//            list.add(this)
//        }
//        // TODO
//
//        override fun toString() = list.toString()
//    }
//
//    fun function.main(args: Array<String>) {
//        val words = Words()
//        with(words) {
//            // The following two lines should compile:
//            "one".record()
//            +"two"
//        }
//        words.toString() eq "[one, two]"
//    }