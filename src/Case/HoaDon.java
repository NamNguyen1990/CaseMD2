package Case;

public class HoaDon {
    private double tgVao;
    private double tgRa;
    private double tAnUong;
    private Phong phong;

    public HoaDon() {
    }

    public HoaDon(double tgVao, double tgRa, double tAnUong, Phong phong) {
        this.tgVao = tgVao;
        this.tgRa = tgRa;
        this.tAnUong = tAnUong;
        this.phong = phong;
    }

    public double getTgVao() {
        return tgVao;
    }

    public void setTgVao(double tgVao) {
        this.tgVao = tgVao;
    }

    public double getTgRa() {
        return tgRa;
    }

    public void setTgRa(double tgRa) {
        this.tgRa = tgRa;
    }

    public double gettAnUong() {
        return tAnUong;
    }

    public void settAnUong(double tAnUong) {
        this.tAnUong = tAnUong;
    }

    public Phong getPhong() {
        return phong;
    }

    public void setPhong(Phong phong) {
        this.phong = phong;
    }

    @Override
    public String toString() {
        return "HoaDon{" +
                "tgVao = " + tgVao +
                ", tgRa = " + tgRa +
                ", tAnUong = " + tAnUong +
                ", phong = " + phong.toString() +
                '}';
    }
}
