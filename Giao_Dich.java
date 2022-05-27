import java.util.Objects;

public class Giao_Dich {
private int ma_So;
private int ngay_Giao_Dich;
private Chuyen_Tien chuyen_tien;
private Rut_Tien rut_tien;
private Gui_Tien gui_tien;
public Giao_Dich(int ma_So, int ngay_Giao_Dich, Chuyen_Tien chuyen_tien, Rut_Tien rut_tien, Gui_Tien gui_tien) {
	super();
	this.ma_So = ma_So;
	this.ngay_Giao_Dich = ngay_Giao_Dich;
	this.chuyen_tien = chuyen_tien;
	this.rut_tien = rut_tien;
	this.gui_tien = gui_tien;
}
public int getMa_So() {
	return ma_So;
}
public void setMa_So(int ma_So) {
	this.ma_So = ma_So;
}
public int getNgay_Giao_Dich() {
	return ngay_Giao_Dich;
}
public void setNgay_Giao_Dich(int ngay_Giao_Dich) {
	this.ngay_Giao_Dich = ngay_Giao_Dich;
}
public Chuyen_Tien getChuyen_tien() {
	return chuyen_tien;
}
public void setChuyen_tien(Chuyen_Tien chuyen_tien) {
	this.chuyen_tien = chuyen_tien;
}
public Rut_Tien getRut_tien() {
	return rut_tien;
}
public void setRut_tien(Rut_Tien rut_tien) {
	this.rut_tien = rut_tien;
}
public Gui_Tien getGui_tien() {
	return gui_tien;
}
public void setGui_tien(Gui_Tien gui_tien) {
	this.gui_tien = gui_tien;
}

@Override
public int hashCode() {
	return Objects.hash(chuyen_tien, gui_tien, ma_So, ngay_Giao_Dich, rut_tien);
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Giao_Dich other = (Giao_Dich) obj;
	return Objects.equals(chuyen_tien, other.chuyen_tien) && Objects.equals(gui_tien, other.gui_tien)
			&& ma_So == other.ma_So && ngay_Giao_Dich == other.ngay_Giao_Dich
			&& Objects.equals(rut_tien, other.rut_tien);
}
public boolean kiem_Tra_Rut_Tien_va_Rut_tren_500000( Giao_Dich giao_dich){
     if ((this.rut_tien.getRut_tien().getSo_Luong_Rut())&&(this.rut_tien.getRut_tien().getSo_Luong_Rut()>5000000){;
     return true;
     }
     return false;
}

//8.Tìm xem trong danh sách các giao dịch có giao dịch chuyển tiền đến số tài khoản cho trước hay không?
public void xem_danh_sach_co_giao_dich_chuyen_tien_den_tai_khoan_Hay_khong(Tai_Khoan_Ngan_Hang tai_khoan_ngan_hang) {
	for(int i =0; i< this.danhsachgiaodich.size();i++) {
		if(this.danhsachgiaodich.get(i).getChuyen_tien()== tknh2.danhsachgiaodich.get(i).getChuyen_tien()) {
			System.out.println("Giao dich dã chuyen tien den ngan hang da cho");
		}else {
			System.out.println("giao dich khong chuyen tien den ngan hang da cho");
		}
	}
}
}
