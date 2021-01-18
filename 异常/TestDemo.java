import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class TestDemo {
    public static void main(String[] args) {
        int []arr={1,2,3};
        System.out.println("before");
        try {
            System.out.println(arr[100]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
        }
        System.out.println("after");
    }
    }


