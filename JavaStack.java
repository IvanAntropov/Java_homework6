public class Program {
    public static void main(String[] args) {
        MyStack a = new MyStack();

        a.push(1);
        a.push(2);
        a.push(3);
        a.push(4);
        a.push(5);
        System.out.println(a.pop());//5
        System.out.println(a.pop());//4
        a.push(6);
        a.push(7);
        a.push(8);
        System.out.println(a.pop());//8
        System.out.println(a.pop());//7
        System.out.println(a.pop());//6
//        System.out.println(a.pop());//5
//        System.out.println(a.pop());//4
        System.out.println(a.pop());//3
        System.out.println(a.pop());//2
        System.out.println(a.pop());//1
        System.out.println(a.pop());//Пусто
 }
}

class MyStack{
    private int index = 0;
    private int[] value = new int[5];
    public void push(int val){
        if(index == value.length){
            value = increaseArr(value,value.length);
        }
            value[index] = val;
            index++;
        
    }
    public Object pop(){
        if(index==0){
            System.out.println("Stack пуст");
            return "Stack пуст";
        }else{
            int temp = value[index-1];
            index--;
            value = reduceArr(value,value.length);
            return temp;
        }
        
    }
    private int[] increaseArr(int[] oldArr,int temp){
        int[] newArr = new int[temp+1];
        for(int i = 0; i < oldArr.length; i++){
            newArr[i] = oldArr[i];
        }
        return newArr;
    }
    private int[] reduceArr(int[] oldArr,int temp){
        int[] newArr = new int[temp-1];
        for(int i = 0; i < newArr.length; i++){
            newArr[i] = oldArr[i];
        }
        return newArr;
    }
}