public class main {
    public static void main(String[] args) {
        Comp basic = new Comp.Builder("i3", "4GB").build();

        Comp gaming = new Comp.Builder("i9", "32GB")
                            .setStorage("1TB SSD")
                            .setGpu("RTX 4080")
                            .setKeyboard("RGB KB")
                            .setMonitor("144Hz Monitor")
                            .build();

        Comp work = new Comp.Builder("i5", "8GB")
                            .setStorage("500GB HDD")
                            .setMonitor("1080p")
                            .build();

        System.out.println("Basic: " + basic);
        System.out.println("Gaming: " + gaming);
        System.out.println("Work: " + work);
    }
}
