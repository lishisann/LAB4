package LAB4;

@FunctionalInterface
public interface Tester<T> {
    boolean test(T t);
}
