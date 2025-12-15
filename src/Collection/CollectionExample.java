package Collection;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionExample {
    public static void main(String[] args) {
        Collection<String> fruits = new ArrayList<>();
        // اضافه کردن عناصر
        fruits.add("سیب");
        fruits.add("موز");
        fruits.add("پرتقال");
        fruits.add("انگور");
        fruits.add("موز");

        System.out.println("تعداد میوه ها:");
        System.out.println(fruits.size());
        System.out.println("--------------");

        System.out.println("لیست میوه ها:");
        for(String fruit : fruits){
            System.out.println(fruit);
        }
        System.out.println("--------------");

        if (fruits.contains("پرتقال"))
            System.out.println("پرتقال موجود است");
        System.out.println("---------------");

        // حذف یک عنصر
        fruits.remove("پرتقال");
        System.out.println("\nپس از حذف پرتقال، اندازه: " + fruits.size()); // خروجی: ۴
        System.out.println("---------------");

        // پاک کردن تمام عناصر
        fruits.clear();
        System.out.println("پس از clear، خالی است؟ " + true); // خروجی: true
        System.out.println("---------------");
    }
}
