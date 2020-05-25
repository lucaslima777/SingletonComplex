class SingletonK {

    object Singleton {
        private var INSTANCE: SingletonK? = null
        val instance: SingletonK?
            get() {
                if (INSTANCE == null) {
                    synchronized(SingletonK::class.java) {
                        if (INSTANCE == null) {
                            INSTANCE = SingletonK()
                        }
                    }
                }
                return INSTANCE
            }
    }
}