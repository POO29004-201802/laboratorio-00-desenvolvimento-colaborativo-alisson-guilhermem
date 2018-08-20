public class quadrado {
    public static int tam;
    public static String q[][];

    public quadrado(int tam) {

        q = new String[tam][tam];
        int i, j;
        for(i=0; i<q.length;i++){ //linhas
            for(j = 0; j<q.length; j++){ //colunas

                if((i==0 && (j==0 || j==q.length-1)) || (i==q.length-1 && (j==0 || j==q.length-1))) {
                    q[i][j] = "+";
                } else if (i==0 || i == q.length -1){
                    q[i][j] = "-";
                } else if( j == 0 || j == q.length -1){
                    q[i][j] = "|";
                } else {
                    q[i][j] = " ";
                }

            }
        }
    }

    public static String [][] retmatriz(){
        return q;
    }


}
