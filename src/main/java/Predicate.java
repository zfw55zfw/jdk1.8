import java.util.Objects;

/**
 * @author zhengfawei
 * @create 2019-03-26 下午2:02
 * @desc 断言型
 **/
@FunctionalInterface
public interface Predicate<T> {
    boolean test(T test);
    //返回值为已实现Predicate接口抽象方法的类
    default Predicate<T> and(Predicate<? super T> other) {
        Objects.requireNonNull(other);
        return (t) -> test(t) && other.test(t);
    }

    default Predicate<T> negate() {
        return (t) -> !test(t);
    }

    default Predicate<T> or(Predicate<? super T> other) {
        Objects.requireNonNull(other);
        return (t) -> test(t) || other.test(t);
    }

    static <T> Predicate<T> isEqual(Object targetRef) {
        return (null == targetRef)
                ? Objects::isNull
                : object -> targetRef.equals(object);
    }
}
