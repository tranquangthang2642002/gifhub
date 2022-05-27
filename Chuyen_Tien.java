
public class Chuyen_Tien extends Giao_Dich{
private int so_Tai_Khoan_Nhan;
private int so_Luong_Chuyen;

public Chuyen_Tien(int ma_So, int ngay_Giao_Dich, Chuyen_Tien chuyen_tien, Rut_Tien rut_tien, Gui_Tien gui_tien,
		int so_Tai_Khoan_Nhan, int so_Luong_Chuyen) {
	super(ma_So, ngay_Giao_Dich, chuyen_tien, rut_tien, gui_tien);
	this.so_Tai_Khoan_Nhan = so_Tai_Khoan_Nhan;
	this.so_Luong_Chuyen = so_Luong_Chuyen;
}

public int getSo_Tai_Khoan_Nhan() {
	return so_Tai_Khoan_Nhan;
}
public void setSo_Tai_Khoan_Nhan(int so_Tai_Khoan_Nhan) {
	this.so_Tai_Khoan_Nhan = so_Tai_Khoan_Nhan;
}
public int getSo_Luong_Chuyen() {
	return so_Luong_Chuyen;
}
public void setSo_Luong_Chuyen(int so_Luong_Chuyen) {
	this.so_Luong_Chuyen = so_Luong_Chuyen;
}



}
