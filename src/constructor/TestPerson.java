package constructor;

import constructor.Person.Builder;

public class TestPerson {
	public static void main(String[] args) {

        Builder builder=new Person.Builder(123,"张三");

        Person person=builder.age(18).sex(false).desc("好好学习，天天向上").build();

        System.out.println(person.toString());

    }
}
