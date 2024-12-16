package com.training.forloop;

public class ForExampleTest {


//    int i = 2;
//    int i1 = 3;
//    int sum = i+i1;,.................;








 /**
    for(initialization;condition;increment/decrement)

    {
        //statement or code to be executed
    }
  */

    public static void main(String[] args) {

        int i3[] = {2,3,4,5,6,7,7};
        int sum = 0;
        for(int i=0 ; i < i3.length ; i++) {
            System.out.println(i3[i]);
            if(i == 5)
                continue;
            sum += i3[i];
            System.out.println(" after break "+i3[i]);
        }
        System.out.println(sum);

//1, 1
//1 ,2
//1 ,3
//2,1

        //loop of i
       /* for(int i=1;i<=3;i++){
        //loop of j
            for(int j=1;j<=3;j++){
                System.out.println(i+" "+j);
            }//end  j
        }//end i*/

        /*for(int i=1;i<=5;i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println(i);
//            System.out.println("Pyramid Structure");//new line
        }*/
        /* for(;;){
            System.out.println("infinitive loop");
        }*/

      /*  for(int i=1 ; i<=10 ; ++i) {
            if(i == 5) {
                continue;
            }
            System.out.println("continue : "+i);

        }*/
    }
}
