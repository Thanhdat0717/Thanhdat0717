public class MainClass {
    public static void main(String[] args) {

        HinhTron hto = new HinhTron();
        hto.xuatten();
        hto.nhapbankinh();
        hto.tinhchuvi();
        hto.tinhdientich();
        hto.inchuvi();
        hto.indientich();

        HinhTru htu = new HinhTru();
        htu.xuatten();
        htu.nhapchieucao();
        htu.tinhdientich();
        htu.indientich();

        HinhChuNhat hcn = new HinhChuNhat();
        hcn.xuatten();
        hcn.nhapchieudai();
        hcn.nhapchieurong();
        hcn.tinhchuvi();
        hcn.tinhdientich();
        hcn.inchuvi();
        hcn.indientich();

        HinhVuong hv = new HinhVuong();
        hv.xuatten();
        hv.nhapcanh();
        hv.tinhchuvi();
        hv.tinhdientich();
        hv.inchuvi();
        hv.indientich();
    }
}
