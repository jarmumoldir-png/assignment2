package abstractfactory;

public interface Validator {
    String region();
    boolean check(Card c);
}