package com.company;
interface Psay{
    public String psy();
}
class Person{
    public static final Double PI = 3.1415926;
    private String name;

    public Person(String name) {
        this.name = name;
//        PI = 312312312.13231;
    }
    public void setName(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String say(){
        System.out.println("say");
        return name;
    }
}

class Student extends Person implements Psay{
    int score =0;

    public Student(String name, int score) {
        super(name);
        this.score = score;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public Student(String name) {
        super(name);
    }
    public String level(){
        if (score > 90){
            return "A";

        }else if (score > 80){
            return "B";
        }else if (score >70){
            return "C";

        }else if (score >60){
            return "D";
        }else {
            return "E";
        }


    }

    @Override
    public String psy() {
        return "null1";
    }
}
public class Main {

    public static void main(String[] args) {
	// write your code here
//        Person p = new Person("tom");
//        p.setName("jerry");
//        System.out.println(p.say());
//        System.out.println(p.name);
//        Student s  = new Student("elon",91);
//        System.out.println(s.getScore());
//        System.out.println(s.level());
//        System.out.println(s.psy());
/*
        try{
            int c = 1/0;
            System.out.println(c);

        }catch (Exception e){
            System.out.println("被除数不能为0");
        }finally {
            System.out.println("finally");
        }

 */


        System.out.println("helloworld! look ");
    }
}
