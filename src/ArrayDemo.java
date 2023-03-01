
/*
1D Array
2D Array
Jagged Array
Enhanced for loop

 */

public class ArrayDemo {
    public static void main(String[] args) {


       /* //1D array
        // int nu[]={8,18,28,38};
        int num[] = new int[4];
        num [0]=8;
        num [1]=18;
        num [2]=28;
        num [3]=38;

        for(int i=0; i<4; i++)
        System.out.println(num[i]);

        int a[] = {1,2,3,4};
        int b[] = {2,4,6,8};
        int c[] = {5,6,7,8};*/

        //2D Array
        int d[][] =
                {
                        {1, 2, 3, 4},
                        {2, 6, 8},      //Jagged Array ( Different number of colom not same number of colomn
                        {5, 6, 7, 8, 90}

                };
/*
        for (int i=0; i<3; i++){    //row
            for (int j=0; j<4; j++){    //column
                System.out.print(" "+d[i][j]);
            }
            System.out.println();
        */

       /* for (int i = 0; i < d.length; i++) {    //row
            for (int j = 0; j < d[i].length; j++) {    //column
                System.out.print(" " + d[i][j]);
            }
            System.out.println();

        }
*/
        //enhanced loop for 2D
        for (int k[] : d){
            for (int l : k ){
                System.out.print(" " +l);
            }
            System.out.println();
        }


 //    int a []={1,2,3,4};       //For Loop
//      for (int i=0; i<4; i++)
//      {
//          System.out.println(a[i]);
//      }

     /* for (int k : a){      //Enhanced For Loop
          System.out.println(k);
      }*/
    }
}
