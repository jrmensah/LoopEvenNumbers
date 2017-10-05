public class LoopEvenNumbers {

    public static void main(String args[]) {
//        System.out.println("You are in the main method");
//
//        System.out.println("Calling the 'do while' method\n");
//        showDoWhile();
//
//        System.out.println("Calling the 'show while' method\n");
//        showWhile();

        System.out.println("Calling the 'do while' method\n");
        showFor();
    }


//    public static void showWhile() {
//        int counter = 2;
//
//        System.out.println("You are in the 'show while' loop method\n");
//        while (counter < 51) {
//            if (counter % 2 == 0) {
//                System.out.println(counter);
//            }
//            counter ++;
//        }
//    }
// public static void showDoWhile()
// {
//     int counter =2;
//
//     System.out.println("You are in the do while loop method\n");
//     do
//     {
//         System.out.print(counter);
//         counter ++;
//     }
//     while(counter<51);{
//         if(counter % 2 == 0 ){
//             System.out.println(counter);
//             counter ++;
//         }
//
//     }
//
// }
//}
 public static void showFor()
 {
     for(int counter=100; counter<=5000; counter+=2)
     if(counter%2==0) {
         System.out.println(counter);
     }else{
         System.out.println("Going through a for loop. The counter is at" +counter+"\n");
     }

 }
}



