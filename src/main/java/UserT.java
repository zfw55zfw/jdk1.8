import java.io.Serializable;

/**
 * @author zhengfawei
 * @create 2019-04-25 下午1:58
 * @desc
 **/
public  class UserT extends User implements Serializable {
    private User user;
    public void dosomething(){
        System.out.println("this is erzi ");
    }
}
