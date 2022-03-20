package Package;

public class Computer {

    public int RAM;
    public int icore;
    public String brand;
    private long IdProduct;
    public String processor;
    protected String maker;
    public float operacionSuma;

    public Computer(){
    }

    public Computer(int RAM, int icore, String brand, long idProduct, String processor, String maker){
        this.RAM = RAM;
        this.icore = icore;
        this.brand = brand;
        this.IdProduct = IdProduct;
        this.processor = processor;
        this.maker = maker;
    }

    public void setRAM(){
        this.RAM = RAM;
    }

    public Integer getRAM(){
        return RAM;
    }

    public void setOperacionSuma(){
        this.operacionSuma = operacionSuma;
    }

    public Float getOperacionSuma(float sumando1, float sumando2){

        return operacionSuma = sumando1 + sumando2;
    }
    
}
