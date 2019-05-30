/**
 * @author zhengfawei
 * @create 2019-03-26 下午1:59
 * @desc 消费型
 **/
@FunctionalInterface
public interface Consumer<T> {
     void accept(T test);
     default void addAge(User user){
         user.setAge(user.getAge()+5);
     }
}
