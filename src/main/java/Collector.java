import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.stream.Collectors;

/**
 * @author zhengfawei
 * @create 2019-08-13 上午9:04
 * @desc
 **/
public class Collector {
    public static void main(String[] args) throws ParseException {
        Map<String,Object> map =new HashMap<String,Object>();
        Map<String,Object> map1 =new HashMap<String,Object>();
        Map<String,Object> map2 =new HashMap<String,Object>();
        Map<String,Object> map3 =new HashMap<String,Object>();
        Map<String,Object> map4 =new HashMap<String,Object>();
        Map<String,Object> map5 =new HashMap<String,Object>();
        DateFormat dateFormat;
        dateFormat = new SimpleDateFormat("yyyy-MM-dd kk:mm:ss");
        Date date = dateFormat.parse("2019-08-09 22:55:44");
        Date date1 = dateFormat.parse("2019-08-08 22:55:30");
        Date date2 = dateFormat.parse("2019-08-07 22:55:22");
        map.put("id",1464);
        map.put("time",new Timestamp(date.getTime()));
        map.put("statu","aa");
        map1.put("id",1464);
        map1.put("time",new Timestamp(date1.getTime()));
        map1.put("statu","aa");
        map2.put("id",1463);
        map2.put("time",new Timestamp(date.getTime()));
        map2.put("statu","aa");
        map3.put("id",1462);
        map3.put("time",new Timestamp(date.getTime()));
        map3.put("statu","aa");
        map4.put("id",1463);
        map4.put("time",new Timestamp(date.getTime()));
        map4.put("statu","bb");
        map5.put("id",1463);
        map5.put("time",new Timestamp(date.getTime()));
        map5.put("statu","aa");
        List<Map<String, Object>> maps = Arrays.asList(map, map1, map2, map3, map4,map5);
        maps.stream().filter(item -> {
            if(item.get("statu").equals("aa")){
                return true;
            }
            return false;
        }).forEach(System.out::print);
        System.out.println("==============");

        Map<Object, List<Map<String, Object>>> id = maps.stream().
                filter(item->item.get("statu").equals("aa")).
                collect(Collectors.groupingBy(item -> item.get("id")));
        System.out.println(id);
        maps.stream().map(aa -> (Timestamp) aa.get("time")).collect(Collectors.maxBy((bb, cc) -> bb.compareTo(cc))).ifPresent(System.out::println);
//        System.out.println(id);
        Map<Object, Map<String, Object>> collect = maps.stream().
                filter(item -> item.get("statu").equals("aa")).
                collect(Collectors.groupingBy(item -> item.get("id"),
                        Collectors.collectingAndThen(
                                Collectors.maxBy((bb, cc) -> {
                                            Timestamp c = (Timestamp) cc.get("time");
                                            Timestamp b = (Timestamp) bb.get("time");
                                            return b.compareTo(c);
                                        }
                                ), Optional::get)));
        System.out.println("==============");
        System.out.println(collect);
    }
}
