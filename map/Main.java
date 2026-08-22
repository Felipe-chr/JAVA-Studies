

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Map<String, User> users = new HashMap<>(); {
            users.put("joao@joao.com", new User("João",22));
            users.put("maria@maria.com", new User("Maria", 19));
            users.put("pedro@pedro.com", new User("Pedro", 22));
            users.put("lucas@lucas.com", new User("Lucas", 26));
            users.put("leo@leo.com", new User("Leo", 27));
            System.out.println(users);
            System.out.println("========================");
            users.keySet().forEach(System.out::println);
            System.out.println("========================");
            users.values().forEach(System.out::println);

            users.forEach((key, value) -> System.out.println(key + " - " + value));
            System.out.println(users.containsKey("joao@joao.com"));
            System.out.println(users.containsValue(new User("Leo", 27)));
            users.replace("lucas@lucas.com", new User("Lucas", 26));

        };
    }
}
