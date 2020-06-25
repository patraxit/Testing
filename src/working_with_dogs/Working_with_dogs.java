    /*
     * To change this license header, choose License Headers in Project Properties.
     * To change this template file, choose Tools | Templates
     * and open the template in the editor.
     */
    package working_with_dogs;
    import java.util.Arrays;
    /**
     *hello how are you
     * @author Raxit Patel
     */
    public class Working_with_dogs {

        /**
         * @param args the command line arguments
         */
        public static void main(String[] args) {
           

            int[] arr = new int[100];
            Dogs obj[] = new Dogs[100];
            int obj1[] = new int[100];
            



            for(int i=0; i<100; i++){
        int x = (int) (Math.random()*6 + 2015);

            arr[i] = x;}



        
         for(int i=99; i>=0; i--){ 


    Dogs d1 = new Dogs("jack",arr[i],"German Shepherd");

obj[i] = new Dogs("jack",arr[i],"German Shepherd");
             System.out.println(d1.toString());

             System.out.println(obj[i].getAge());

         }


            for (int i = 0; i < 100; i++) {
                System.out.println(obj[i].toString());
            }

        }

        }


