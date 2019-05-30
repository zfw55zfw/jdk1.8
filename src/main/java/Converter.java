/**
 * @author zhengfawei
 * @create 2019-03-26 下午1:45
 * @desc 函数式接口
 **/
@FunctionalInterface
public interface Converter<T,R>  {
    R convert(T from);
    //每一个接口可以设置一个默认方法 默认方法不是抽象方法可以同时存在在函数式接口中
    default void testDefault(){
        System.out.println("aaaa");
    }
    default void testDefault1(){
        System.out.println("aaaa1");
    }
    static void testSatic(){
        System.out.println("bbbb");
    }
    static void testSatic1(){
        System.out.println("bbbb1");
    }
}
