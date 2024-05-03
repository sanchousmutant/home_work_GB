public class Laptop {
    private String id;
    private String brand;
    private String screenDiagonal;
    private String cpu;
    private String os;
    private String hdd;
    private String ram;

    public Laptop(String id, String brand, String screenDiagonal, String cpu, String os, String hdd, String ram){
        this.id = id;
        this.brand = brand;
        this.screenDiagonal = screenDiagonal;
        this.cpu = cpu;
        this.os = os;
        this.hdd = hdd;
        this.ram = ram;
    }

    public String getId(){
        return id;
    }

    public String getScreenDiagonal(){
        return screenDiagonal;
    }

    public String getBrand(){
        return brand;
    }

    public String getCpu(){
        return cpu;
    }

    public String getOs(){
        return os;
    }

    public String getHdd(){
        return hdd;
    }

    public String getRam(){
        return ram;
    }
    public void setId(String id){
        this.id = id;
    }
    public String get(String value) {
        if (value.equals("id")) {
            return id;
        } else if (value.equals("brand")) {
            return brand;
        } else if (value.equals("screenDiagonal")) {
            return screenDiagonal;
        } else if (value.equals("cpu")) {
            return cpu;
        } else if (value.equals("os")) {
            return os;
        } else if (value.equals("hdd")) {
            return hdd;
        } else if (value.equals("ram")) {
            return ram;
        } else {
            return null;
        }
    }
    public void setScreenDiagonal(String screenDiagonal){
        this.screenDiagonal = screenDiagonal;
    }

    public void setBrand(String brand){
        this.brand = brand;
    }

    public void setCpu(String cpu){
        this.cpu = cpu;
    }

    public void setOs(String os){
        this.os = os;
    }

    public void setHdd(String hdd){
        this.hdd = hdd;
    }

    public void setRam(String ram){
        this.ram = ram;
    }

    @Override
    public String toString() {
        return id + " " + brand + " " + screenDiagonal +"\"" + " cpu:" + cpu + " ram:" + ram + " hdd:" + hdd + " os:" + os;
    }

}
