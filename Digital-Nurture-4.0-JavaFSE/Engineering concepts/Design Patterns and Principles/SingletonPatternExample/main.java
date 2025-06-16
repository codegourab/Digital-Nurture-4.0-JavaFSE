class Logger {
    private static Logger obj;

    private Logger() {
        System.out.println("Logger constructor called");
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
        l1.log("first log msg");

        Logger l2 = Logger.getInst();
        l2.log("second log msg");

        if (l1 == l2) {
            System.out.println("same logger used");
        } else {
            System.out.println("diff logger used (error!)");
        }
    }
}
