import java.util.Scanner;

public class Examen {
   public static void main(String args[])
   {
     String m;
     String n;
     Scanner sc= new Scanner (System.in);
     System.out.print("\nNombre completo:");
     n=sc.nextLine();
     System.out.print("\nFecha de nacimiento:");
     n=sc.nextLine();
     System.out.print("\nEdad:");
     n=sc.nextLine();
     System.out.print("\nSexo:");
     n=sc.nextLine();
     System.out.print("\nOcupacion:");
     n=sc.nextLine();
     System.out.print("\nHobbie:");
     n=sc.nextLine();
     System.out.print("\nPelicua favorita:");
     n=sc.nextLine();
     System.out.print("\nComida favorita:");
     n=sc.nextLine();
     System.out.print("\nAnimal favorito:");
     n=sc.nextLine();
     System.out.print("\nQue esperas de mi o de la carrera:");
     n=sc.nextLine();
     System.out.println("\nEstas orgullosa o orgulloso de mi?:(si)0(no)");
     m=sc.nextLine();
     if("si".equals(m))
     {
      
     }
     else if("no".equals(m))
             {
              System.out.println("\nPor que?:");
              n=sc.nextLine();
             }
   }



}
