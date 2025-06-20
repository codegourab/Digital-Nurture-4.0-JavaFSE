class Logger {
    private static Logger obj;

    private Logger() {
        System.out.println("Logger constructor is called");
    }

    public static Logger getInst() {
        if (obj == null) {
            obj = new Logger();
        }
        return obj;
    }

    public void log(String msg) {
        System.out.println(">> " + msg);
    }
}

public class main {
    public static void main(String[] args) {
        Logger l1 = Logger.getInst();
        l1.log("here is first log msg");

        Logger l2 = Logger.getInst();
        l2.log("here is second log msg");

        if (l1 == l2) {
            System.out.println("same logger is used here");
        } else {
            System.out.println("diff logger is used herre (error!)");
        }
    }
}
