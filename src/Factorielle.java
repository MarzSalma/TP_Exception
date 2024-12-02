public class Factorielle {
    public static void main (String[] args)
    {
        int i, nbEntiers=0, factorielle=1;
        int ancien;
        try {
            if (args.length == 0) {
                throw new NullException("Le Tableau est vide");
            }
            nbEntiers = Integer.parseInt(args[0]);
            if (nbEntiers<0){
                throw new NBNegative("Veuillez entrer un nombre positive");
            }
            for ( i=2; i<= nbEntiers; i++){
                factorielle *= i;
            }
            System.out.println("La factorielle de "+nbEntiers+ " est "  + factorielle);
        }catch (NullException e){
            System.out.println(e.getMessage());
        }catch (NBNegative e){
            System.out.println(e.getMessage());
        }catch (NumberFormatException e){
            System.out.println("L'argument fourni n'est pas un entier");
        }

      //  nbEntiers= Integer.parseInt(args[0]);
        //for (i=2;i<= nbEntiers;i++)
        //{
           // ancien=factorielle;
            //factorielle *= i;
       // }
       // System.out.println(" Voila la factorielle des "+ nbEntiers +
         //       " premiers entiers : "+ factorielle );
    }
}
