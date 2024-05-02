package TugasPoli;

public class PegawaiHarian extends Pegawai{
    private double upahPerJam;
    private int jam;

    public PegawaiHarian(String name, String noKTP, double gaji, int jam){
        super(name, noKTP);
        setUpahPerJam(gaji);
        setJam(jam);
    }

    public double getUpahPerJam() {
        return upahPerJam;
    }

    public void setUpahPerJam(double upahPerJam) {
        this.upahPerJam = upahPerJam;
    }

    public double gaji(){
        double hasilGaji = 0;
        if (jam < 40) {
            hasilGaji = getUpahPerJam() * getJam();
            return  hasilGaji;
        } else {
            hasilGaji = 40 * getUpahPerJam();
        }
        return hasilGaji;
        
    } 

    public int getJam() {
        return jam;
    }

    public void setJam(int jam) {
        this.jam = jam;
    }

    public void print(){
        System.out.println();
        System.out.println("Pegawai Harian  : " + getName());
        System.out.println("No. KTP         : " + getNoKTP());
        System.out.println("Upah/jam        : Rp " + getUpahPerJam());
        System.out.println("Total Jam Kerja : " + getUpahPerJam());
        System.out.println("Pendapatan      : Rp " + (int) gaji());
        System.out.println();
    }
}
