package course_datlab;

public class Urok_2_Factorial {

    public static long fact(long i){
        if(i <=1)
            return 1;
        else
            return(i * fact(i-1));
    }

}
