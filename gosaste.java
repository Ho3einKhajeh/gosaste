package exeercise.gosaste_project;
import java.util.Arrays;
import java.util.Scanner;
import javax.swing.JOptionPane;
public class gosaste {
    Scanner input = new Scanner(System.in);
    int len;
    int[][] array1 = new int[len][len];
    int[][] array2 = new int[len][len];
//    =================make array
    public int[][] makeArray(){
//        System.out.println("مقادیر را وارد کنید:    ");
        int[][] array = new int[len][len];
        int c = 1;
        for (int i = 0 ; i<len;i++){
            for (int j = 0 ; j<len;j++){
                System.out.printf("مقدار %d را وارد کنید:   ",c);
                array[i][j]=input.nextInt();
//                array[i][j]= Integer.parseInt(JOptionPane.showInputDialog("مقدار  را وارد کنید:   "));
                c++;
            }
        }
        System.out.println("=======================");
        return array;
    }
//    =========================ejtema function
    public void ejtema() {
        int[][] array3 = new int[len][len];
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                if (array1[i][j] == 1 | array2[i][j] == 1) {
                    array3[i][j] = 1;
                } else {
                    array3[i][j] = 0;
                }
            }
        }
        System.out.println("اجتماع آرایه 1 و آرایه 2 را وارد کنید:    ");
//        System.out.println(Arrays.deepToString(array3));
        showArray(array3);
        System.out.println("=======================");
    }
//    ====================eshterak function
    public void eshterak() {
        int[][] array3 = new int[len][len];
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                if (array1[i][j] == 1 && array2[i][j] == 1) {
                    array3[i][j] = 1;
                } else {
                    array3[i][j] = 0;
                }
            }
        }
        System.out.println("اشتراک آرایه 1 و آرایه 2 را وارد کنید:     ");
//        System.out.println(Arrays.deepToString(array3));
        showArray(array3);
        System.out.println("=======================");
    }
//==========================gharine
    public void gharine(int[][] array) {
        int[][] array3 = new int[len][len];
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                if (array[i][j] == 0) {
                    array3[i][j] = 1;
                } else {
                    array3[i][j] = 0;
                }
            }

        }
        System.out.println("قرینه آرایه مورد نظر برابر است با :      ");
//        System.out.println(Arrays.deepToString(array3));
        showArray(array3);
        System.out.println("=======================");
    }
//    ==================================show array
    public void showArray(int[][] Array){
        for (int[] ints : Array) {
            System.out.println(Arrays.toString(ints));
        }
    }
//    =========================constractor
    public gosaste(){
        System.out.println("تعداد سطر و ستون را وارد کنید:       ");
        this.len = input.nextInt();
        this.array1 =new  int[len][len];
        System.out.println("=======================");
        int c = 1;
        for (int i = 0 ; i<len;i++){
            for (int j = 0 ; j<len;j++){
                System.out.printf("مقدار %d را وارد کنید:   ",c);
                this.array1[i][j]=input.nextInt();
                c++;
            }
        }
        System.out.println("=======================");
        int c2 = 1;
        this.array2 =new  int[len][len];
        for (int i = 0 ; i<len;i++){
            for (int j = 0 ; j<len;j++){
                System.out.printf("مقدار %d را وارد کنید:   ",c2);
                this.array2[i][j]=input.nextInt();
                c2++;
            }
        }
    }
//    ==========================zarbAtoB   function
    public void zarbAtB(){
        int ra = array1.length;
        int ca = array1[0].length;
        int cb = array2[0].length;
        int[][] result = new int[len][len];
        for (int i = 0 ; i<ra;i++){
            for (int j = 0; j<cb;j++){
                for (int k = 0;k<ca;k++){
                    result[i][j] += array1[i][j] * array2[k][j];
                }
            }
        }
        showArray(result);
    }
//    ===============================zarbBtoA function
public void zarbBtA(){
    int ra = array2.length;
    int ca = array2[0].length;
    int cb = array1[0].length;
    int[][] result = new int[len][len];
    for (int i = 0 ; i<ra;i++){
        for (int j = 0; j<cb;j++){
            for (int k = 0;k<ca;k++){
                result[i][j] += array2[i][j] * array1[k][j];
            }
        }
    }
    showArray(result);
}
//    =========================sum function
public void sum(){
    int[][] Array = new int[len][len];
    for (int i = 0 ; i<len;i++){
        for (int j = 0 ; j<len;j++){
            Array[i][j] = array1[i][j]+array2[i][j];
        }
    }
    showArray(Array);
}
//    ========================last function
    public void last(){
        String x = "بله";
        input.nextLine();
        do {
            System.out.printf("حالت مورد نظر را وارد کنید: (  اجتماع  /  اشتراک   /  قرینه  /%n  جمع  /  ضرب1*2  /  ضرب2*1  )%n");

            String s = input.nextLine();
            switch (s){
                case "اجتماع":
                    ejtema();
                    break;
                case "اشتراک" :
                    eshterak();
                    break;
                case "قرینه":
                    System.out.println("قرینه آرایه 1 برابر است با:       ");
                    gharine(array1);
                    System.out.println("===========================");
                    System.out.println("قرینه آرایه 2 برابر است با:       ");
                    gharine(array2);
                    break;
                case "ضرب1*2":
                    System.out.println("ضرب A در B برابر است با:         ");
                    zarbAtB();
                    break;
                case "جمع":
                    System.out.println("مجموع دو آرایه برابر است با:     ");
                    sum();
                    System.out.println("===========================");
                    break;
                case "ضرب2*1":
                    System.out.println("ضربB  در A برابر است با:         ");
                    zarbBtA();
                    break;
            }
            System.out.println("آیا میخواهید ادامه دهید؟  (بله    /   خیر  )");
            x = input.nextLine();
        }while (!x.equals("خیر"));

    }
}