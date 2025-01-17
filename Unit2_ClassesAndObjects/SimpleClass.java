class SimpleClass {
    String name;
    float age;
    int roll_no;


    public SimpleClass(float age, String name, int roll_no) {
        this.age = age;
        this.name = name;
        this.roll_no = roll_no;
    }

    void SetName(String name) {
        this.name = name;
    }

    String getName() {
        return this.name;
    }

    float getAge(){
        return this.age;
    }

    public static void main(String[] args) {
        SimpleClass s = new SimpleClass(21.5f, "Vishal Bhutekar", 101);

        // Print age and name        System.out.println("Age: " + s.age);
        System.out.println("Name: " + s.getName());
        System.out.println(s.getAge());
    }
}
