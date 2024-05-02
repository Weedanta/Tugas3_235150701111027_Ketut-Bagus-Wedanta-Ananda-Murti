package TugasPoli;

public class PegawaiTetap extends Pegawai{
    private double upah; // gaji bulanan

    public PegawaiTetap(String name, String noKTP, double gaji){
        super(name, noKTP);
        setGajiBulanan(gaji);
    }
    
    public void setGajiBulanan(double upah) {
        this.upah = upah;
    }

    public double getGajiBulanan() {
        return upah;
    }

    public double gaji(){
        return getGajiBulanan();
    } 

    public void print(){
        System.out.println();
        System.out.println("Pegawai Tetap   : " + getName());
        System.out.println("No. KTP         : " + getNoKTP());
        System.out.println("Upah            : " + getGajiBulanan());
        System.out.println("Pendapatan      : Rp " + (int) getGajiBulanan());
        System.out.println();
    }
}
