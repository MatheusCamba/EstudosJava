public class TesteFor {
    public static void main(String[] args) {
        int idade = 18;
        for(int contador = 0; contador <= idade; contador++){
            if(contador < idade){
                System.out.println("Ainda não pode dirigir !!!");
            } else{
                System.out.println("Agora você pode dirigir e/ou ir preso !!!");
            }

        }
    }
}
