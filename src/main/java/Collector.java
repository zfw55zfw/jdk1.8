import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * @author zhengfawei
 * @create 2019-08-13 上午9:04
 * @desc
 **/
public class Collector {
    public static void main(String[] args) throws ParseException {


        Map<Integer,Integer> map6 =new HashMap<Integer,Integer>();
        map6.put(1,2);
        Integer integer = map6.get(1);
        System.out.println(integer);
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
        map.put("name",111);
        map.put("statu","5");

//        map.put("time",new Timestamp(date.getTime()));
        map1.put("id",1464);
        map1.put("name",111);
        map1.put("statu","4");

//        map1.put("time",new Timestamp(date1.getTime()));

        map2.put("id",1463);
        map2.put("name",111);
        map2.put("statu","3");

//        map2.put("time",new Timestamp(date.getTime()));
        map3.put("id",1463);
        map3.put("name",111);
        map3.put("statu","2");

//        map3.put("time",new Timestamp(date.getTime()));
        map4.put("id",1463);

        map2.put("name",111);

//        map4.put("time",new Timestamp(date.getTime()));
        map4.put("statu","5");
//        map5.put("id",1463);
//        map5.put("time",new Timestamp(date.getTime()));
//        map5.put("statu","aa");
        List<Map<String, Object>> maps = Arrays.asList(map, map1, map2, map3,map4);
        Map<String, Object> stringObjectMap = maps.stream().max((a, b) -> {
                    String s = (String) a.get("statu");
                    String ss = (String) b.get("statu");
                    if (Integer.parseInt(s) > Integer.parseInt(ss)) {
                        return Integer.parseInt(s);
                    } else {
                        return Integer.parseInt(ss);
                    }
                }
        ).get();
        System.out.println(stringObjectMap);
//        long count = maps.stream().filter(item -> {
//            if (item.get("statu").equals("bb")) {
//                return true;
//            }
//            return false;
//        }).count();
//        System.out.println("=============="+count);
//
//        Map<Object, List<Map<String, Object>>> id = maps.stream().
//                filter(item->item.get("statu").equals("bb")).
//                collect(Collectors.groupingBy(item -> item.get("id")));
//
//        System.out.println(id);
//        System.out.println("==============");
//        Map<Object, List<Map<String, Object>>> id1 = maps.stream().collect(Collectors.groupingBy(
//                item -> item.get("id")));
//        System.out.println(id1);

//        maps.stream().map(aa -> (Timestamp) aa.get("time")).collect(Collectors.maxBy((bb, cc) -> bb.compareTo(cc))).ifPresent(System.out::println);
//        System.out.println(id);
//        Map<Object, Map<String, Object>> collect = maps.stream().
//                filter(item -> item.get("statu").equals("aa")).
//                collect(Collectors.groupingBy(item -> item.get("id"),
//                        Collectors.collectingAndThen(
//                                Collectors.maxBy((bb, cc) -> {
//                                            Timestamp c = (Timestamp) cc.get("time");
//                                            Timestamp b = (Timestamp) bb.get("time");
//                                            return b.compareTo(c);
//                                        }
//                                ), Optional::get)));
//        System.out.println("==============");
//        System.out.println(collect);
    }
}
