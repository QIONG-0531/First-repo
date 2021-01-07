import com.sun.org.apache.xml.internal.dtm.ref.DTMDefaultBaseIterators;

import java.util.Arrays;

public class MyArrayList {
    public int[]elem=new int[10];
    public int usedSize=0;
    public MyArrayList(){
        this.elem=new int[5];
    }
    public MyArrayList(int n){
        this.elem=new int[n];
    }
    //打印顺序表
    public void display(){
        for(int i=0;i<this.usedSize;i++){
            System.out.print(this.elem[i]+" ");
        }
        System.out.println();
    }
    //扩大顺序表
    public void resize(){
        this.elem= Arrays.copyOf(elem,2*elem.length);
    }
    //在pos位置新增元素
    public void add(int pos,int data){
        if(this.usedSize==this.elem.length){
            resize();
        }
        if(pos<0||pos>this.usedSize){
            System.out.println("位置不合法");
            return;
        }
        for(int i=this.usedSize-1;i>=pos;i--){
            elem[i+1]=elem[i];
        }
        elem[pos]=data;
        this.usedSize++;
    }
    //判定是否包含某个元素
    public boolean contains(int toFind){
        for(int i=0;i<this.usedSize;i++){
            if(elem[i]==toFind){
                return true;
            }
        }
        return false;
    }
    //查找某个元素对应的位置
    public int search(int toFind){
        for(int i=0;i<this.usedSize;i++){
            if(this.elem[i]==toFind){
                return i;
            }
        }
        return -1;
    }
    //获取pos位置的元素
    public int getPos(int pos){
        if(pos<0||pos>=this.usedSize){
            System.out.println("pos位置不合法");
            return -1;
        }
        return this.elem[pos];
    }
    //给pos位置的元素设为value
    public void setPos(int pos,int value){
        if(pos<0||pos>=this.usedSize){
            System.out.println("pos位置不合法");
           return;
        }
        this.elem[pos]=value;
    }
    //删除第一次出现的关键字key
    public void remove(int key){
        int index=search(key);
        if(index==-1){
            return;
        }
        for(int i=index;i<this.usedSize-1;i++){
            elem[i]=elem[i+1];
        }
        this.usedSize--;
    }
    //获取顺序表长度
    public int size(){
        return this.usedSize;
    }
    //清空顺序表
    public void clear(){
        this.usedSize=0;
    }

}
