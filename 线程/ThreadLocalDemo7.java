package thread;

public class ThreadLocalDemo7 {
    //ThreadLocal能够进行线程级别的数据传递
    private static ThreadLocal<User> userThreadLocal=new ThreadLocal();
    static class User{
        private String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
    static class Storage{
        public void printUsername(){
            User user=userThreadLocal.get();
            System.out.println(user.getName());
        }
    }
    static class Storage2{
        public void printUsername(){
            User user=userThreadLocal.get();
            System.out.println(user.getName());
        }
    }

    public static void main(String[] args) {
        Storage storage=new Storage();
        Storage2 storage2=new Storage2();
        Thread t1=new Thread(new Runnable() {
            @Override
            public void run() {
                User user=new User();
                user.setName("比特");
                userThreadLocal.set(user);
                storage.printUsername();
                storage2.printUsername();
            }
        });
        t1.start();
    }
}
