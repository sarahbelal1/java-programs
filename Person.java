public class Person
    {
        public static String name;
        public Person(String initialName)
        {
            name = initialName;
        }
        public void setName(String newName)
        {
            name = newName;
        }
        public String getName()
        {
            return name;
        }
        public void writeOutput()
        {
            System.out.println("Name: " + name);
        }
        public boolean hasSameName(Person otherPerson)
        {
            return this.name.equalsIgnoreCase(otherPerson.name);
        }
    }

