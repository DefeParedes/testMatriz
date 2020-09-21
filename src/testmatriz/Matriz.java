package testmatriz;

public class Matriz {
    private int [][] matriz = new int [4][];

    public void armar(){
        int contador = 3;
        matriz[0] = new int[4];
        matriz[1] = new int[3];
        matriz[2] = new int[5];
        matriz[3] = new int[2];
        for(int i=0;i<matriz.length;i++){
            for(int j=0;j<matriz[i].length;j++){
                matriz[i][j]=contador;
                contador+=3;
            }
        }
        for(int i=0;i<matriz.length;i++){
            System.out.print("Fila "+(i+1)+":");
            for(int j=0;j<matriz[i].length;j++){
                if(matriz[i][j]%2==0){
                    System.out.print(matriz[i][j]+(" "));
                }
            }
            System.out.println();
        }
    }
}
