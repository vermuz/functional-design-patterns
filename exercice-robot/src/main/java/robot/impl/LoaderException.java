package robot.impl;

/**
 * Permet de lever les exceptions du Loader.
 * @see Exception
 */
public class LoaderException extends Exception {

    /**
     * Permet de creer une exception de type Loader.
     * @param s l'erreur qui est souleve
     */
    public LoaderException(final String s) {
        super(s);
    }
}
