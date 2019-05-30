/**
 * @author zhengfawei
 * @create 2019-03-26 下午3:26
 * @desc stream
 **/
public class StreamTest {
    public static User addAge(User user){
        user.setAge(user.getAge()+5);
        return user;
    }
    public static void main(String[] args) {
//        Integer i=80000;
//        boolean equals = i.toString().equals("80000");
//        System.out.println(equals);
//        User user1 = new User();
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
//        List<User> users1 = Arrays.asList(user1);
//        ArrayList<User> users1 = new ArrayList<User>();
//        users.stream().filter(user -> user.getAge() > 16).forEach(user->users1.add(user));
//        users.stream().filter(user -> user.getAge() > 16).forEach(user->user.setSex("aaaaa"));
//        users.stream().sorted((u,u1)-> u.getAge()-u1.getAge()).forEach(System.out::println);
//        System.out.println("========");
//        users.stream().filter(user -> user.getAge()>17).map(StreamTest::addAge).forEach(System.out::println);
//        System.out.println("users"+users);
//        System.out.println("users1"+users1);

//        users.stream().limit(4).collect(Collectors.toList()).forEach(System.out::println);

//        List<Integer> list1=new ArrayList<Integer>();
//        List<Integer> list2=new ArrayList<Integer>();
//
//        for(int i = 0;i<100000;i++){
//            if(i%5!=0){
//                list1.add(null);
//                list2.add(null);
//            }else {
//                list1.add(i);
//                list2.add(i);
//            }
//        }
        UserT userT = new UserT();
        userT.geinidiao();
    }
}
