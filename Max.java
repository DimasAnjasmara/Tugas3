public class Max{
public static void main(String []args){
int a = 80;
int b = 50;
int c = 70;
int max = 0;

max = a >= max ? a : max;
max = b >= max ? b : max;
max = b >= max ? c : max;

System.out.println("Nilai Maksimalnya adalah = " +max);
}
}