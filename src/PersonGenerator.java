public class PersonGenerator {
    public static void main(String[] args) {
        Person myPerson = new Person();

        System.out.println("My First Name is:" + myPerson.getFirstName());
        System.out.println("My ID is:" + myPerson.getID());
        System.out.println("My Last Name is:" + myPerson.getLastName());
        System.out.println("My Title is:" + myPerson.getTitle());
        System.out.println("My YOB is:" + myPerson.getYOB());
    }
}