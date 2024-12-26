

public class ForCycle {
    public static String getPair(int number) {
    String result = "";
    for (int i = 0; i <= number; i++) {
        for (int j =0; j <= number; j++)
            if(i*j == number){
                result = result + i + "*" + j +"\n";
            }}

    return result;
}
}
