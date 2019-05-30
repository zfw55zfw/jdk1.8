/**
 * @author zhengfawei
 * @create 2019-03-26 下午1:49
 * @desc 函数式接口测试
 **/
public class ConverterTest {
    public static void main(String[] args) {
        Converter<String, Integer> converter = (from) -> Integer.valueOf(from);
        Integer converted = converter.convert("123");
        System.out.println(converted);

        Supplier<User> supplier = User::new;
        User user = supplier.get();
        System.out.println(user);

        Integer integer = Integer.valueOf(20);
        Predicate<Integer> p1= i ->  i>18;
        Predicate<Integer> p2= i1 -> i1<30;
        Predicate<Integer> and = p1.and(p2);
        boolean andb = and.test(25);
        System.out.println(andb);
        Predicate<Integer> negate = p1.negate();
        boolean negateb = negate.test(20);
        System.out.println(negateb);
        Predicate<Integer> or= p1.or(p2);
        boolean orb = or.test(33);
        System.out.println(orb);

    }
}
