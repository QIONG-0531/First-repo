public class foo {
    /*public static void main(String sgf[]) {
        StringBuffer a=new StringBuffer("A");
        StringBuffer b=new StringBuffer("B");
        operate(a,b);
        System.out.println(a+"."+b);
    }
    static void operate(StringBuffer x,StringBuffer y) {
        x.append(y);
        y=x;
    }*/
    void waitForSignal()
    {
        Object obj = new Object();
        synchronized(obj)
        {
            try {
                obj.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            obj.notify();
        }
    }

}

