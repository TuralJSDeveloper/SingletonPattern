package singletonpattern;

/**
 *
 * @author Tural
 */
public class SingletonPattern {

    private static SingletonPattern sp = null;

    private SingletonPattern() {

    }

    public static SingletonPattern getInstance() {
        if (sp == null) {
            sp = new SingletonPattern();
        }
        return sp;
    }

}
