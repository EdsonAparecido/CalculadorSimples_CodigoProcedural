public class Calculate {

    public static void main(String[] args) {

        //Vai converter os argumentos do Main em int
        int x = Integer.parseInt(args[1]);
        int y = Integer.parseInt(args[2]);

        //Vai verificar qual é o argumento passado, e passar os outros 2 argumento para determinada operação
        if (args[0].equals("soma")) {
           sum(x, y);
        }else if (args[0].equals("subtrair")){
           minus(x, y);
        }else if (args[0].equals("dividir")){
           div(x, y);
        }else if (args[0].equals("multiplicar")){
           mult(x, y);
        }else {
           System.out.println("Nenhuma funcao foi definida");
        }
    //Vai receber os 2 argumentos passados e calular
    }
    static void sum(int x, int y){
        System.out.println(x + y);
    }
    static void minus(int x, int y){
        System.out.println(x - y);
    }
    static void div(int x, int y){
        System.out.println(x / y);
    }
    static void mult(int x, int y){
        System.out.println(x * y);
    }
}
