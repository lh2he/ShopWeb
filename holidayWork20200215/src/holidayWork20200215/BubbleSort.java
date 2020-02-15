package holidayWork20200215;


public class BubbleSort {
    public static int[]sort(int[] array){
        for (int i = 1; i <array.length ; i++) {
            boolean flag=true;
            for (int j = 0; j <array.length-1 ; j++) {
                if(array[j]>array[j+1]){
                    int temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                    flag=false;
                }
            }
            System.out.println(flag);
            //如果为true，则说明排序已经提前完成
            if(flag){
                break;
            }
            System.out.println("第"+i+"轮排序后的结果为：");
            display(array);
        }
        return  array;
    }
    public static void display(int [] array){
        for(int i = 0 ; i < array.length ; i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] array = {4,2,8,9,5,7,6,3,1};
        //未排序数组顺序为
        System.out.println("未排序数组顺序为：");
        display(array);
        System.out.println("-----------------------");
        array = sort(array);
        System.out.println("-----------------------");
        System.out.println("经过冒泡排序后的数组顺序为：");
        display(array);
    }
}
 