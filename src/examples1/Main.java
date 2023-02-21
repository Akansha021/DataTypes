package examples1;

public class Main {
    public static void main(String[] args) {
        int a=5;
        int b=a;
        short a1=12345;
        byte a2=123;
        double a3=13564344;
        float a4=345.5f;
        System.out.println(a);
        String s="ABCDEFGH";
        String s1=s;
        String s2=new String("ABCDEFGH");

        //Primitive DataType
        if(b==a){
            System.out.println("YES");;
        }else {
            System.out.println("NO");
        }

        //String
        //s1 ans s
        if(s1.equals(s)){
            System.out.println("YES");;
        }
        if(s1==s){
            System.out.println("YES");;
        }else{
            System.out.println("NO");
        }


        //s,s1 and s2
        if(s.equals(s2)){
            System.out.println("YES");;
        }else {
            System.out.println("NO");
        }
        if(s1==s2){
            System.out.println("YES");;
        }else{
            System.out.println("NO");
        }



        System.out.println(a);
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(s);

    }
}