package oldfiles;

public class Test {
    private String name;
    public Test(){
        name = "Iphone";

    }
    public void setName(String name){
        this.name = name ;
    }
    public String getName(){
        return name;
    }
    // @Override
    public String toString(){
        return name;
    }
    public static void main(String [] args){
        Test test = new Test();
        System.out.println(test);
        String str1 = "a";
        String str2 = "a";
        String str3 = new String(str1);
        System.out.println(str1 == str2);
        System.out.println(str1.equals(str3));
    }
}