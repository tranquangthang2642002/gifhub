import java.util.ArrayList;

public class Main {


public static void main(String[] args) {
	ArrayList<Giao_Dich> gd01;
	ArrayList<Giao_Dich> gd02;
	ArrayList<Giao_Dich> gd03;
	
	
	Rut_Tien rt1= new Rut_Tien(1, 1, ct1, null, gt1, 100000);
	Rut_Tien rt2 = new Rut_Tien(2, 2, ct2, null, gt2, 3000);
	Rut_Tien rt3 = new Rut_Tien(3, 4, ct3, null, gd03, 4000);
	
	Chuyen_Tien ct1 =new Chuyen_Tien(1, 1, null, rt3, gt1 , 1245, 30000);
	Chuyen_Tien ct2 =new Chuyen_Tien(2, 2, null, rt2, gt2 , 12345, 10000);
	Chuyen_Tien ct3 =new Chuyen_Tien(3, 3, null, rt3, gd3, 123456, 1000);
	
	Gui_Tien gt1=new Gui_Tien(1, 1, ct3, rt1, null, 10000);
	Gui_Tien gt2=new Gui_Tien(1, 1, ct3, rt2, null, 10000);
	Gui_Tien gt3=new Gui_Tien(1, 1, ct3, rt3, null, 10000);
	
	Giao_Dich gd1=new Giao_Dich(1, 2, ct1, rt1, gt1);
	Giao_Dich gd2=new Giao_Dich(1, 2, ct2, rt2, gt2);
	Giao_Dich gd3=new Giao_Dich(1, 2, ct3, rt3, gt3);
	
	Tai_Khoan_Ngan_Hang tknh1= new Tai_Khoan_Ngan_Hang(12367, "Tran quang Thang", 10000000, "Binh Dinh", gd01);
	Tai_Khoan_Ngan_Hang tknh2= new Tai_Khoan_Ngan_Hang(12453, "Tran van  Quang", 50000000, "ha Noi", gd02);
	Tai_Khoan_Ngan_Hang tknh3= new Tai_Khoan_Ngan_Hang(12345, "Tran van  Cuong", 70000000, "Tp HCM", gd03);
	
	//3. them 1 giao dich vao tai khoan ngan hang
	tknh1.themDanhsach(gd2);
	tknh2.themDanhsach(gd3);
	tknh3.themDanhsach(gd1);
	
	//4. kiem tra  giao dich co rut tien tren 5000000 hay khong
	tknh1.kiem_Tra_Rut_Tien_va_Rut_tren_500000();
	
	
	
	
	
	//5.Kiem tra 2 giao dich co cung loai hay không
	
	tknh1.xem_danh_sach_co_giao_dich_chuyen_tien_den_tai_khoan_Hay_khong(gd1);
	tknh2.xem_danh_sach_co_giao_dich_chuyen_tien_den_tai_khoan_Hay_khong(gd2);
	tknh3.xem_danh_sach_co_giao_dich_chuyen_tien_den_tai_khoan_Hay_khong(gd3);
	
	//9.lay ra danh sach chuyen tien lon hon 2 trieu
	tknh1.lay_ra_danh_sach_chuyen_tien_hon_2tr();
	tknh2.lay_ra_danh_sach_chuyen_tien_hon_2tr();
	tknh3.lay_ra_danh_sach_chuyen_tien_hon_2tr();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
