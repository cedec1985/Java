
int [][] sapin = new sapin [3][5];
int milieu = sapin[0].length/2;

for (int i =0;i<sapin.length;i++){
    for (int j=-i; j<=i;j++){
        sapin[i][milieu+j] = 1;
    }}
    for (int i=0; i<sapin.length;i++){
        for (int j=0;j<sapin[0].length;j++){
            if (sapin [i][j] ==0){
                System.out.println("");
  }
            else
                System.out.println(".");}
    System.out.println();

    }