import java.io.File;
import java.util.List;
import java.util.Map;

public class task1 {
    public static void main(String[] args) {
        String QUERY = "select * from students where ";
	    String PARAMS = "{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"} ";
        System.out.println(answer(QUERY, PARAMS));
    }

    public static String answer(String QUERY, String PARAMS){
        ObjectMapper mapper = new ObjectMapper();

        List<Person> myPeople = mapper.readValue(new File(fileName), new TypeReference<>(){});
        for(Person myPerson : myPeople) {
            System.out.println(myPerson.toString());
        
        }
    static class Person {
        String name;
         String country;
          String city;
           String age;

        public Person(){} 

     public Person(String name, String country, String city, String age) {
            this.name = name;
            this.country = country;
            this.city = city;
            this.age = age;
        }
    }    
    }
}    