package TugasPoli;

public class Sales extends Pegawai{
    private int penjualan;
    private double komisi;

    public Sales(String name, String noKTP, int penjualan, double komisi){
        super(name, noKTP);
        setPenjualan(penjualan);
        setKomisi(komisi);
    }

    public int getPenjualan() {
        return penjualan;
    }

    public void setPenjualan(int penjualan) {
        this.penjualan = penjualan;
    }

    public double getKomisi() {
        return komisi;
    }

    public void setKomisi(double komisi) {
        this.komisi = komisi;
    }

    public double gaji(){
        return getPenjualan() * getKomisi();
    } 

    public void print(){
        System.out.println();
        System.out.println("Sales           : " + getName());
        System.out.println("No. KTP         : " + getNoKTP());
        System.out.println("Total Penjualan : " + getPenjualan());
        System.out.println("Besaran Komisi  : " + getKomisi());
        System.out.println("Pendapatan      : Rp " + (int) gaji());
        System.out.println();
    }
}
