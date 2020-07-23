import java.io.Serializable;

/**
 * Lmabda表达式的语法总结： () -> ();

 前置	语法
 无参数无返回值	() -> System.out.println(“Hello WOrld”)
 有一个参数无返回值	(x) -> System.out.println(x)
 有且只有一个参数无返回值	x -> System.out.println(x)
 有多个参数，有返回值，有多条lambda体语句	(x，y) -> {System.out.println(“xxx”);return xxxx;}；
 有多个参数，有返回值，只有一条lambda体语句	(x，y) -> xxxx
 口诀：左右遇一省括号，左侧推断类型省
 * @author zhengfawei
 * @create 2019-03-26 上午10:48
 * @desc lambda表达式
 **/
public class Lambda implements Serializable {

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j <30 ; j++) {
                System.out.println(i+","+j);
                if(j==3){
                    break;
                }
            }
        }
//        User user1 = new User();
//        int i=111;
//        setUser(user1,i);
//        System.out.println(user1);
//        System.out.println(i);
//        User user2 = new User();
//        User user3 = new User();
//        user1.setName("aa");
//        user1.setAge(17);
//        user1.setId(1);
//        user1.setSex("man");
//        user2.setName("bbb");
//        user2.setAge(18);
//        user2.setId(2);
//        user2.setSex("man");
//        user3.setName("c");
//        user3.setAge(15);
//        user3.setId(3);
//        user3.setSex("male");
//
//        ArrayList<User> users = new ArrayList<User>();
//        users.add(user1);
//        users.add(user2);
//        users.add(user3);
//        System.out.println(users);
//        Collections.sort(users,(u1,u2)->u1.getName().length()-u2.getName().length());
//        System.out.println(users);
    }
    public static int setUser(User user1,int i){
        user1.setName("aa");
        user1.setAge(17);
        user1.setId(1);
        user1.setSex("man");
        i++;
        return i;
    }
}
