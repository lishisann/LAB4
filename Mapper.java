package LAB4;

@FunctionalInterface
public interface Mapper<T, P> {
    P apply(T t);
}
