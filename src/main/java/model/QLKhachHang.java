package model;

import java.util.ArrayList;
import util.FileHelper;

/*
  Tác giả: Nguyen Xuan Truong
 */
public class QLKhachHang {

    private ArrayList<KhachHang> dsKhachHang;

    public QLKhachHang() {
        dsKhachHang = new ArrayList<>();
    }

    public QLKhachHang(ArrayList<KhachHang> dsKhachHang) {
        this.dsKhachHang = dsKhachHang;
    }

    public ArrayList<KhachHang> getDsKhachHang() {
        return dsKhachHang;
    }

    public void setDsKhachHang(ArrayList<KhachHang> dsKhachHang) {
        this.dsKhachHang = dsKhachHang;
    }

    //sinh viên cải đặt cho các phương thức xử lý sau
    public void DocKhachHang(String filename) {
        ArrayList<String> data = FileHelper.readFileText("input.txt"); //doc file
        dsKhachHang.clear();
        for (String item : data) {
            String[] arr = item.split(";");
            KhachHang kh = new KhachHang();
            kh.setMaso(arr[0]);
            kh.setHoten(arr[1]);
            kh.setLoai(Integer.parseInt(arr[2]));
            kh.setChisomoi(Double.parseDouble(arr[3]));
            kh.setChisocu(Double.parseDouble(arr[4]));
            dsKhachHang.add(kh);
        }
    }

    public boolean GhiHoaDon(String filename) {

        return true;
    }

    public void sapXepTheoLoaiHinh() {

    }

    public double getTieuThuCaoNhat() {
        return 0;
    }

    public double getTieuThuThapNhat() {
        return 0;
    }

    public double getTieuThuTrungBinh() {
        return 0;
    }
}
