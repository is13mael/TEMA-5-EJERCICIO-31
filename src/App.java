public class App {
    public static void main(String[] args) throws Exception {
        try{
        System.out.print("Introduzca la altura de la L: ");
        int altura = Integer.parseInt(System.console().readLine());
        for(int i = 0; i < altura; i++){
            System.out.println("*");
            
        }
        for(int j = 0; j < altura / 2 + 1; j++){
                System.out.print("* ");
            }
            System.out.println();
    }catch(NumberFormatException e){
        System.out.println("");
    }
}
}