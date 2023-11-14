import java.util.Scanner;
public class min2
{
    public static void main(String[] args)
    {
        short min;
        Scanner sc=new Scanner(System.in);
        System.out.print("Birinci ededi daxil et: ");
        short eded1=sc.nextShort();
        System.out.print("Ikinci ededi daxil et: ");
        short eded2=sc.nextShort();
        System.out.print("Uchuncu ededi daxil et: ");
        short eded3=sc.nextShort();
        min =(eded1 <= eded2)?(eded1 <= eded3 ? eded1 : eded3)
        :(eded2 <= eded3 ? eded2 : eded3);   
        System.out.print("Minimum eded: "+min);
     
    }
}