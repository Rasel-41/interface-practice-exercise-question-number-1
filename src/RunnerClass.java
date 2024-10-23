
 interface Measurable{
    double getMeasure();
    static Measurable largest(Measurable [] objects){
        if(objects == null|| objects.length == 0){
return null;
        }
        Measurable largest = objects[0];
        for (Measurable obj : objects) {
            if (obj.getMeasure() > largest.getMeasure()) {
                largest = obj;
            }
        }
        return largest;
    }
     static Measurable smallest(Measurable[] objects) {
         if (objects == null || objects.length == 0) {
             return null;
         }
         Measurable smallest = objects[0];
         for (Measurable obj : objects) {
             if (obj.getMeasure() < smallest.getMeasure()) {
                 smallest = obj;
             }
         }
         return smallest;
     }
 }
  class Employee implements Measurable {
     private String name;
     private double salary;

     public Employee(String name, double salary) {
         this.name = name;
         this.salary = salary;
     }

     @Override
     public double getMeasure() {
         return this.salary;
     }

     @Override
     public String toString() {
         return name + ": $" + salary;
     }
 }
public class RunnerClass {

        public static void main(String[] args) {
            Measurable[] employees = {
                    new Employee("Alice", 50000),
                    new Employee("Bob", 60000),
                    new Employee("Charlie", 40000)
            };

            Measurable largest = Measurable.largest(employees);
            Measurable smallest = Measurable.smallest(employees);

            System.out.println("Largest: " + largest);
            System.out.println("Smallest: " + smallest);
        }
    }

