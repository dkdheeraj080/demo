public class demo {
    public static void main(String[] args) {
        int i, j;

        String[][] array1 = {{"prof1", "prof2", "prof3", "prof4", "prof5", "prof6", "prof7"}};
        String[][] array2 = new String[5][7];
        String[][] array3 = new String[5][7];


        for (i = 0; i < array1.length; i++) {
            for (j = 0; j < 7; j++) {
                array2[i][j] = array1[i][j];
                array3[i][j] = array1[i][j];
            }
        }


        for (i = 0; i < 7; i++) {
            array2[1][i] = array2[0][i];
            array2[2][i] = array2[0][i];
            array2[3][i] = array2[0][i];
            array2[4][i] = array2[0][i];
            ///array2[5][i]=array2[0][i];
            //array2[6][i]=array2[0][i];
        }

        for (i = 0; i < 7; i++) {

                array3[1][i] = array3[0][i];
                array3[2][i] = array3[0][i];
                array3[3][i] = array3[0][i];
                array3[4][i] = array3[0][i];


        }


        for (i = 0; i < 5; i++) {
            for (j = 0; j < 7; j++) {
                int i1 = (int) (Math.random() * 5);
                int j1 = (int) (Math.random() * 7);


                String temp = array2[i][j];
                array2[i][j] = array2[i1][j1];
                array2[i1][j1] = temp;

            }

        }

        for (i = 0; i < 5; i++) {
            for (j = 0; j < 7; j++) {
                int i1 = (int) (Math.random() * 5);
                int j1 = (int) (Math.random() * 7);


                String temp = array3[i][j];
                array3[i][j] = array3[i1][j1];
                array3[i1][j1] = temp;

            }

        }


        System.out.println("******************************************************************");
        for (i = 0; i < 5; i++) {
            for (j = 0; j < 7; j++) {
                System.out.print(array2[i][j] + " \t");

            }
            System.out.println();
        }
        System.out.println("******************************************************************");
        System.out.println();
        System.out.println();
        System.out.println("******************************************************************");
        for (i = 0; i < 5; i++) {
            for (j = 0; j < 7; j++) {
                System.out.print(array3[i][j] + " \t");

            }
            System.out.println();
        }
        System.out.println("******************************************************************");

        for (i= 0; i < 5; i++) {
            for (j = 0; j < 7; j++) {
                if (array2[i][j] == array3[i][j]) {
                    System.out.print(i);
                    System.out.print(j+ " \t");


                    if (i!=4) {
                        String temp=array3[i][j];
                        array3[i][j] = array3[i+1][j];
                        array3[i+1][j] = temp;
                    }
                    else{
                        array3[4][j]="NULL";
                    }
                }
              //  System.out.print("\n");
            }
        }
        System.out.println();


        for (j = 0; j < 5; j++) {
            for (i = 0; i < 7; i++) {
                if (array2[j][i] == array3[j][i]) {
                    System.out.print(j);
                    System.out.print(i + " \t");
                   array3[j][i]="hello";

                }
            }
        }

        for (i = 0; i < 5; i++) {
            for (j = 0; j < 7; j++) {
                System.out.print(array3[i][j] + " \t");

            }
            System.out.println();
        }
        for (j = 0; j < 5; j++) {
            for (i = 0; i < 7; i++) {
                if (array2[j][i] == array3[j][i]) {
                    System.out.print(j);
                    System.out.print(i + " \t");
                   // array3[i][j]="hello";

                }
            }
        }
        System.out.println();
        for (j=0;j<5;j++) {
            for (i = 0; i < 7; i++) {
                if (array3[j][i] == "prof1") {
                    array3[j][i] = "TOC";
                } else if (array3[j][i] == "prof2") {
                    array3[j][i] = "SEPM";
                } else if (array3[j][i] == "prof3") {
                    array3[j][i] = "CN";
                } else if (array3[j][i] == "prof4") {
                    array3[j][i] = "ISEE";
                } else if (array3[j][i] == "prof5") {
                    array3[j][i] = "DBMS";
                }
            }
        }
        for (i = 0; i < 5; i++) {
            for (j = 0; j < 7; j++) {
                System.out.print(array3[i][j] + " \t");

            }
            System.out.println();
        }
    }
}


