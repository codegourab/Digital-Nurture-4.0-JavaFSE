public class Comp {
    String cpu;
    String ram;
    String storage;
    String gpu;
    String keyboard;
    String monitor;

    private Comp(Builder b) {
        this.cpu = b.cpu;
        this.ram = b.ram;
        this.storage = b.storage;
        this.gpu = b.gpu;
        this.keyboard = b.keyboard;
        this.monitor = b.monitor;
    }

    static class Builder {
        String cpu;
        String ram;
        String storage;
        String gpu;
        String keyboard;
        String monitor;

        Builder(String cpu, String ram) {
            this.cpu = cpu;
            this.ram = ram;
        }

        Builder setStorage(String s) {
            this.storage = s;
            return this;
        }

        Builder setGpu(String g) {
            this.gpu = g;
            return this;
        }

        Builder setKeyboard(String k) {
            this.keyboard = k;
            return this;
        }

        Builder setMonitor(String m) {
            this.monitor = m;
            return this;
        }

        Comp build() {
            return new Comp(this);
        }
    }

    public String toString() {
        return "Comp [cpu=" + cpu + ", ram=" + ram + ", storage=" + storage + ", gpu=" + gpu +
               ", keyboard=" + keyboard + ", monitor=" + monitor + "]";
    }
}
