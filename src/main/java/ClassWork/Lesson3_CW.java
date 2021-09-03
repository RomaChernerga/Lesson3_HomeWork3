package ClassWork;


import java.util.Arrays;

public class Lesson3_CW {

    public static void main(String[] args) {
        //varargsExample();

        double a = 0.7;
        double b = 0.0;

        for(int i = 0; i<70; i++){
            b+= 0.01;
        }

        System.out.println(a ==b);
        System.out.printf("a = %f b = %f\n", a, b );
        System.out.println("b= " + b);

        System.out.println(Math.abs(a- b) < 0.000001);
    }


    private static void varargsMethod() {
        exampleArrayArgsMethod(new int[] { 1, 23,4, 56,7 });
        exampleVarargMethod(new int[] { 1, 23,4, 56,7 } );
        exampleVarargMethod();
        exampleVarargMethod(34);
        exampleVarargMethod(34,23,54,67,8,4);
        exampleVarargWithOtherArgs("Vasya", 15,  'H', 'e', 'l', 'l', 'o');
    }

    static void exampleVarargWithOtherArgs(String name, float f, char...chars){
        System.out.println(name);
        System.out.println(f);
        System.out.println(chars);
    }


    static void exampleVarargMethod(int...arr){
        System.out.println(Arrays.toString(arr));
    }

    static void exampleArrayArgsMethod(int[] arr){
        System.out.println(Arrays.toString(arr));

    }


}






