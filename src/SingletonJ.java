public class SingletonJ {

    private static SingletonJ INSTANCE;

    private SingletonJ() {

    }

    public static SingletonJ getInstance() {
        if (INSTANCE == null) {
            synchronized (SingletonJ.class) {
                if (INSTANCE == null) {
                    INSTANCE = new SingletonJ();
                }
            }
        }
        return INSTANCE;
    }
}