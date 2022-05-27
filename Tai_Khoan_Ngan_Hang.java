import java.util.ArrayList;

public class Tai_Khoan_Ngan_Hang {
private int so_tai_Khoan;
private String chu_Tai_Khoan;
private int so_Du;
private String chi_Nhanh;
private ArrayList<Giao_Dich> danhsachgiaodich = new ArrayList<Giao_Dich>();

public Tai_Khoan_Ngan_Hang(int so_tai_Khoan, String chu_Tai_Khoan, int so_Du, String chi_Nhanh,
		ArrayList<Giao_Dich> danhsachgiaodich) {
	super();
	this.so_tai_Khoan = so_tai_Khoan;
	this.chu_Tai_Khoan = chu_Tai_Khoan;
	this.so_Du = so_Du;
	this.chi_Nhanh = chi_Nhanh;
	this.danhsachgiaodich = danhsachgiaodich;
}
public int getSo_tai_Khoan() {
	return so_tai_Khoan;
}
public void setSo_tai_Khoan(int so_tai_Khoan) {
	this.so_tai_Khoan = so_tai_Khoan;
}
public String getChu_Tai_Khoan() {
	return chu_Tai_Khoan;
}
public void setChu_Tai_Khoan(String chu_Tai_Khoan) {
	this.chu_Tai_Khoan = chu_Tai_Khoan;
}
public int getSo_Du() {
	return so_Du;
}
public void setSo_Du(int so_Du) {
	this.so_Du = so_Du;
}
public String getChi_Nhanh() {
	return chi_Nhanh;
}
public void setChi_Nhanh(String chi_Nhanh) {
	this.chi_Nhanh = chi_Nhanh;
}
public ArrayList<Giao_Dich> getDanhsachgiaodich() {
	return danhsachgiaodich;
}
public void setDanhsachgiaodich(ArrayList<Giao_Dich> danhsachgiaodich) {
	this.danhsachgiaodich = danhsachgiaodich;
}

//3.Phuowng thuc them 1 giao dich vao danh sach
public void themDanhsach(Giao_Dich giaodich) {
	this.danhsachgiaodich.add(giaodich);
}

//7.tìm giao dich có so luong rut lon nhảt
public int giao_dich_rut_tien_lon_nhat() {
	int max;
	for(int i=0; i<this.danhsachgiaodich.size();i++) {
		if(this.danhsachgiaodich.get(i).getRut_tien() < max) {
			System.out.println("tông tien chuyen lon nhat:");
			max++;
			
		}else {
			return max;
		}
	}
}
//9.Lấy ra danh sách chuyen tien lon hơn 2 tr
public void lay_ra_danh_sach_chuyen_tien_hon_2tr() {
	for(int i= 0; i< this.danhsachgiaodich.size();i++) {
		System.out.println(this.danhsachgiaodich.get(i).getChuyen_tien() > 2000000);
	}
}



}


