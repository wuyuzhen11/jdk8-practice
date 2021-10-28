import com.sun.org.apache.xerces.internal.util.EntityResolverWrapper;
import domain.Person;

import java.security.cert.X509Certificate;
import java.sql.SQLOutput;
import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        /*List<Integer> list = Arrays.asList(6, 7, 3, 8, 1, 2, 9);
        Stream<Integer> stream = list.stream();
        List<Integer> collect = stream.filter(x -> x > 7).collect(Collectors.toList());*/

        /**
         * @author wuyz
         * @date 2021/4/30 10:03
         * @return void
         * 案例二：筛选员工中工资高于8000的人，并形成新的集合。 形成新集合依赖collect（收集)
         */
//        List<Person> personList = new ArrayList<Person>();
//        personList.add(new Person("Tom", 8900, 23, "male", "New York"));
//        personList.add(new Person("Jack", 7000, 25, "male", "Washington"));
//        personList.add(new Person("Lily", 7800, 21, "female", "Washington"));
//        personList.add(new Person("Anni", 8200, 24, "female", "New York"));
//        personList.add(new Person("Owen", 9500, 25, "male", "New York"));
//        personList.add(new Person("Alisa", 7900, 26, "female", "New York"));
//        List<String> collect = personList.stream().filter(p -> p.getSalary() > 8000)
//                .map(Person::getName).collect(Collectors.toList());
//        System.out.print("高于8000的员工姓名：" + collect);



        /*List<Integer> list = Arrays.asList(7, 6, 9, 3, 8, 2, 1);

        // 遍历输出符合条件的元素
        list.stream().filter(x -> x > 6).forEach(System.out::println);
        // 匹配第一个
        Optional<Integer> findFirst = list.stream().filter(x -> x > 6).findFirst();
        // 匹配任意（适用于并行流）
        Optional<Integer> findAny = list.parallelStream().filter(x -> x > 6).findAny();
        // 是否包含符合特定条件的元素
        boolean anyMatch = list.stream().anyMatch(x -> x < 6);
        System.out.println("匹配第一个值：" + findFirst.get());
        System.out.println("匹配任意一个值：" + findAny.get());
        System.out.println("是否存在大于6的值：" + anyMatch);*/
        
        /**
         * @author wuyz
         * @date 2021/4/30 10:12
         * @return void
         * 筛选出Integer集合中大于7的元素，并打印出来
         */

       /* List<Integer> list = Arrays.asList(6, 7, 3, 8, 1, 2, 9);
        Stream<Integer> stream = list.stream();
        stream.filter(x->x>7).forEach(System.out::println);*/

       /**
        * @author wuyz
        * @date 2021/4/30 10:14
        * @return void
        * 筛选员工中工资高于8000的人，并形成新的集合。 形成新集合依赖collect（收集），
        */
//        List<Person> personList = new ArrayList<Person>();
//        personList.add(new Person("Tom", 8900, 23, "male", "New York"));
//        personList.add(new Person("Jack", 7000, 25, "male", "Washington"));
//        personList.add(new Person("Lily", 7800, 21, "female", "Washington"));
//        personList.add(new Person("Anni", 8200, 24, "female", "New York"));
//        personList.add(new Person("Owen", 9500, 25, "male", "New York"));
//        personList.add(new Person("Alisa", 7900, 26, "female", "New York"));
//        List<Person> collect = personList.stream().filter(p -> p.getSalary() > 8000).collect(Collectors.toList());


        /**
         * @author wuyz
         * @date 2021/4/30 10:26
         * @return void
         * 获取String集合中最长的元素。
         */

        /*List<String> list = Arrays.asList("adnm", "admmt", "pot", "xbangd", "weoujgsd");
        Optional<String> s = list.stream().max(Comparator.comparing(String::length));
        System.out.println(s.get());*/

        /**
         * @author wuyz
         * @date 2021/4/30 10:30
         * @return void
         * 获取Integer集合中的最大值。
         */
//        List<Integer> list = Arrays.asList(7, 6, 9, 4, 11, 6);
//        // 自然排序
//        Optional<Integer> max = list.stream().max(Integer::compareTo);
//        System.out.println(max.get());
//        //自定义排序
//        Integer integer = list.stream().max(new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                return o1.compareTo(o2);
//            }
//        }).get();
//        System.out.println(integer);
        
        /**
         * @author wuyz
         * @date 2021/4/30 10:37
         * @return void
         * 获取员工工资最高的人。
         */
//        List<Person> personList = new ArrayList<Person>();
//        personList.add(new Person("Tom", 8900, 23, "male", "New York"));
//        personList.add(new Person("Jack", 7000, 25, "male", "Washington"));
//        personList.add(new Person("Lily", 7800, 21, "female", "Washington"));
//        personList.add(new Person("Anni", 8200, 24, "female", "New York"));
//        personList.add(new Person("Owen", 9500, 25, "male", "New York"));
//        personList.add(new Person("Alisa", 7900, 26, "female", "New York"));
//        String s = personList.stream().max(Comparator.comparing(Person::getSalary)).map(Person::getName).get();
//        System.out.println(s);

        /**
         * @author wuyz
         * @date 2021/4/30 10:40
         * @return void
         * 计算Integer集合中大于6的元素的个数。
         */
//        List<Integer> list = Arrays.asList(7, 6, 4, 8, 2, 11, 9);
//        long count = list.stream().filter(x -> x > 6).count();
//        System.out.println(count);

        /**
         * @author wuyz
         * @date 2021/4/30 10:54
         * @return void
         * 英文字符串数组的元素全部改为大写。整数数组每个元素+3。
         */
//        String[] strArr = { "abcd", "bcdd", "defde", "fTr" };
//        List<String> stringStream = Arrays.stream(strArr).map(String::toUpperCase).collect(Collectors.toList());
//        System.out.println(stringStream);
//        List<Integer> intList = Arrays.asList(1, 3, 5, 7, 9, 11);
//        List<Integer> collect = intList.stream().map(x -> x + 3).collect(Collectors.toList());
//        System.out.println(collect);

        /**
         * @author wuyz
         * @date 2021/4/30 11:17
         * @return void
         * 将员工的薪资全部增加1000。
         */
//        List<Person> personList = new ArrayList<Person>();
//        personList.add(new Person("Tom", 8900, 23, "male", "New York"));
//        personList.add(new Person("Jack", 7000, 25, "male", "Washington"));
//        personList.add(new Person("Lily", 7800, 21, "female", "Washington"));
//        personList.add(new Person("Anni", 8200, 24, "female", "New York"));
//        personList.add(new Person("Owen", 9500, 25, "male", "New York"));
//        personList.add(new Person("Alisa", 7900, 26, "female", "New York"));
//        List<Person> people = personList.stream().map(p -> {
//            p.setSalary(p.getSalary() + 1000);
//            return p;
//
//        }).collect(Collectors.toList());

        /**
         * @author wuyz
         * @date 2021/4/30 11:22
         * @return void
         * 将两个字符数组合并成一个新的字符数组。
         */
//        List<String> list = Arrays.asList("m,k,l,a", "1,3,5,7");
//        List<String> collect = list.stream().flatMap(s -> {
//            String[] split = s.split(",");
//            Stream<String> stream = Arrays.stream(split);
//            return stream;
//        }).collect(Collectors.toList());
//        System.out.println(collect);
        
        /**
         * @author wuyz
         * @date 2021/4/30 14:27
         * @return void
         * 求Integer集合的元素之和、乘积和最大值。
         */
//        List<Integer> list = Arrays.asList(1, 3, 2, 8, 11, 4);
//        //和
//        Integer integer = list.stream().reduce((x, y) -> (x + y)).get();
//        Integer integer1 = list.stream().reduce(Integer::sum).get();
//        Integer integer2 = list.stream().reduce(0,Integer::sum);
//        System.out.println(integer);
//        System.out.println(integer1);
//        System.out.println(integer2);
//        //乘积
//        Integer integer3 = list.stream().reduce((x, y) -> (x * y)).get();
//        System.out.println(integer3);
//        //最大值
//        Integer integer4 = list.stream().reduce(Integer::max).get();
//        System.out.println(integer4);

        /**
         * @author wuyz
         * @date 2021/4/30 14:40
         * @return void
         * 所有员工的工资之和和最高工资。
         */
//        List<Person> personList = new ArrayList<Person>();
//        personList.add(new Person("Tom", 8900, 23, "male", "New York"));
//        personList.add(new Person("Jack", 7000, 25, "male", "Washington"));
//        personList.add(new Person("Lily", 7800, 21, "female", "Washington"));
//        personList.add(new Person("Anni", 8200, 24, "female", "New York"));
//        personList.add(new Person("Owen", 9500, 25, "male", "New York"));
//        personList.add(new Person("Alisa", 7900, 26, "female", "New York"));
//        //工资和
//        Integer integer1 = personList.stream().map(Person::getSalary).reduce(Integer::sum).get();
//        System.out.println(integer1);
//        Integer integer = personList.stream().map(Person::getSalary).reduce(Integer::max).get();
//        System.out.println(integer);

//        List<Integer> list = Arrays.asList(1, 6, 3, 4, 6, 7, 9, 6, 20);
//        List<Integer> listNew = list.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());
//        Set<Integer> set = list.stream().filter(x -> x % 2 == 0).collect(Collectors.toSet());
//
//        List<Person> personList = new ArrayList<Person>();
//        personList.add(new Person("Tom", 8900, 23, "male", "New York"));
//        personList.add(new Person("Jack", 7000, 25, "male", "Washington"));
//        personList.add(new Person("Lily", 7800, 21, "female", "Washington"));
//        personList.add(new Person("Anni", 8200, 24, "female", "New York"));
//
//        Map<?, Person> map = personList.stream().filter(p -> p.getSalary() > 8000)
//                .collect(Collectors.toMap(Person::getName, p -> p));
//        System.out.println("toList:" + listNew);
//        System.out.println("toSet:" + set);
//        System.out.println("toMap:" + map);

        /**
         * @author wuyz
         * @date 2021/4/30 15:49
         * @return void
         * 统计员工人数、平均工资、工资总额、最高工资。
         */

//        List<Person> personList = new ArrayList<Person>();
//        personList.add(new Person("Tom", 8900, 23, "male", "New York"));
//        personList.add(new Person("Jack", 7000, 25, "male", "Washington"));
//        personList.add(new Person("Lily", 7800, 21, "female", "Washington"));
//        long count = personList.stream().count();
//        Long collect = personList.stream().collect(Collectors.counting());
//        Double collect1 = personList.stream().collect(Collectors.averagingDouble(Person::getSalary));
//        Long collect2 = personList.stream().collect(Collectors.summingLong(Person::getSalary));
//        Integer integer = personList.stream().map(Person::getSalary).reduce(Integer::sum).get();
//        Integer integer1 = personList.stream().map(Person::getSalary).collect(Collectors.maxBy(Integer::compareTo)).get();
//        System.out.println(count);
//        System.out.println(collect);
//        System.out.println(collect1);
//        System.out.println(collect2);
//        System.out.println(integer);
//        System.out.println(integer1);

        /**
         * @author wuyz
         * @date 2021/4/30 16:33
         * @return void
         * 将员工按薪资是否高于8000分为两部分；将员工按性别和地区分组
         */
//        List<Person> personList = new ArrayList<Person>();
//        personList.add(new Person("Tom", 8900,23, "male", "New York"));
//        personList.add(new Person("Jack", 7000,23, "male", "Washington"));
//        personList.add(new Person("Lily", 7800,23, "female", "Washington"));
//        personList.add(new Person("Anni", 8200, 23,"female", "New York"));
//        personList.add(new Person("Owen", 9500, 23,"male", "New York"));
//        personList.add(new Person("Alisa", 7900,23, "female", "New York"));
//        // 将员工按薪资是否高于8000分组
//        Map<Boolean, List<Person>> collect = personList.stream().collect(Collectors.partitioningBy(x -> x.getSalary() > 8000));
//        // 将员工按性别分组
//        Map<String, List<Person>> collect1 = personList.stream().collect(Collectors.groupingBy(Person::getSex));
//        // 将员工先按性别分组，再按地区分组


        /**
         * @author wuyz
         * @date 2021/4/30 16:42
         * @return void
         * 将员工按工资由高到低（工资一样则按年龄由大到小）排序
         */
        List<Person> personList = new ArrayList<Person>();

        personList.add(new Person("Sherry", 9000, 24, "female", "New York"));
        personList.add(new Person("Tom", 8900, 22, "male", "Washington"));
        personList.add(new Person("Jack", 9000, 25, "male", "Washington"));
        personList.add(new Person("Lily", 8800, 26, "male", "New York"));
        personList.add(new Person("Alisa", 9000, 26, "female", "New York"));
        // 按工资增序排序
        List<String> collect = personList.stream().sorted(Comparator.comparing(Person::getSalary))
                .map(Person::getName).collect(Collectors.toList());
        System.out.println(collect);
        // 按工资倒序排序
        List<String> collect1 = personList.stream().sorted(Comparator.comparing(Person::getSalary).reversed())
                .map(Person::getName).collect(Collectors.toList());
        System.out.println(collect1);
        // 先按工资再按年龄自然排序（从小到大）
        personList.stream().sorted(Comparator.comparing(Person::getSalary));
    }
}
